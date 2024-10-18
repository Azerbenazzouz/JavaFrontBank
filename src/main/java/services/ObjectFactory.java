
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _ConvTndToAny_QNAME = new QName("http://service/", "convTndToAny");
    private final static QName _ConvUsdToAnyResponse_QNAME = new QName("http://service/", "convUsdToAnyResponse");
    private final static QName _GetAllCurrency_QNAME = new QName("http://service/", "getAllCurrency");
    private final static QName _ConvUsdToAny_QNAME = new QName("http://service/", "convUsdToAny");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://service/", "getCompte");
    private final static QName _GetAllCurrencyResponse_QNAME = new QName("http://service/", "getAllCurrencyResponse");
    private final static QName _NotFoundExepetion_QNAME = new QName("http://service/", "NotFoundExepetion");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service/", "getComptesResponse");
    private final static QName _ConvEuroToTndResponse_QNAME = new QName("http://service/", "convEuroToTndResponse");
    private final static QName _GetComptes_QNAME = new QName("http://service/", "getComptes");
    private final static QName _ConvEuroToTnd_QNAME = new QName("http://service/", "convEuroToTnd");
    private final static QName _ConvTndToAnyResponse_QNAME = new QName("http://service/", "convTndToAnyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link ConvUsdToAny }
     * 
     */
    public ConvUsdToAny createConvUsdToAny() {
        return new ConvUsdToAny();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConvUsdToAnyResponse }
     * 
     */
    public ConvUsdToAnyResponse createConvUsdToAnyResponse() {
        return new ConvUsdToAnyResponse();
    }

    /**
     * Create an instance of {@link GetAllCurrency }
     * 
     */
    public GetAllCurrency createGetAllCurrency() {
        return new GetAllCurrency();
    }

    /**
     * Create an instance of {@link ConvTndToAny }
     * 
     */
    public ConvTndToAny createConvTndToAny() {
        return new ConvTndToAny();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link ConvEuroToTndResponse }
     * 
     */
    public ConvEuroToTndResponse createConvEuroToTndResponse() {
        return new ConvEuroToTndResponse();
    }

    /**
     * Create an instance of {@link NotFoundExepetion }
     * 
     */
    public NotFoundExepetion createNotFoundExepetion() {
        return new NotFoundExepetion();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link GetAllCurrencyResponse }
     * 
     */
    public GetAllCurrencyResponse createGetAllCurrencyResponse() {
        return new GetAllCurrencyResponse();
    }

    /**
     * Create an instance of {@link ConvTndToAnyResponse }
     * 
     */
    public ConvTndToAnyResponse createConvTndToAnyResponse() {
        return new ConvTndToAnyResponse();
    }

    /**
     * Create an instance of {@link ConvEuroToTnd }
     * 
     */
    public ConvEuroToTnd createConvEuroToTnd() {
        return new ConvEuroToTnd();
    }

    /**
     * Create an instance of {@link CompteEntite }
     * 
     */
    public CompteEntite createCompteEntite() {
        return new CompteEntite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvTndToAny }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convTndToAny")
    public JAXBElement<ConvTndToAny> createConvTndToAny(ConvTndToAny value) {
        return new JAXBElement<ConvTndToAny>(_ConvTndToAny_QNAME, ConvTndToAny.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvUsdToAnyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convUsdToAnyResponse")
    public JAXBElement<ConvUsdToAnyResponse> createConvUsdToAnyResponse(ConvUsdToAnyResponse value) {
        return new JAXBElement<ConvUsdToAnyResponse>(_ConvUsdToAnyResponse_QNAME, ConvUsdToAnyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCurrency")
    public JAXBElement<GetAllCurrency> createGetAllCurrency(GetAllCurrency value) {
        return new JAXBElement<GetAllCurrency>(_GetAllCurrency_QNAME, GetAllCurrency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvUsdToAny }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convUsdToAny")
    public JAXBElement<ConvUsdToAny> createConvUsdToAny(ConvUsdToAny value) {
        return new JAXBElement<ConvUsdToAny>(_ConvUsdToAny_QNAME, ConvUsdToAny.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCurrencyResponse")
    public JAXBElement<GetAllCurrencyResponse> createGetAllCurrencyResponse(GetAllCurrencyResponse value) {
        return new JAXBElement<GetAllCurrencyResponse>(_GetAllCurrencyResponse_QNAME, GetAllCurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotFoundExepetion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "NotFoundExepetion")
    public JAXBElement<NotFoundExepetion> createNotFoundExepetion(NotFoundExepetion value) {
        return new JAXBElement<NotFoundExepetion>(_NotFoundExepetion_QNAME, NotFoundExepetion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvEuroToTndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convEuroToTndResponse")
    public JAXBElement<ConvEuroToTndResponse> createConvEuroToTndResponse(ConvEuroToTndResponse value) {
        return new JAXBElement<ConvEuroToTndResponse>(_ConvEuroToTndResponse_QNAME, ConvEuroToTndResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvEuroToTnd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convEuroToTnd")
    public JAXBElement<ConvEuroToTnd> createConvEuroToTnd(ConvEuroToTnd value) {
        return new JAXBElement<ConvEuroToTnd>(_ConvEuroToTnd_QNAME, ConvEuroToTnd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvTndToAnyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convTndToAnyResponse")
    public JAXBElement<ConvTndToAnyResponse> createConvTndToAnyResponse(ConvTndToAnyResponse value) {
        return new JAXBElement<ConvTndToAnyResponse>(_ConvTndToAnyResponse_QNAME, ConvTndToAnyResponse.class, null, value);
    }

}
