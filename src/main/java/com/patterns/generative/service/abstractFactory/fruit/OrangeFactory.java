package com.patterns.generative.service.abstractFactory.fruit;

import com.patterns.generative.domain.fruit.Orange;
import org.springframework.stereotype.Component;

@Component("abstractFactoryOrangeFactory")
public class OrangeFactory implements ConcreteAbstractFactory<Orange> {

    @Override
    public Orange create() {
        return new Orange();
    }
}
