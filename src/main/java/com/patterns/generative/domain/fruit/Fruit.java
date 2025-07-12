package com.patterns.generative.domain.fruit;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Fruit {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }
}
