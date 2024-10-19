
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

    private final static QName _GetAllCurrenciesResponse_QNAME = new QName("http://service/", "getAllCurrenciesResponse");
    private final static QName _ConvertTndToAnyResponse_QNAME = new QName("http://service/", "convertTndToAnyResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://service/", "getCompte");
    private final static QName _GetAllCurrencies_QNAME = new QName("http://service/", "getAllCurrencies");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service/", "getComptesResponse");
    private final static QName _ConvertUsdToAnyResponse_QNAME = new QName("http://service/", "convertUsdToAnyResponse");
    private final static QName _NotFoundException_QNAME = new QName("http://service/", "NotFoundException");
    private final static QName _GetComptes_QNAME = new QName("http://service/", "getComptes");
    private final static QName _ConvertTndToAny_QNAME = new QName("http://service/", "convertTndToAny");
    private final static QName _ConvertEuroToTndResponse_QNAME = new QName("http://service/", "convertEuroToTndResponse");
    private final static QName _ConvertUsdToAny_QNAME = new QName("http://service/", "convertUsdToAny");
    private final static QName _ConvertEuroToTnd_QNAME = new QName("http://service/", "convertEuroToTnd");

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
     * Create an instance of {@link ConvertTndToAnyResponse }
     * 
     */
    public ConvertTndToAnyResponse createConvertTndToAnyResponse() {
        return new ConvertTndToAnyResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetAllCurrenciesResponse }
     * 
     */
    public GetAllCurrenciesResponse createGetAllCurrenciesResponse() {
        return new GetAllCurrenciesResponse();
    }

    /**
     * Create an instance of {@link NotFoundException }
     * 
     */
    public NotFoundException createNotFoundException() {
        return new NotFoundException();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link ConvertUsdToAnyResponse }
     * 
     */
    public ConvertUsdToAnyResponse createConvertUsdToAnyResponse() {
        return new ConvertUsdToAnyResponse();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link GetAllCurrencies }
     * 
     */
    public GetAllCurrencies createGetAllCurrencies() {
        return new GetAllCurrencies();
    }

    /**
     * Create an instance of {@link ConvertUsdToAny }
     * 
     */
    public ConvertUsdToAny createConvertUsdToAny() {
        return new ConvertUsdToAny();
    }

    /**
     * Create an instance of {@link ConvertEuroToTndResponse }
     * 
     */
    public ConvertEuroToTndResponse createConvertEuroToTndResponse() {
        return new ConvertEuroToTndResponse();
    }

    /**
     * Create an instance of {@link ConvertTndToAny }
     * 
     */
    public ConvertTndToAny createConvertTndToAny() {
        return new ConvertTndToAny();
    }

    /**
     * Create an instance of {@link ConvertEuroToTnd }
     * 
     */
    public ConvertEuroToTnd createConvertEuroToTnd() {
        return new ConvertEuroToTnd();
    }

    /**
     * Create an instance of {@link CompteEntity }
     * 
     */
    public CompteEntity createCompteEntity() {
        return new CompteEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurrenciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCurrenciesResponse")
    public JAXBElement<GetAllCurrenciesResponse> createGetAllCurrenciesResponse(GetAllCurrenciesResponse value) {
        return new JAXBElement<GetAllCurrenciesResponse>(_GetAllCurrenciesResponse_QNAME, GetAllCurrenciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertTndToAnyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertTndToAnyResponse")
    public JAXBElement<ConvertTndToAnyResponse> createConvertTndToAnyResponse(ConvertTndToAnyResponse value) {
        return new JAXBElement<ConvertTndToAnyResponse>(_ConvertTndToAnyResponse_QNAME, ConvertTndToAnyResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurrencies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCurrencies")
    public JAXBElement<GetAllCurrencies> createGetAllCurrencies(GetAllCurrencies value) {
        return new JAXBElement<GetAllCurrencies>(_GetAllCurrencies_QNAME, GetAllCurrencies.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertUsdToAnyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertUsdToAnyResponse")
    public JAXBElement<ConvertUsdToAnyResponse> createConvertUsdToAnyResponse(ConvertUsdToAnyResponse value) {
        return new JAXBElement<ConvertUsdToAnyResponse>(_ConvertUsdToAnyResponse_QNAME, ConvertUsdToAnyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "NotFoundException")
    public JAXBElement<NotFoundException> createNotFoundException(NotFoundException value) {
        return new JAXBElement<NotFoundException>(_NotFoundException_QNAME, NotFoundException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertTndToAny }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertTndToAny")
    public JAXBElement<ConvertTndToAny> createConvertTndToAny(ConvertTndToAny value) {
        return new JAXBElement<ConvertTndToAny>(_ConvertTndToAny_QNAME, ConvertTndToAny.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToTndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertEuroToTndResponse")
    public JAXBElement<ConvertEuroToTndResponse> createConvertEuroToTndResponse(ConvertEuroToTndResponse value) {
        return new JAXBElement<ConvertEuroToTndResponse>(_ConvertEuroToTndResponse_QNAME, ConvertEuroToTndResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertUsdToAny }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertUsdToAny")
    public JAXBElement<ConvertUsdToAny> createConvertUsdToAny(ConvertUsdToAny value) {
        return new JAXBElement<ConvertUsdToAny>(_ConvertUsdToAny_QNAME, ConvertUsdToAny.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToTnd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertEuroToTnd")
    public JAXBElement<ConvertEuroToTnd> createConvertEuroToTnd(ConvertEuroToTnd value) {
        return new JAXBElement<ConvertEuroToTnd>(_ConvertEuroToTnd_QNAME, ConvertEuroToTnd.class, null, value);
    }

}
