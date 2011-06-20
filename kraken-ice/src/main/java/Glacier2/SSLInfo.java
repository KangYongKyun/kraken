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
// Generated from file `SSLInfo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * Information taken from an SSL connection used for permissions
 * verification.
 * 
 * @see PermissionsVerifier
 * 
 **/
public class SSLInfo implements java.lang.Cloneable, java.io.Serializable
{
    /**
     * The remote host.
     **/
    public String remoteHost;

    /**
     * The remote port.
     **/
    public int remotePort;

    /**
     * The router's host.
     **/
    public String localHost;

    /**
     * The router's port.
     **/
    public int localPort;

    /**
     * The negotiated cipher suite.
     **/
    public String cipher;

    /**
     * The certificate chain.
     **/
    public String[] certs;

    public SSLInfo()
    {
    }

    public SSLInfo(String remoteHost, int remotePort, String localHost, int localPort, String cipher, String[] certs)
    {
        this.remoteHost = remoteHost;
        this.remotePort = remotePort;
        this.localHost = localHost;
        this.localPort = localPort;
        this.cipher = cipher;
        this.certs = certs;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SSLInfo _r = null;
        try
        {
            _r = (SSLInfo)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(remoteHost != _r.remoteHost)
            {
                if(remoteHost == null || _r.remoteHost == null || !remoteHost.equals(_r.remoteHost))
                {
                    return false;
                }
            }
            if(remotePort != _r.remotePort)
            {
                return false;
            }
            if(localHost != _r.localHost)
            {
                if(localHost == null || _r.localHost == null || !localHost.equals(_r.localHost))
                {
                    return false;
                }
            }
            if(localPort != _r.localPort)
            {
                return false;
            }
            if(cipher != _r.cipher)
            {
                if(cipher == null || _r.cipher == null || !cipher.equals(_r.cipher))
                {
                    return false;
                }
            }
            if(!java.util.Arrays.equals(certs, _r.certs))
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        if(remoteHost != null)
        {
            __h = 5 * __h + remoteHost.hashCode();
        }
        __h = 5 * __h + remotePort;
        if(localHost != null)
        {
            __h = 5 * __h + localHost.hashCode();
        }
        __h = 5 * __h + localPort;
        if(cipher != null)
        {
            __h = 5 * __h + cipher.hashCode();
        }
        if(certs != null)
        {
            for(int __i0 = 0; __i0 < certs.length; __i0++)
            {
                if(certs[__i0] != null)
                {
                    __h = 5 * __h + certs[__i0].hashCode();
                }
            }
        }
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(remoteHost);
        __os.writeInt(remotePort);
        __os.writeString(localHost);
        __os.writeInt(localPort);
        __os.writeString(cipher);
        Ice.StringSeqHelper.write(__os, certs);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        remoteHost = __is.readString();
        remotePort = __is.readInt();
        localHost = __is.readString();
        localPort = __is.readInt();
        cipher = __is.readString();
        certs = Ice.StringSeqHelper.read(__is);
    }
}
