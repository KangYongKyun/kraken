// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package IceBox;

// <auto-generated>
//
// Generated from file `IceBox.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * This exception is thrown if an attempt is made to stop an
 * already-stopped service.
 * 
 **/
public class AlreadyStoppedException extends Ice.UserException
{
    public String
    ice_name()
    {
        return "IceBox::AlreadyStoppedException";
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString("::IceBox::AlreadyStoppedException");
        __os.startWriteSlice();
        __os.endWriteSlice();
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readString();
        }
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception IceBox::AlreadyStoppedException was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception IceBox::AlreadyStoppedException was not generated with stream support";
        throw ex;
    }
}
