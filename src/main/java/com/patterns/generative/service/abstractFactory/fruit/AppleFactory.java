package com.patterns.generative.service.abstractFactory.fruit;

import com.patterns.generative.domain.fruit.Apple;
import org.springframework.stereotype.Component;

@Component("abstractFactoryAppleFactory")
public class AppleFactory implements ConcreteAbstractFactory<Apple> {

    @Override
    public Apple create() {
        return new Apple();
    }
}
