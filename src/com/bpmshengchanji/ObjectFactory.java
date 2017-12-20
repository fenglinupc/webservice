
package com.qlsbpm.job.process;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.qlsbpm.job.process package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StartProcessResponse_QNAME = new QName("http://process.job.qlsbpm.com/", "startProcessResponse");
    private final static QName _StartProcess_QNAME = new QName("http://process.job.qlsbpm.com/", "startProcess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.qlsbpm.job.process
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartProcess }
     * 
     */
    public StartProcess createStartProcess() {
        return new StartProcess();
    }

    /**
     * Create an instance of {@link StartProcessResponse }
     * 
     */
    public StartProcessResponse createStartProcessResponse() {
        return new StartProcessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://process.job.qlsbpm.com/", name = "startProcessResponse")
    public JAXBElement<StartProcessResponse> createStartProcessResponse(StartProcessResponse value) {
        return new JAXBElement<StartProcessResponse>(_StartProcessResponse_QNAME, StartProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://process.job.qlsbpm.com/", name = "startProcess")
    public JAXBElement<StartProcess> createStartProcess(StartProcess value) {
        return new JAXBElement<StartProcess>(_StartProcess_QNAME, StartProcess.class, null, value);
    }

}
