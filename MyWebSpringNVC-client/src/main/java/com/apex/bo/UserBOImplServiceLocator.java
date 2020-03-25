/**
 * UserBOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apex.bo;

public class UserBOImplServiceLocator extends org.apache.axis.client.Service implements com.apex.bo.UserBOImplService {

    public UserBOImplServiceLocator() {
    }


    public UserBOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserBOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserBOImpl
    private java.lang.String UserBOImpl_address = "http://localhost:8080/MyWebSpringNVC/services/UserBOImpl";

    public java.lang.String getUserBOImplAddress() {
        return UserBOImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserBOImplWSDDServiceName = "UserBOImpl";

    public java.lang.String getUserBOImplWSDDServiceName() {
        return UserBOImplWSDDServiceName;
    }

    public void setUserBOImplWSDDServiceName(java.lang.String name) {
        UserBOImplWSDDServiceName = name;
    }

    public com.apex.bo.UserBOImpl getUserBOImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserBOImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserBOImpl(endpoint);
    }

    public com.apex.bo.UserBOImpl getUserBOImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.apex.bo.UserBOImplSoapBindingStub _stub = new com.apex.bo.UserBOImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserBOImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserBOImplEndpointAddress(java.lang.String address) {
        UserBOImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.apex.bo.UserBOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.apex.bo.UserBOImplSoapBindingStub _stub = new com.apex.bo.UserBOImplSoapBindingStub(new java.net.URL(UserBOImpl_address), this);
                _stub.setPortName(getUserBOImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserBOImpl".equals(inputPortName)) {
            return getUserBOImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bo.apex.com", "UserBOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bo.apex.com", "UserBOImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserBOImpl".equals(portName)) {
            setUserBOImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
