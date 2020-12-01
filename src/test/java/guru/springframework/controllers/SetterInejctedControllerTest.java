package guru.springframework.controllers;

import guru.springframework.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInejctedControllerTest {

    SetterInejctedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInejctedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}