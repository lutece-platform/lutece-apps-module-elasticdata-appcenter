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


/**
 * This is the business class for the object ApplicationRole
 */
public class ApplicationRole
{
    private int _nIdRole;
    private String _strLabelRole;
    private int _nIdApplication;
    private String _strCodeApplication;
    private String _strNameApplication;
    private String _strIdUser;


    /**
     * Returns the IdRole
     * @return The IdRole
     */
    public int getIdRole( )
    {
        return _nIdRole;
    }

    /**
     * Sets the IdRole
     * @param nIdRole The IdRole
     */
    public void setIdRole( int nIdRole )
    {
        _nIdRole = nIdRole;
    }

    /**
     * Get the role label
     * @return the role label of the user
     */
    public String getLabelRole()
    {
        return _strLabelRole;
    }

    /**
     * Set the role label of the user
     * @param strLabelRole the role label of the user
     */
    public void setLabelRole( String strLabelRole )
    {
        _strLabelRole = strLabelRole;
    }

    /**
     * Returns the IdApplication
     * @return The IdApplication
     */
    public int getIdApplication( )
    {
        return _nIdApplication;
    }

    /**
     * Sets the IdApplication
     * @param nIdApplication The IdApplication
     */
    public void setIdApplication( int nIdApplication )
    {
        _nIdApplication = nIdApplication;
    }

    /**
     * Returns the application code
     *
     * @return The application code
     */
    public String getCodeApplication( )
    {
        return _strCodeApplication;
    }

    /**
     * Set the application code
     * 
     * @param strCodeApplication
     *            the application code
     */
    public void setCodeApplication( String strCodeApplication )
    {
        _strCodeApplication = strCodeApplication;
    }

    /**
     * Returns the application name
     *
     * @return The application name
     */
    public String getNameApplication( )
    {
        return _strNameApplication;
    }

    /**
     * Set the application name
     * 
     * @param strNameApplication
     *            the application name
     */
    public void setNameApplication( String strNameApplication )
    {
        _strNameApplication = strNameApplication;
    }
}
