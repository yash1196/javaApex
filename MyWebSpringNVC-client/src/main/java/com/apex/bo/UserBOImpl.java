/**
 * UserBOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apex.bo;

public interface UserBOImpl extends java.rmi.Remote {
    public com.apex.vo.UserInfo getUser(int ssn) throws java.rmi.RemoteException;
    public void addUser(com.apex.vo.User user) throws java.rmi.RemoteException;
    public void updateUser(com.apex.vo.UserInfo user) throws java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String ssn) throws java.rmi.RemoteException;
    public void addContact(com.apex.vo.Contact contact) throws java.rmi.RemoteException;
    public void addBank(com.apex.vo.Bank bank) throws java.rmi.RemoteException;
}
