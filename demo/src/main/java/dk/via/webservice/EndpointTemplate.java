package dk.via.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;

@Endpoint
public class EndpointTemplate {
    @PayloadRoot(namespace = WebServiceConfig.NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public MethodResponse method(@RequestPayload MethodRequest request) {
        return null;
    }
}
