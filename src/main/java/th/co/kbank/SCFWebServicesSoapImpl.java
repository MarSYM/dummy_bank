/**
 * SCFWebServicesSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

public class SCFWebServicesSoapImpl implements th.co.kbank.SCFWebServicesSoap{
	
	
    public java.lang.String sendDrawdownTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
    	
//    	String str = "0123456789"; 
//    	System.out.println(str.substring(15, 20));
    	
    	String sponsor_ref = transReq.substring(0, 20);
    	
    	
    	
    	
    	return null;
    }

    public java.lang.String sendDebitTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String inqCreditLimit(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String getBuildVersion() throws java.rmi.RemoteException {
        return null;
    }

}
