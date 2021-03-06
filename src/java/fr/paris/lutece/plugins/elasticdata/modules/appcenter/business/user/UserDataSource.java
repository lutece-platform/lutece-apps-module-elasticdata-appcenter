/*
 * Copyright (c) 2002-2019, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */

package fr.paris.lutece.plugins.elasticdata.modules.appcenter.business.user;

import fr.paris.lutece.plugins.appcenter.business.Application;
import fr.paris.lutece.plugins.appcenter.business.ApplicationHome;
import fr.paris.lutece.plugins.appcenter.business.RoleHome;
import fr.paris.lutece.plugins.appcenter.business.User;
import fr.paris.lutece.plugins.appcenter.business.UserApplicationRole;
import fr.paris.lutece.plugins.appcenter.business.UserApplicationRoleHome;
import fr.paris.lutece.plugins.appcenter.business.UserHome;
import fr.paris.lutece.plugins.elasticdata.business.AbstractDataSource;
import fr.paris.lutece.plugins.elasticdata.business.DataObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * UserDataSource
 */
public class UserDataSource extends AbstractDataSource
{

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection fetchDataObjects( )
    {
        Collection<DataObject> collResult = new ArrayList<>( );
        List<User> listUsers = UserHome.getUsersList( );

        for (User user : listUsers)
        {
            UserObject userDataObject = new UserObject( );
            userDataObject.setIdUserFront( user.getId( ) );

            List<UserApplicationRole> listUserApplicationRoles = UserApplicationRoleHome.getUserApplicationRolesListByIdUser( user.getId( ) );
            List<ApplicationRole> listApplicationRoles = new ArrayList<>( );
            for (UserApplicationRole userApplicationRole : listUserApplicationRoles)
            {
                ApplicationRole applicationRole = new ApplicationRole( );
                applicationRole.setIdRole( userApplicationRole.getIdRole( ) );
                applicationRole.setLabelRole( RoleHome.findByPrimaryKey( userApplicationRole.getIdRole( ) ).getLabel( ) );
                applicationRole.setIdApplication( userApplicationRole.getIdApplication( ) );
                Application application = ApplicationHome.findByPrimaryKey( userApplicationRole.getIdApplication( ) );
                if ( application != null )
                {
                    applicationRole.setCodeApplication( application.getCode( ) );
                    applicationRole.setNameApplication( application.getName( ) );
                }
                listApplicationRoles.add( applicationRole );
            }

            userDataObject.setListApplicationRoles( listApplicationRoles );

            collResult.add( userDataObject );
        }

        return collResult;
    }
}
