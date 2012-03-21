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
// Generated from file `Locator.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * The Ice locator registry interface. This interface is used by
 * servers to register adapter endpoints with the locator.
 * 
 * <p class="Note"> The {@link LocatorRegistry} interface is intended to be used
 * by Ice internals and by locator implementations. Regular user
 * code should not attempt to use any functionality of this interface
 * directly.
 * 
 **/
public final class LocatorRegistryPrxHelper extends Ice.ObjectPrxHelperBase implements LocatorRegistryPrx
{
    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @throws AdapterNotFoundException Raised if the adapter cannot
     * be found, or if the locator only allows
     * registered adapters to set their active proxy and the
     * adapter is not registered with the locator.
     * 
     * @throws AdapterAlreadyActiveException Raised if an adapter with the same
     * id is already active.
     * 
     **/
    public void
    setAdapterDirectProxy(String id, Ice.ObjectPrx proxy)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException
    {
        setAdapterDirectProxy(id, proxy, null, false);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @throws AdapterNotFoundException Raised if the adapter cannot
     * be found, or if the locator only allows
     * registered adapters to set their active proxy and the
     * adapter is not registered with the locator.
     * 
     * @throws AdapterAlreadyActiveException Raised if an adapter with the same
     * id is already active.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public void
    setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException
    {
        setAdapterDirectProxy(id, proxy, __ctx, true);
    }

    private void
    setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setAdapterDirectProxy");
                __delBase = __getDelegate(false);
                _LocatorRegistryDel __del = (_LocatorRegistryDel)__delBase;
                __del.setAdapterDirectProxy(id, proxy, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __setAdapterDirectProxy_name = "setAdapterDirectProxy";

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy)
    {
        return begin_setAdapterDirectProxy(id, proxy, null, false, null);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx)
    {
        return begin_setAdapterDirectProxy(id, proxy, __ctx, true, null);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, Ice.Callback __cb)
    {
        return begin_setAdapterDirectProxy(id, proxy, null, false, __cb);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setAdapterDirectProxy(id, proxy, __ctx, true, __cb);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, Callback_LocatorRegistry_setAdapterDirectProxy __cb)
    {
        return begin_setAdapterDirectProxy(id, proxy, null, false, __cb);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, Callback_LocatorRegistry_setAdapterDirectProxy __cb)
    {
        return begin_setAdapterDirectProxy(id, proxy, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setAdapterDirectProxy(String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setAdapterDirectProxy_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setAdapterDirectProxy_name, __cb);
        try
        {
            __result.__prepare(__setAdapterDirectProxy_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeString(id);
            __os.writeProxy(proxy);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public void end_setAdapterDirectProxy(Ice.AsyncResult __result)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException
    {
        Ice.AsyncResult.__check(__result, this, __setAdapterDirectProxy_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(AdapterAlreadyActiveException __ex)
            {
                throw __ex;
            }
            catch(AdapterNotFoundException __ex)
            {
                throw __ex;
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        IceInternal.BasicStream __is = __result.__is();
        __is.skipEmptyEncaps();
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public boolean
    setAdapterDirectProxy_async(AMI_LocatorRegistry_setAdapterDirectProxy __cb, String id, Ice.ObjectPrx proxy)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__setAdapterDirectProxy_name);
            __r = begin_setAdapterDirectProxy(id, proxy, null, false, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __setAdapterDirectProxy_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param id The adapter id.
     * 
     * @param proxy The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean
    setAdapterDirectProxy_async(AMI_LocatorRegistry_setAdapterDirectProxy __cb, String id, Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__setAdapterDirectProxy_name);
            __r = begin_setAdapterDirectProxy(id, proxy, __ctx, true, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __setAdapterDirectProxy_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @throws AdapterNotFoundException Raised if the adapter cannot
     * be found, or if the locator only allows registered adapters to
     * set their active proxy and the adapter is not registered with
     * the locator.
     * 
     * @throws AdapterAlreadyActiveException Raised if an adapter with the same
     * id is already active.
     * 
     * @throws InvalidReplicaGroupIdException Raised if the given
     * replica group doesn't match the one registered with the
     * locator registry for this object adapter.
     * 
     **/
    public void
    setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException,
               InvalidReplicaGroupIdException
    {
        setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, null, false);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @throws AdapterNotFoundException Raised if the adapter cannot
     * be found, or if the locator only allows registered adapters to
     * set their active proxy and the adapter is not registered with
     * the locator.
     * 
     * @throws AdapterAlreadyActiveException Raised if an adapter with the same
     * id is already active.
     * 
     * @throws InvalidReplicaGroupIdException Raised if the given
     * replica group doesn't match the one registered with the
     * locator registry for this object adapter.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public void
    setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException,
               InvalidReplicaGroupIdException
    {
        setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, __ctx, true);
    }

    private void
    setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException,
               InvalidReplicaGroupIdException
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setReplicatedAdapterDirectProxy");
                __delBase = __getDelegate(false);
                _LocatorRegistryDel __del = (_LocatorRegistryDel)__delBase;
                __del.setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __setReplicatedAdapterDirectProxy_name = "setReplicatedAdapterDirectProxy";

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p)
    {
        return begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, null, false, null);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx)
    {
        return begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, __ctx, true, null);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, Ice.Callback __cb)
    {
        return begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, null, false, __cb);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, __ctx, true, __cb);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, Callback_LocatorRegistry_setReplicatedAdapterDirectProxy __cb)
    {
        return begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, null, false, __cb);
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx, Callback_LocatorRegistry_setReplicatedAdapterDirectProxy __cb)
    {
        return begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setReplicatedAdapterDirectProxy(String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setReplicatedAdapterDirectProxy_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setReplicatedAdapterDirectProxy_name, __cb);
        try
        {
            __result.__prepare(__setReplicatedAdapterDirectProxy_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeString(adapterId);
            __os.writeString(replicaGroupId);
            __os.writeProxy(p);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public void end_setReplicatedAdapterDirectProxy(Ice.AsyncResult __result)
        throws AdapterAlreadyActiveException,
               AdapterNotFoundException,
               InvalidReplicaGroupIdException
    {
        Ice.AsyncResult.__check(__result, this, __setReplicatedAdapterDirectProxy_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(AdapterAlreadyActiveException __ex)
            {
                throw __ex;
            }
            catch(AdapterNotFoundException __ex)
            {
                throw __ex;
            }
            catch(InvalidReplicaGroupIdException __ex)
            {
                throw __ex;
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        IceInternal.BasicStream __is = __result.__is();
        __is.skipEmptyEncaps();
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     **/
    public boolean
    setReplicatedAdapterDirectProxy_async(AMI_LocatorRegistry_setReplicatedAdapterDirectProxy __cb, String adapterId, String replicaGroupId, Ice.ObjectPrx p)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__setReplicatedAdapterDirectProxy_name);
            __r = begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, null, false, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __setReplicatedAdapterDirectProxy_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Set the adapter endpoints with the locator registry.
     * 
     * @param __cb The callback object for the operation.
     * @param adapterId The adapter id.
     * 
     * @param replicaGroupId The replica group id.
     * 
     * @param p The adapter proxy (a dummy direct proxy created
     * by the adapter). The direct proxy contains the adapter
     * endpoints.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean
    setReplicatedAdapterDirectProxy_async(AMI_LocatorRegistry_setReplicatedAdapterDirectProxy __cb, String adapterId, String replicaGroupId, Ice.ObjectPrx p, java.util.Map<String, String> __ctx)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__setReplicatedAdapterDirectProxy_name);
            __r = begin_setReplicatedAdapterDirectProxy(adapterId, replicaGroupId, p, __ctx, true, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __setReplicatedAdapterDirectProxy_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     * @throws ServerNotFoundException Raised if the server cannot
     * be found.
     * 
     **/
    public void
    setServerProcessProxy(String id, ProcessPrx proxy)
        throws ServerNotFoundException
    {
        setServerProcessProxy(id, proxy, null, false);
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     * @throws ServerNotFoundException Raised if the server cannot
     * be found.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public void
    setServerProcessProxy(String id, ProcessPrx proxy, java.util.Map<String, String> __ctx)
        throws ServerNotFoundException
    {
        setServerProcessProxy(id, proxy, __ctx, true);
    }

    private void
    setServerProcessProxy(String id, ProcessPrx proxy, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws ServerNotFoundException
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("setServerProcessProxy");
                __delBase = __getDelegate(false);
                _LocatorRegistryDel __del = (_LocatorRegistryDel)__delBase;
                __del.setServerProcessProxy(id, proxy, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __setServerProcessProxy_name = "setServerProcessProxy";

    /**
     * Set the process proxy for a server.
     * 
     * @param __cb The callback object for the operation.
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     **/
    public Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy)
    {
        return begin_setServerProcessProxy(id, proxy, null, false, null);
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param __cb The callback object for the operation.
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy, java.util.Map<String, String> __ctx)
    {
        return begin_setServerProcessProxy(id, proxy, __ctx, true, null);
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param __cb The callback object for the operation.
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     **/
    public Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy, Ice.Callback __cb)
    {
        return begin_setServerProcessProxy(id, proxy, null, false, __cb);
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param __cb The callback object for the operation.
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setServerProcessProxy(id, proxy, __ctx, true, __cb);
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param __cb The callback object for the operation.
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     **/
    public Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy, Callback_LocatorRegistry_setServerProcessProxy __cb)
    {
        return begin_setServerProcessProxy(id, proxy, null, false, __cb);
    }

    /**
     * Set the process proxy for a server.
     * 
     * @param __cb The callback object for the operation.
     * @param id The server id.
     * 
     * @param proxy The process proxy.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy, java.util.Map<String, String> __ctx, Callback_LocatorRegistry_setServerProcessProxy __cb)
    {
        return begin_setServerProcessProxy(id, proxy, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setServerProcessProxy(String id, ProcessPrx proxy, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setServerProcessProxy_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setServerProcessProxy_name, __cb);
        try
        {
            __result.__prepare(__setServerProcessProxy_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeString(id);
            ProcessPrxHelper.__write(__os, proxy);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public void end_setServerProcessProxy(Ice.AsyncResult __result)
        throws ServerNotFoundException
    {
        Ice.AsyncResult.__check(__result, this, __setServerProcessProxy_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(ServerNotFoundException __ex)
            {
                throw __ex;
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        IceInternal.BasicStream __is = __result.__is();
        __is.skipEmptyEncaps();
    }

    public static LocatorRegistryPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        LocatorRegistryPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (LocatorRegistryPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Ice::LocatorRegistry"))
                {
                    LocatorRegistryPrxHelper __h = new LocatorRegistryPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static LocatorRegistryPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        LocatorRegistryPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (LocatorRegistryPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Ice::LocatorRegistry", __ctx))
                {
                    LocatorRegistryPrxHelper __h = new LocatorRegistryPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static LocatorRegistryPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        LocatorRegistryPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Ice::LocatorRegistry"))
                {
                    LocatorRegistryPrxHelper __h = new LocatorRegistryPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static LocatorRegistryPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        LocatorRegistryPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Ice::LocatorRegistry", __ctx))
                {
                    LocatorRegistryPrxHelper __h = new LocatorRegistryPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static LocatorRegistryPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        LocatorRegistryPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (LocatorRegistryPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                LocatorRegistryPrxHelper __h = new LocatorRegistryPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static LocatorRegistryPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        LocatorRegistryPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            LocatorRegistryPrxHelper __h = new LocatorRegistryPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _LocatorRegistryDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _LocatorRegistryDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, LocatorRegistryPrx v)
    {
        __os.writeProxy(v);
    }

    public static LocatorRegistryPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            LocatorRegistryPrxHelper result = new LocatorRegistryPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}