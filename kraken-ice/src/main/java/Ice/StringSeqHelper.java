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
// Generated from file `BuiltinSequences.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public final class StringSeqHelper
{
    public static void
    write(IceInternal.BasicStream __os, String[] __v)
    {
        __os.writeStringSeq(__v);
    }

    public static String[]
    read(IceInternal.BasicStream __is)
    {
        String[] __v;
        __v = __is.readStringSeq();
        return __v;
    }

    public static void
    write(Ice.OutputStream __outS, String[] __v)
    {
        __outS.writeStringSeq(__v);
    }

    public static String[]
    read(Ice.InputStream __inS)
    {
        String[] __v;
        __v = __inS.readStringSeq();
        return __v;
    }
}
