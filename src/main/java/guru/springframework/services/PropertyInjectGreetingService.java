package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -- Property";
    }
}
