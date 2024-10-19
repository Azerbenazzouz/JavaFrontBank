
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "iBankService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBankService {


    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertEuroToTnd", targetNamespace = "http://service/", className = "services.ConvertEuroToTnd")
    @ResponseWrapper(localName = "convertEuroToTndResponse", targetNamespace = "http://service/", className = "services.ConvertEuroToTndResponse")
    @Action(input = "http://service/iBankService/convertEuroToTndRequest", output = "http://service/iBankService/convertEuroToTndResponse")
    public double convertEuroToTnd(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCurrencies", targetNamespace = "http://service/", className = "services.GetAllCurrencies")
    @ResponseWrapper(localName = "getAllCurrenciesResponse", targetNamespace = "http://service/", className = "services.GetAllCurrenciesResponse")
    @Action(input = "http://service/iBankService/getAllCurrenciesRequest", output = "http://service/iBankService/getAllCurrenciesResponse")
    public List<String> getAllCurrencies();

    /**
     * 
     * @return
     *     returns java.util.List<services.CompteEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://service/", className = "services.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://service/", className = "services.GetComptesResponse")
    @Action(input = "http://service/iBankService/getComptesRequest", output = "http://service/iBankService/getComptesResponse")
    public List<CompteEntity> getComptes();

    /**
     * 
     * @param amount
     * @param arg1
     * @return
     *     returns double
     * @throws NotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertTndToAny", targetNamespace = "http://service/", className = "services.ConvertTndToAny")
    @ResponseWrapper(localName = "convertTndToAnyResponse", targetNamespace = "http://service/", className = "services.ConvertTndToAnyResponse")
    @Action(input = "http://service/iBankService/convertTndToAnyRequest", output = "http://service/iBankService/convertTndToAnyResponse", fault = {
        @FaultAction(className = NotFoundException_Exception.class, value = "http://service/iBankService/convertTndToAny/Fault/NotFoundException")
    })
    public double convertTndToAny(
        @WebParam(name = "amount", targetNamespace = "")
        double amount,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NotFoundException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns services.CompteEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://service/", className = "services.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://service/", className = "services.GetCompteResponse")
    @Action(input = "http://service/iBankService/getCompteRequest", output = "http://service/iBankService/getCompteResponse")
    public CompteEntity getCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param amount
     * @param arg1
     * @return
     *     returns double
     * @throws NotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertUsdToAny", targetNamespace = "http://service/", className = "services.ConvertUsdToAny")
    @ResponseWrapper(localName = "convertUsdToAnyResponse", targetNamespace = "http://service/", className = "services.ConvertUsdToAnyResponse")
    @Action(input = "http://service/iBankService/convertUsdToAnyRequest", output = "http://service/iBankService/convertUsdToAnyResponse", fault = {
        @FaultAction(className = NotFoundException_Exception.class, value = "http://service/iBankService/convertUsdToAny/Fault/NotFoundException")
    })
    public double convertUsdToAny(
        @WebParam(name = "amount", targetNamespace = "")
        double amount,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NotFoundException_Exception
    ;

}
