package com.patterns.generative.domain.fruit;

import com.patterns.generative.enums.FruitType;
import lombok.*;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Orange extends Fruit {

    private FruitType fruitType;

    @Builder
    public Orange(String name, FruitType fruitType) {
        super(name);
        this.fruitType = fruitType;
    }
}
