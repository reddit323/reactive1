/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

  import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
    import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
    
    
    @Configuration(proxyBeanMethods=false)
public class GreetingRouter {
    
  
    @Bean
    public RouterFunction<ServerResponse>router(GreetingHandler greetinghandler){
        return RouterFunctions
                .route(GET("/trf").and(accept(MediaType.APPLICATION_JSON)),greetinghandler::trf);
    }
    
}
