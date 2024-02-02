package com.dp.StructuralDesignPatterns.AdapterPattern;

public class BusinessCardDesigner {
    public String designCard(Customer customer){
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
