package com.patterns.generative.service.factoryMethod.fruit;

public interface ConcreteFruitFactory<T> {
    T create();
}
