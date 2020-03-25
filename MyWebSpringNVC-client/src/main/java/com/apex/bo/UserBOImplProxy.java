package com.apex.bo;

public class UserBOImplProxy implements com.apex.bo.UserBOImpl {
  private String _endpoint = null;
  private com.apex.bo.UserBOImpl userBOImpl = null;
  
  public UserBOImplProxy() {
    _initUserBOImplProxy();
  }
  
  public UserBOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserBOImplProxy();
  }
  
  private void _initUserBOImplProxy() {
    try {
      userBOImpl = (new com.apex.bo.UserBOImplServiceLocator()).getUserBOImpl();
      if (userBOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userBOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userBOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userBOImpl != null)
      ((javax.xml.rpc.Stub)userBOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.apex.bo.UserBOImpl getUserBOImpl() {
    if (userBOImpl == null)
      _initUserBOImplProxy();
    return userBOImpl;
  }
  
  public com.apex.vo.UserInfo getUser(int ssn) throws java.rmi.RemoteException{
    if (userBOImpl == null)
      _initUserBOImplProxy();
    return userBOImpl.getUser(ssn);
  }
  
  public void addUser(com.apex.vo.User user) throws java.rmi.RemoteException{
    if (userBOImpl == null)
      _initUserBOImplProxy();
    userBOImpl.addUser(user);
  }
  
  public void updateUser(com.apex.vo.UserInfo user) throws java.rmi.RemoteException{
    if (userBOImpl == null)
      _initUserBOImplProxy();
    userBOImpl.updateUser(user);
  }
  
  public boolean deleteUser(java.lang.String ssn) throws java.rmi.RemoteException{
    if (userBOImpl == null)
      _initUserBOImplProxy();
    return userBOImpl.deleteUser(ssn);
  }
  
  public void addContact(com.apex.vo.Contact contact) throws java.rmi.RemoteException{
    if (userBOImpl == null)
      _initUserBOImplProxy();
    userBOImpl.addContact(contact);
  }
  
  public void addBank(com.apex.vo.Bank bank) throws java.rmi.RemoteException{
    if (userBOImpl == null)
      _initUserBOImplProxy();
    userBOImpl.addBank(bank);
  }
  
  
}