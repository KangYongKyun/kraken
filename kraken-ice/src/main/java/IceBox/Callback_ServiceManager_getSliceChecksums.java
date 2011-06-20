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
 * Returns the checksums for the IceBox Slice definitions.
 * 
 **/

public abstract class Callback_ServiceManager_getSliceChecksums extends Ice.TwowayCallback
{
    public abstract void response(java.util.Map<java.lang.String, java.lang.String> __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        ServiceManagerPrx __proxy = (ServiceManagerPrx)__result.getProxy();
        java.util.Map<java.lang.String, java.lang.String> __ret = null;
        try
        {
            __ret = __proxy.end_getSliceChecksums(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
