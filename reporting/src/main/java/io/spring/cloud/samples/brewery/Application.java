package io.spring.cloud.samples.brewery;

import io.spring.cloud.samples.brewery.common.events.EventSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(EventSink.class)
public class Application {

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
}
