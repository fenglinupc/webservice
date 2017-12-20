/**
 * ProcessDispatcherImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.qlsbpm.job.process;

public class ProcessDispatcherImplServiceLocator extends org.apache.axis.client.Service implements com.qlsbpm.job.process.ProcessDispatcherImplService {

    public ProcessDispatcherImplServiceLocator() {
    }


    public ProcessDispatcherImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcessDispatcherImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProcessDispatcherImplPort
    private java.lang.String ProcessDispatcherImplPort_address = "http://192.168.252.13:9912/process";

    public java.lang.String getProcessDispatcherImplPortAddress() {
        return ProcessDispatcherImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcessDispatcherImplPortWSDDServiceName = "ProcessDispatcherImplPort";

    public java.lang.String getProcessDispatcherImplPortWSDDServiceName() {
        return ProcessDispatcherImplPortWSDDServiceName;
    }

    public void setProcessDispatcherImplPortWSDDServiceName(java.lang.String name) {
        ProcessDispatcherImplPortWSDDServiceName = name;
    }

    public com.qlsbpm.job.process.ProcessDispatcher getProcessDispatcherImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProcessDispatcherImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcessDispatcherImplPort(endpoint);
    }

    public com.qlsbpm.job.process.ProcessDispatcher getProcessDispatcherImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.qlsbpm.job.process.ProcessDispatcherImplServiceSoapBindingStub _stub = new com.qlsbpm.job.process.ProcessDispatcherImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProcessDispatcherImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcessDispatcherImplPortEndpointAddress(java.lang.String address) {
        ProcessDispatcherImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.qlsbpm.job.process.ProcessDispatcher.class.isAssignableFrom(serviceEndpointInterface)) {
                com.qlsbpm.job.process.ProcessDispatcherImplServiceSoapBindingStub _stub = new com.qlsbpm.job.process.ProcessDispatcherImplServiceSoapBindingStub(new java.net.URL(ProcessDispatcherImplPort_address), this);
                _stub.setPortName(getProcessDispatcherImplPortWSDDServiceName());
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
        if ("ProcessDispatcherImplPort".equals(inputPortName)) {
            return getProcessDispatcherImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://process.job.qlsbpm.com/", "ProcessDispatcherImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://process.job.qlsbpm.com/", "ProcessDispatcherImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProcessDispatcherImplPort".equals(portName)) {
            setProcessDispatcherImplPortEndpointAddress(address);
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
