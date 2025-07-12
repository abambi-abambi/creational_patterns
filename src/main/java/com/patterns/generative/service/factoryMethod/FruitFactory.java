package com.patterns.generative.service.factoryMethod;

import com.patterns.generative.domain.fruit.Fruit;
import com.patterns.generative.enums.FruitType;
import jakarta.validation.constraints.NotNull;

public interface FruitFactory {

    Fruit create(FruitType fruitType);
}
