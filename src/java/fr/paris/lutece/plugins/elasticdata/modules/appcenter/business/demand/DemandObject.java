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

package fr.paris.lutece.plugins.elasticdata.modules.appcenter.business.demand;

import fr.paris.lutece.plugins.appcenter.business.Environment;
import fr.paris.lutece.plugins.elasticdata.business.AbstractDataObject;

/**
 * DemandObject
 */
public class DemandObject extends AbstractDataObject
{
    private String _strDemandType;
    private String _strIdDemandType;
    private String _strLabelDemandType;
    private int _nIdApplication;
    private String _strCodeApplication;
    private String _strNameApplication;
    private String _strIdUserFront;
    private String _strPrefixEnvironment;
    private String _strLabelEnvironment;
    private boolean _bIsClosed;
    private long _lTimestampCreation;
    private long _lTimestampLastUpdate;

    /**
     * Returns the demand type
     *
     * @return The demand type
     */
    public String getDemandType( )
    {
        return _strDemandType;
    }

    /**
     * Set the demand type
     * 
     * @param strDemandType
     */
    public void setDemandType( String strDemandType )
    {
        _strDemandType = strDemandType;
    }

    /**
     * Returns the demand type Id
     *
     * @return The demand type Id
     */
    public String getIdDemandType( )
    {
        return _strIdDemandType;
    }

    /**
     * Set the demand type id
     * 
     * @param strIdDemandType
     *            the demand type id
     */
    public void setIdDemandType( String strIdDemandType )
    {
        _strIdDemandType = strIdDemandType;
    }

    /**
     * Returns the demand type label
     *
     * @return The demand type label
     */
    public String getLabelDemandType( )
    {
        return _strLabelDemandType;
    }

    /**
     * Set the demand type label
     * 
     * @param strLabelDemandType
     *            the demand type label
     */
    public void setLabelDemandType( String strLabelDemandType )
    {
        _strLabelDemandType = strLabelDemandType;
    }

    /**
     * Returns the application Id
     *
     * @return The application Id
     */
    public int getIdApplication( )
    {
        return _nIdApplication;
    }

    /**
     * Set the application id
     * 
     * @param nIdApplication
     *            the application id
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

    /**
     * Returns the front user Id
     *
     * @return The front user Id
     */
    public String getIdUserFront( )
    {
        return _strIdUserFront;
    }

    /**
     * Set the front user id
     * 
     * @param strIdUserFront
     *            the front user id
     */
    public void setIdUserFront( String strIdUserFront )
    {
        _strIdUserFront = strIdUserFront;
    }

    /**
     * Get the environment prefix
     * @return the environment prefix of the demand
     */
    public String getPrefixEnvironment()
    {
        return _strPrefixEnvironment;
    }

    /**
     * Set the environment prefix of the demand
     * @param strPrefixEnvironment the environment prefix of the demand
     */
    public void setPrefixEnvironment( String strPrefixEnvironment )
    {
        _strPrefixEnvironment = strPrefixEnvironment;
    }

    /**
     * Get the environment label
     * @return the environment label of the demand
     */
    public String getLabelEnvironment()
    {
        return _strLabelEnvironment;
    }

    /**
     * Set the environment label of the demand
     * @param strLabelEnvironment the environment label of the demand
     */
    public void setLabelEnvironment( String strLabelEnvironment )
    {
        _strLabelEnvironment = strLabelEnvironment;
    }

    /**
     * Return the is closed boolean
     * @return the is closed boolean
     */
    public boolean isClosed()
    {
        return _bIsClosed;
    }

    /**
     * Set the Is Closed boolean
     * @param bIsClosed 
     */
    public void setIsClosed( boolean bIsClosed )
    {
        _bIsClosed = bIsClosed;
    }

    /**
     * Get the timestamp of the creation of the demand
     * @return The timestamp of the creation of the demand
     */
    public long getTimestampCreation( ) 
    {
        return _lTimestampCreation;
    }

    /**
     * Set the timestamp of the creation of the demand
     * 
     * @param lTimestampCreation
     */
    public void setTimestampCreation( long lTimestampCreation )
    {
        _lTimestampCreation = lTimestampCreation;
    }

    /**
     * Get the timestamp of the last update of the demand
     * @return The timestamp of the last update of the demand
     */
    public long getTimestampLastUpdate( ) 
    {
        return _lTimestampLastUpdate;
    }

    /**
     * Set the timestamp of the last update of the demand
     * 
     * @param lTimestampLastUpdate
     */
    public void setTimestampLastUpdate( long lTimestampLastUpdate )
    {
        _lTimestampLastUpdate = lTimestampLastUpdate;
    }
}
