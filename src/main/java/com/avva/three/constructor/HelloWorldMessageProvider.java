package com.avva.three.constructor;

import com.avva.three.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

// ----- bean definitions using @Component -----
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello AVVA!";
    }
}
