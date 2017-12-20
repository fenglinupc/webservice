package com.qlsbpm.job.process;

public class ProcessDispatcherProxy implements com.qlsbpm.job.process.ProcessDispatcher {
  private String _endpoint = null;
  private com.qlsbpm.job.process.ProcessDispatcher processDispatcher = null;
  
  public ProcessDispatcherProxy() {
    _initProcessDispatcherProxy();
  }
  
  public ProcessDispatcherProxy(String endpoint) {
    _endpoint = endpoint;
    _initProcessDispatcherProxy();
  }
  
  private void _initProcessDispatcherProxy() {
    try {
      processDispatcher = (new com.qlsbpm.job.process.ProcessDispatcherImplServiceLocator()).getProcessDispatcherImplPort();
      if (processDispatcher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)processDispatcher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)processDispatcher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (processDispatcher != null)
      ((javax.xml.rpc.Stub)processDispatcher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.qlsbpm.job.process.ProcessDispatcher getProcessDispatcher() {
    if (processDispatcher == null)
      _initProcessDispatcherProxy();
    return processDispatcher;
  }
  
  public int startProcess(java.lang.String processId, java.lang.String keys) throws java.rmi.RemoteException{
    if (processDispatcher == null)
      _initProcessDispatcherProxy();
    return processDispatcher.startProcess(processId, keys);
  }
  
  
}