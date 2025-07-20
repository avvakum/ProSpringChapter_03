package com.avva.three.configurable;

import com.avva.three.decoupled.MessageProvider;
import com.avva.three.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// complex bean requiring a dependency
@Component("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Autowired
    public StandardOutMessageRenderer(MessageProvider messageProvider) {
        System.out.println(" -----( Injecting dependency using constructor )-----");
        this.messageProvider = messageProvider;
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }
}
