package com.patterns.generative.service.abstractFactory;

import com.patterns.generative.domain.fruit.Apple;
import com.patterns.generative.domain.fruit.Orange;
import com.patterns.generative.service.abstractFactory.fruit.AppleFactory;
import com.patterns.generative.service.abstractFactory.fruit.OrangeFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Abstract Factory pattern realization
 */

@Service("abstractFactoryFruitFactoryImpl")
@RequiredArgsConstructor
public class FruitFactoryImpl implements FruitFactory {

    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;

    @Override
    public Apple createApple() {
        return appleFactory.create();
    }

    @Override
    public Orange createOrange() {
        return orangeFactory.create();
    }
}
