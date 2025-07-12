package com.patterns.generative.domain.fruit;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AbstractFruit {

    private String name;

    public AbstractFruit(String name) {
        this.name = name;
    }
}
