
package org.oasis.open.docs.wsn.bw_2;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.oasis.open.docs.wsn.b_2.Notify;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NotificationConsumer", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.oasis.open.docs.wsn.b_2.ObjectFactory.class,
    org.oasis.open.docs.wsrf.bf_2.ObjectFactory.class,
    org.oasis.open.docs.wsn.t_1.ObjectFactory.class,
    org.oasis.open.docs.wsrf.r_2.ObjectFactory.class,
    org.w3.addressing.ObjectFactory.class
})
public interface NotificationConsumer {


    /**
     * 
     * @param notify
     */
    @WebMethod(operationName = "Notify", action = "http://docs.oasis-open.org/wsn/bw-2/Notify")
    @Oneway
    public void notify(
        @WebParam(name = "Notify", targetNamespace = "http://docs.oasis-open.org/wsn/b-2", partName = "Notify")
        Notify notify);

}
