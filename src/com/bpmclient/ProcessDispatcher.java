
package com.inspur.qls.bpmclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ProcessDispatcher", targetNamespace = "http://process.job.qlsbpm.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProcessDispatcher {


    /**
     * 
     * @param keys
     * @param processId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "startProcess", targetNamespace = "http://process.job.qlsbpm.com/", className = "com.qlsbpm.job.process.StartProcess")
    @ResponseWrapper(localName = "startProcessResponse", targetNamespace = "http://process.job.qlsbpm.com/", className = "com.qlsbpm.job.process.StartProcessResponse")
    public int startProcess(
        @WebParam(name = "processId", targetNamespace = "")
        String processId,
        @WebParam(name = "keys", targetNamespace = "")
        String keys);

}
