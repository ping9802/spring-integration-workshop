package br.com.andreluisgomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
@Import(ChannelConfig.class)
public class App {

	public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);

    GreeterService greeterService = ctx.getBean( "greeterServiceImpl", GreeterService.class );
    //greeterService.greet( "André!Luis!Gomes!" );
    greeterService.greet( new Integer(1) );
	}
}
