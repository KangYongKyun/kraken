// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Glacier2;

// <auto-generated>
//
// Generated from file `Router.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * The Glacier2 specialization of the {@link Ice.Router}
 * interface.
 * 
 **/
public abstract class _RouterDisp extends Ice.ObjectImpl implements Router
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Glacier2::Router",
        "::Ice::Object",
        "::Ice::Router"
    };

    public boolean
    ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean
    ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[]
    ice_ids()
    {
        return __ids;
    }

    public String[]
    ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String
    ice_id()
    {
        return __ids[0];
    }

    public String
    ice_id(Ice.Current __current)
    {
        return __ids[0];
    }

    public static String
    ice_staticId()
    {
        return __ids[0];
    }

    /**
     * Create a per-client session with the router. If a
     * {@link SessionManager} has been installed, a proxy to a {@link Session}
     * object is returned to the client. Otherwise, null is returned
     * and only an internal session (i.e., not visible to the client)
     * is created.
     * 
     * If a session proxy is returned, it must be configured to route
     * through the router that created it. This will happen automatically
     * if the router is configured as the client's default router at the
     * time the session proxy is created in the client process, otherwise
     * the client must configure the session proxy explicitly.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check the password.
     * 
     * @param password The password for the given user id.
     * 
     **/
    public final void
    createSession_async(AMD_Router_createSession __cb, String userId, String password)
        throws CannotCreateSessionException,
               PermissionDeniedException
    {
        createSession_async(__cb, userId, password, null);
    }

    /**
     * Create a per-client session with the router. The user is
     * authenticated through the SSL certificates that have been
     * associated with the connection. If a {@link SessionManager} has been
     * installed, a proxy to a {@link Session} object is returned to the
     * client. Otherwise, null is returned and only an internal
     * session (i.e., not visible to the client) is created.
     * 
     * If a session proxy is returned, it must be configured to route
     * through the router that created it. This will happen automatically
     * if the router is configured as the client's default router at the
     * time the session proxy is created in the client process, otherwise
     * the client must configure the session proxy explicitly.
     * 
     * @param __cb The callback object for the operation.
     **/
    public final void
    createSessionFromSecureConnection_async(AMD_Router_createSessionFromSecureConnection __cb)
        throws CannotCreateSessionException,
               PermissionDeniedException
    {
        createSessionFromSecureConnection_async(__cb, null);
    }

    /**
     * Destroy the calling client's session with this router.
     * 
     * @throws SessionNotExistException Raised if no session exists
     * for the calling client.
     * 
     **/
    public final void
    destroySession()
        throws SessionNotExistException
    {
        destroySession(null);
    }

    /**
     * This category must be used in the identities of all of the client's
     * callback objects. This is necessary in order for the router to
     * forward callback requests to the intended client. If the Glacier2
     * server endpoints are not set, the returned category is an empty 
     * string.
     * 
     * @return The category.
     * 
     **/
    public final String
    getCategoryForClient()
    {
        return getCategoryForClient(null);
    }

    /**
     * Get the value of the session timeout. Sessions are destroyed
     * if they see no activity for this period of time.
     * 
     * @return The timeout (in seconds).
     * 
     **/
    public final long
    getSessionTimeout()
    {
        return getSessionTimeout(null);
    }

    /**
     * Keep the calling client's session with this router alive.
     * 
     * @throws SessionNotExistException Raised if no session exists
     * for the calling client.
     * 
     **/
    public final void
    refreshSession()
        throws SessionNotExistException
    {
        refreshSession(null);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param proxies The proxies to add.
     * 
     * @return Proxies discarded by the router.
     * 
     **/
    public final Ice.ObjectPrx[]
    addProxies(Ice.ObjectPrx[] proxies)
    {
        return addProxies(proxies, null);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param proxy The proxy to add.
     * 
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public final void
    addProxy(Ice.ObjectPrx proxy)
    {
        addProxy(proxy, null);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @return The router's client proxy.
     * 
     **/
    public final Ice.ObjectPrx
    getClientProxy()
    {
        return getClientProxy(null);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @return The router's server proxy.
     * 
     **/
    public final Ice.ObjectPrx
    getServerProxy()
    {
        return getServerProxy(null);
    }

    public static Ice.DispatchStatus
    ___getCategoryForClient(Router __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        String __ret = __obj.getCategoryForClient(__current);
        __os.writeString(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___createSession(Router __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String userId;
        userId = __is.readString();
        String password;
        password = __is.readString();
        __is.endReadEncaps();
        AMD_Router_createSession __cb = new _AMD_Router_createSession(__inS);
        try
        {
            __obj.createSession_async(__cb, userId, password, __current);
        }
        catch(java.lang.Exception ex)
        {
            __cb.ice_exception(ex);
        }
        return Ice.DispatchStatus.DispatchAsync;
    }

    public static Ice.DispatchStatus
    ___createSessionFromSecureConnection(Router __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        AMD_Router_createSessionFromSecureConnection __cb = new _AMD_Router_createSessionFromSecureConnection(__inS);
        try
        {
            __obj.createSessionFromSecureConnection_async(__cb, __current);
        }
        catch(java.lang.Exception ex)
        {
            __cb.ice_exception(ex);
        }
        return Ice.DispatchStatus.DispatchAsync;
    }

    public static Ice.DispatchStatus
    ___refreshSession(Router __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.refreshSession(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(SessionNotExistException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___destroySession(Router __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.destroySession(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(SessionNotExistException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSessionTimeout(Router __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.getSessionTimeout(__current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "addProxies",
        "addProxy",
        "createSession",
        "createSessionFromSecureConnection",
        "destroySession",
        "getCategoryForClient",
        "getClientProxy",
        "getServerProxy",
        "getSessionTimeout",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "refreshSession"
    };

    @SuppressWarnings("deprecation")
    public Ice.DispatchStatus
    __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return Ice._RouterDisp.___addProxies(this, in, __current);
            }
            case 1:
            {
                return Ice._RouterDisp.___addProxy(this, in, __current);
            }
            case 2:
            {
                return ___createSession(this, in, __current);
            }
            case 3:
            {
                return ___createSessionFromSecureConnection(this, in, __current);
            }
            case 4:
            {
                return ___destroySession(this, in, __current);
            }
            case 5:
            {
                return ___getCategoryForClient(this, in, __current);
            }
            case 6:
            {
                return Ice._RouterDisp.___getClientProxy(this, in, __current);
            }
            case 7:
            {
                return Ice._RouterDisp.___getServerProxy(this, in, __current);
            }
            case 8:
            {
                return ___getSessionTimeout(this, in, __current);
            }
            case 9:
            {
                return ___ice_id(this, in, __current);
            }
            case 10:
            {
                return ___ice_ids(this, in, __current);
            }
            case 11:
            {
                return ___ice_isA(this, in, __current);
            }
            case 12:
            {
                return ___ice_ping(this, in, __current);
            }
            case 13:
            {
                return ___refreshSession(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeTypeId(ice_staticId());
        __os.startWriteSlice();
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type Glacier2::Router was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type Glacier2::Router was not generated with stream support";
        throw ex;
    }
}
