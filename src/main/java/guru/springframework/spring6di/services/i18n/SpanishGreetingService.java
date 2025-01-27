package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service("i18Nservice")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
