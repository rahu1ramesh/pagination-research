package com.research.pagination.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BackendApplication {

    private static final Logger log = LoggerFactory.getLogger(BackendApplication.class);

	public static void main(String[] args) {

        try {
            SpringApplication.run(BackendApplication.class, args);
        } catch (Exception e) {
            log.error("Application failed to start, {}", e.getMessage());
        }
	}

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReady() {
        log.info("Application has successfully started and is ready!");
    }
}
