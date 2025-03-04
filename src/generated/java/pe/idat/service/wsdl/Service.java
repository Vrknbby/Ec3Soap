package pe.idat.service.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2024-11-25T10:10:09.468-05:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "Service",
                  wsdlLocation = "file:/C:/Users/IDAT/Desktop/Ec3/EC3/src/main/resources/wsdl/Service.wsdl",
                  targetNamespace = "http://idat.pe/Service/wsdl")
public class Service extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://idat.pe/Service/wsdl", "Service");
    public final static QName ServiceSOAPBinding = new QName("http://idat.pe/Service/wsdl", "ServiceSOAPBinding");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/IDAT/Desktop/Ec3/EC3/src/main/resources/wsdl/Service.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/IDAT/Desktop/Ec3/EC3/src/main/resources/wsdl/Service.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SoapServicePort
     */
    @WebEndpoint(name = "ServiceSOAPBinding")
    public SoapServicePort getServiceSOAPBinding() {
        return super.getPort(ServiceSOAPBinding, SoapServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapServicePort
     */
    @WebEndpoint(name = "ServiceSOAPBinding")
    public SoapServicePort getServiceSOAPBinding(WebServiceFeature... features) {
        return super.getPort(ServiceSOAPBinding, SoapServicePort.class, features);
    }

}
