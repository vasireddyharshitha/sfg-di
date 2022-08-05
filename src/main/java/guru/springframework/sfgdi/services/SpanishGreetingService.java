package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service
@Qualifier("i18N")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola - Spanish";
    }
}
