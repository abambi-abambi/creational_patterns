package com.patterns.generative.service.factoryMethod.fruit;

import com.patterns.generative.domain.fruit.Orange;
import org.springframework.stereotype.Component;

@Component
public class OrangeFactory implements ConcreteFruitFactory<Orange> {
    @Override
    public Orange create() {
        return new Orange();
    }
}
