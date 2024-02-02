package com.dp.StructuralDesignPatterns.DecoratorPattern;

public class DecoratorClient {
    public static void main(String[] args) {
        Message m = new TextMessage("The <FORCE> is strong here");
        System.out.println(m.getContent());

        // Html decorator
        Message decoratorPattern = new HtmlEncodedMessage(m);
        System.out.println(decoratorPattern.getContent());

        // Base64 decorator
        decoratorPattern = new Base64EncodedMessage(decoratorPattern);
        System.out.println(decoratorPattern.getContent());
    }
}
