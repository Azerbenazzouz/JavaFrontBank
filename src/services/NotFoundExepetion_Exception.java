
package services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NotFoundExepetion", targetNamespace = "http://service/")
public class NotFoundExepetion_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NotFoundExepetion faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NotFoundExepetion_Exception(String message, NotFoundExepetion faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NotFoundExepetion_Exception(String message, NotFoundExepetion faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: services.NotFoundExepetion
     */
    public NotFoundExepetion getFaultInfo() {
        return faultInfo;
    }

}
