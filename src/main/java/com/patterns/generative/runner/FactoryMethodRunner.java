package com.patterns.generative.runner;

import com.patterns.generative.enums.FruitType;
import com.patterns.generative.service.factoryMethod.FruitFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FactoryMethodRunner implements CommandLineRunner {

    private final FruitFactory fruitFactory;

    @Override
    public void run(String... args) throws Exception {
        log.info("--- FactoryMethod example ---");

        var apple = fruitFactory.create(FruitType.APPLE);
        log.info("apple from FactoryMethod: {}", apple);

        var orange = fruitFactory.create(FruitType.ORANGE);
        log.info("orange from FactoryMethod: {}", orange);
    }
}
