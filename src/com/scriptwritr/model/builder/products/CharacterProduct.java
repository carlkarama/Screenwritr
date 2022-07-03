package com.scriptwritr.model.builder.products;

import com.scriptwritr.model.builder.abstractions.AbstractProduct;

import java.util.LinkedList;

public class CharacterProduct extends AbstractProduct {

    private LinkedList<String> characterProducts;

    public CharacterProduct() {
        this.characterProducts = new LinkedList<>();
    }

    public void add(String character) {
        this.characterProducts.add(character);
    }

    @Override
    public void display() {
        for (String product : this.characterProducts) {
            System.out.println(product);
        }
    }
}
