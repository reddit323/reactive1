package com.trf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TrfApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(TrfApplication.class, args);
                GreetingClient greetingclient=context.getBean(GreetingClient.class);
                
                System.out.println(">>message="+greetingclient.getMessage().block());
	}

}
