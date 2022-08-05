package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service
@Qualifier("i18N")
public class EnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World-English";
    }
}
