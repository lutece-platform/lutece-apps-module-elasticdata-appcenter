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

package fr.paris.lutece.plugins.elasticdata.modules.appcenter.business.action;

import fr.paris.lutece.plugins.elasticdata.modules.appcenter.business.action.*;
import fr.paris.lutece.plugins.appcenter.business.ApplicationHome;
import fr.paris.lutece.plugins.appcenter.business.Environment;
import fr.paris.lutece.plugins.appcenter.modules.fastdeployapplication.business.fastaction.ActionHistory;
import fr.paris.lutece.plugins.appcenter.modules.fastdeployapplication.business.fastaction.ActionHistoryHome;
import fr.paris.lutece.plugins.elasticdata.business.AbstractDataSource;
import fr.paris.lutece.plugins.elasticdata.business.DataObject;
import fr.paris.lutece.portal.service.i18n.I18nService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * ActionDataSource
 */
public class ActionDataSource extends AbstractDataSource
{

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection fetchDataObjects( )
    {
        Collection<DataObject> collResult = new ArrayList<>( );
        List<ActionHistory> listActionHistorys = ActionHistoryHome.getActionHistorysList( );

        for (ActionHistory actionHistory : listActionHistorys)
        {
            ActionObject actionDataObject = new ActionObject( );
            actionDataObject.setCode( actionHistory.getCode( ) );
            actionDataObject.setLabel( I18nService.getLocalizedString( actionHistory.getI18nKeyName( ), Locale.getDefault( ) ) );
            actionDataObject.setIdApplication( actionHistory.getIdApplication( ) );
            actionDataObject.setCodeApplication( ApplicationHome.findByPrimaryKey( actionHistory.getIdApplication( ) ).getCode( ) );
            actionDataObject.setNameApplication( ApplicationHome.findByPrimaryKey( actionHistory.getIdApplication( ) ).getName( ) );
            actionDataObject.setServerType( actionHistory.getServerType( ) );
            actionDataObject.setServerCode( actionHistory.getServerCode( ) );
            actionDataObject.setServerName( actionHistory.getServerName( ) );
            actionDataObject.setIdUserFront( actionHistory.getIdUserFront( ) );
            actionDataObject.setPrefixEnvironment( actionHistory.getCodeEnvironment( ) );
            actionDataObject.setLabelEnvironment( Environment.getEnvironment( actionHistory.getCodeEnvironment( ) ).getLabel( ) );
            actionDataObject.setStatus( actionHistory.getStatus( ) );
            actionDataObject.setTimestamp( actionHistory.getCreationDate( ).getTime( ) );
            actionDataObject.setTimestampCreation( actionHistory.getCreationDate( ).getTime( ) );

            collResult.add( actionDataObject );
        }

        return collResult;
    }
}
