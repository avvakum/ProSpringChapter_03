package com.avva.three.configurable;

import com.avva.three.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//  --- bean definitions using @Component ---
//simple bean
@Component("provider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
        System.out.println(" -----( Injecting '" + message + "' value into constructor )-----");
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
