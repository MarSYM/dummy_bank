/**
 * SCFWebServicesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

public interface SCFWebServicesSoap extends java.rmi.Remote {
    public java.lang.String sendDrawdownTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException;
    public java.lang.String sendDebitTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException;
    public java.lang.String inqCreditLimit(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException;
    public java.lang.String getBuildVersion() throws java.rmi.RemoteException;
}
