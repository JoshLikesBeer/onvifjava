
package org.oasis.open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;

import org.oasis.open.docs.wsn.b_2.NoCurrentMessageOnTopicFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NoCurrentMessageOnTopicFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class NoCurrentMessageOnTopicFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NoCurrentMessageOnTopicFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NoCurrentMessageOnTopicFault(String message, NoCurrentMessageOnTopicFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NoCurrentMessageOnTopicFault(String message, NoCurrentMessageOnTopicFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.oasis_open.docs.wsn.b_2.NoCurrentMessageOnTopicFaultType
     */
    public NoCurrentMessageOnTopicFaultType getFaultInfo() {
        return faultInfo;
    }

}
