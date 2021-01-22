package com.demotivirus.Day_032.main.endpoint;

import com.demotivirus.Day_032.main.loaneligibility.Acknowledgement;
import com.demotivirus.Day_032.main.loaneligibility.CustomerRequest;
import com.demotivirus.Day_032.main.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEligibilityindicatorEndpoint {
    @Autowired
    private LoanEligibilityService service;

    //http://localhost:8080/ws/loanEligibility.wsdl
    @PayloadRoot(namespace = "soap", localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request){
        return service.checkLoan(request);
    }
}
