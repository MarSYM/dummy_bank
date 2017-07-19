/**
 * SCFWebServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

public class SCFWebServicesLocator extends org.apache.axis.client.Service implements th.co.kbank.SCFWebServices {

    public SCFWebServicesLocator() {
    }


    public SCFWebServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SCFWebServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SCFWebServicesSoap
    private java.lang.String SCFWebServicesSoap_address = "http://localhost:8080/DummyBankKBANKESCF/services/SCFWebServicesSoap";

    public java.lang.String getSCFWebServicesSoapAddress() {
        return SCFWebServicesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SCFWebServicesSoapWSDDServiceName = "SCFWebServicesSoap";

    public java.lang.String getSCFWebServicesSoapWSDDServiceName() {
        return SCFWebServicesSoapWSDDServiceName;
    }

    public void setSCFWebServicesSoapWSDDServiceName(java.lang.String name) {
        SCFWebServicesSoapWSDDServiceName = name;
    }

    public th.co.kbank.SCFWebServicesSoap getSCFWebServicesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SCFWebServicesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSCFWebServicesSoap(endpoint);
    }

    public th.co.kbank.SCFWebServicesSoap getSCFWebServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            th.co.kbank.SCFWebServicesSoapStub _stub = new th.co.kbank.SCFWebServicesSoapStub(portAddress, this);
            _stub.setPortName(getSCFWebServicesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSCFWebServicesSoapEndpointAddress(java.lang.String address) {
        SCFWebServicesSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (th.co.kbank.SCFWebServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                th.co.kbank.SCFWebServicesSoapStub _stub = new th.co.kbank.SCFWebServicesSoapStub(new java.net.URL(SCFWebServicesSoap_address), this);
                _stub.setPortName(getSCFWebServicesSoapWSDDServiceName());
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
        if ("SCFWebServicesSoap".equals(inputPortName)) {
            return getSCFWebServicesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://kbank.co.th/", "SCFWebServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://kbank.co.th/", "SCFWebServicesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SCFWebServicesSoap".equals(portName)) {
            setSCFWebServicesSoapEndpointAddress(address);
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
