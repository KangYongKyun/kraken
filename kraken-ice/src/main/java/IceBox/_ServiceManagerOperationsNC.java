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
 * Administers a set of {@link Service} instances.
 * 
 * @see Service
 * 
 **/
public interface _ServiceManagerOperationsNC
{
    /**
     * Returns the checksums for the IceBox Slice definitions.
     * 
     * @return A dictionary mapping Slice type ids to their checksums.
     * 
     **/
    java.util.Map<java.lang.String, java.lang.String> getSliceChecksums();

    /**
     * Start an individual service.
     * 
     * @param service The service name.
     * 
     **/
    void startService(String service)
        throws AlreadyStartedException,
               NoSuchServiceException;

    /**
     * Stop an individual service.
     * 
     * @param service The service name.
     * 
     **/
    void stopService(String service)
        throws AlreadyStoppedException,
               NoSuchServiceException;

    /**
     * Registers a new observer with the ServiceManager.
     * 
     * @param observer The new observer
     * 
     **/
    void addObserver(ServiceObserverPrx observer);

    /**
     * Shut down all services. This causes {@link Service#stop} to be
     * invoked on all configured services.
     * 
     **/
    void shutdown();
}
