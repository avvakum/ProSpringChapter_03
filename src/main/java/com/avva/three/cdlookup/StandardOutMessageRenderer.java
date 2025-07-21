package com.avva.three.cdlookup;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    public StandardOutMessageRenderer() {
        System.out.println(" -----> StandardOutMessageRenderer: constructor called");
    }

    @Override
    public void performLookup(Container container) {
        this.messageProvider = (MessageProvider) container.getDependency("provider");
    }

    @Override
    public String toString() {
        return messageProvider.toString();
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
