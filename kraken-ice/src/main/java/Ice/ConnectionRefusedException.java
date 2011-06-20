// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Ice;

// <auto-generated>
//
// Generated from file `LocalException.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * This exception indicates a connection failure for which
 * the server host actively refuses a connection.
 * 
 **/
public class ConnectionRefusedException extends ConnectFailedException
{
    public ConnectionRefusedException()
    {
        super();
    }

    public ConnectionRefusedException(int error)
    {
        super(error);
    }

    public String
    ice_name()
    {
        return "Ice::ConnectionRefusedException";
    }
}
