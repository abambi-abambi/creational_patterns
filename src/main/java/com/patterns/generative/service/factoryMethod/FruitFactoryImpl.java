package com.patterns.generative.service.factoryMethod;

import com.patterns.generative.domain.fruit.Fruit;
import com.patterns.generative.enums.FruitType;
import com.patterns.generative.service.factoryMethod.fruit.AppleFactory;
import com.patterns.generative.service.factoryMethod.fruit.OrangeFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Factory Method pattern realization
 */

@Service
@RequiredArgsConstructor
public class FruitFactoryImpl implements FruitFactory {

    /**
     * in case of dynamic realization it wood look like strategy pattern
     */

    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;
    @Override
    public Fruit create(FruitType fruitType) {
        return switch (fruitType) {
            case APPLE -> appleFactory.create();
            case ORANGE -> orangeFactory.create();
        };
    }
}
