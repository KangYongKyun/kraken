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


public final class ShortSeqHelper
{
    public static void
    write(IceInternal.BasicStream __os, short[] __v)
    {
        __os.writeShortSeq(__v);
    }

    public static short[]
    read(IceInternal.BasicStream __is)
    {
        short[] __v;
        __v = __is.readShortSeq();
        return __v;
    }

    public static void
    write(Ice.OutputStream __outS, short[] __v)
    {
        __outS.writeShortSeq(__v);
    }

    public static short[]
    read(Ice.InputStream __inS)
    {
        short[] __v;
        __v = __inS.readShortSeq();
        return __v;
    }
}
