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
// Generated from file `Properties.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public interface _PropertiesAdminDel extends Ice._ObjectDel
{
    String getProperty(String key, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    java.util.Map<java.lang.String, java.lang.String> getPropertiesForPrefix(String prefix, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
