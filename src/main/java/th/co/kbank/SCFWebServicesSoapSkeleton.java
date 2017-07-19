/**
 * SCFWebServicesSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

public class SCFWebServicesSoapSkeleton implements th.co.kbank.SCFWebServicesSoap, org.apache.axis.wsdl.Skeleton {
    private th.co.kbank.SCFWebServicesSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://kbank.co.th/", "transReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://kbank.co.th/", "extSysName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sendDrawdownTrans", _params, new javax.xml.namespace.QName("http://kbank.co.th/", "sendDrawdownTransResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://kbank.co.th/", "sendDrawdownTrans"));
        _oper.setSoapAction("http://kbank.co.th/sendDrawdownTrans");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendDrawdownTrans") == null) {
            _myOperations.put("sendDrawdownTrans", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendDrawdownTrans")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://kbank.co.th/", "transReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://kbank.co.th/", "extSysName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sendDebitTrans", _params, new javax.xml.namespace.QName("http://kbank.co.th/", "sendDebitTransResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://kbank.co.th/", "sendDebitTrans"));
        _oper.setSoapAction("http://kbank.co.th/sendDebitTrans");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendDebitTrans") == null) {
            _myOperations.put("sendDebitTrans", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendDebitTrans")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://kbank.co.th/", "transReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://kbank.co.th/", "extSysName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("inqCreditLimit", _params, new javax.xml.namespace.QName("http://kbank.co.th/", "inqCreditLimitResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://kbank.co.th/", "inqCreditLimit"));
        _oper.setSoapAction("http://kbank.co.th/inqCreditLimit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("inqCreditLimit") == null) {
            _myOperations.put("inqCreditLimit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("inqCreditLimit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getBuildVersion", _params, new javax.xml.namespace.QName("http://kbank.co.th/", "getBuildVersionResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://kbank.co.th/", "getBuildVersion"));
        _oper.setSoapAction("http://kbank.co.th/getBuildVersion");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBuildVersion") == null) {
            _myOperations.put("getBuildVersion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBuildVersion")).add(_oper);
    }

    public SCFWebServicesSoapSkeleton() {
        this.impl = new th.co.kbank.SCFWebServicesSoapImpl();
    }

    public SCFWebServicesSoapSkeleton(th.co.kbank.SCFWebServicesSoap impl) {
        this.impl = impl;
    }
    public java.lang.String sendDrawdownTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.sendDrawdownTrans(transReq, extSysName);
        return ret;
    }

    public java.lang.String sendDebitTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.sendDebitTrans(transReq, extSysName);
        return ret;
    }

    public java.lang.String inqCreditLimit(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.inqCreditLimit(transReq, extSysName);
        return ret;
    }

    public java.lang.String getBuildVersion() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getBuildVersion();
        return ret;
    }

}
