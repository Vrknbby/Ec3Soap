package pe.idat.EC3;


import pe.idat.EC3.impl.MovieServiceImpl;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(MovieServiceImpl movieServiceimpl){
        Endpoint endpoint = new EndpointImpl(bus, movieServiceimpl, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/Service");
        return endpoint;
    }
}
