package com.patterns.generative.service.abstractFactory;

import com.patterns.generative.domain.fruit.Apple;
import com.patterns.generative.domain.fruit.Orange;

public interface FruitFactory {

    Apple createApple();

    Orange createOrange();
}
