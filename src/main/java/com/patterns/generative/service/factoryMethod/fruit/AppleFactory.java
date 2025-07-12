package com.patterns.generative.service.factoryMethod.fruit;

import com.patterns.generative.domain.fruit.Apple;
import org.springframework.stereotype.Component;

@Component
public class AppleFactory implements ConcreteFruitFactory<Apple> {
    @Override
    public Apple create() {
        return new Apple();
    }
}
