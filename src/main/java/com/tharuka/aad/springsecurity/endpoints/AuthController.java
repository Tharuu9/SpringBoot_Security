package com.tharuka.aad.springsecurity.endpoints;

import com.tharuka.aad.springsecurity.model.UserDetails;
import com.tharuka.aad.springsecurity.response.Response;
import com.tharuka.aad.springsecurity.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
@CrossOrigin

public class AuthController {
    @Autowired
    private Response response;
    @Autowired
    private AuthService authService;
    @PostMapping(path = "/register",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response register(@RequestBody UserDetails userDetails){
        authService.register(userDetails);
        return response;
    }


}
