package com.demotivirus.Day_031.soap;

import com.demotivirus.Day_031.model.Goods;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Endpoint
public interface Greeting {
    @WebMethod
    @PayloadRoot(namespace = "soap", localPart = "getUserRequest")
    @ResponsePayload
    String sayHello(@WebParam(name = "name") String name);

    @WebMethod
    Goods getGoods();
}
