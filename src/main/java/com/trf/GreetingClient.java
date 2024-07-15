/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trf;

import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class GreetingClient {
     private final WebClient client;
     
     
     public GreetingClient(WebClient.Builder builder){
         this.client=builder.baseUrl("http://localhost:8080").build();
     
}
     
     public Mono<String> getMessage(){
         return this.client.get().uri("/trf").accept(MediaType.APPLICATION_JSON).retrieve()
                 .bodyToMono(Greeting.class)
                 .map(Greeting::getMessage);
     }
}