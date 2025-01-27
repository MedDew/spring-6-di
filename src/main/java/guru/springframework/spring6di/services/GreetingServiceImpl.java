package guru.springframework.spring6di.controllers;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from ";
    }
}
