package com.demotivirus.Day_030.main.endpoint;

import com.demotivirus.Day_030.main.service.UserService;
import com.demotivirus.Day_030.main.soap.GetUserRequest;
import com.demotivirus.Day_030.main.soap.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "soap", localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUser(request.getName()));
        return response;
    }
}
