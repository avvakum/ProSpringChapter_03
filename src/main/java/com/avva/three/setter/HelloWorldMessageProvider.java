package com.avva.three.setter;

import com.avva.three.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

// --- bean definitions using @Component and @Autowired ---
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return " Hello AVVA!";
    }
}
