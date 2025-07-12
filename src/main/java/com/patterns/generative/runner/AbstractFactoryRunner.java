package com.patterns.generative.runner;

import com.patterns.generative.enums.FruitType;
import com.patterns.generative.service.abstractFactory.FruitFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AbstractFactoryRunner implements CommandLineRunner {

    private final FruitFactory fruitFactory;

    @Override
    public void run(String... args) throws Exception {
        log.info("--- AbstractFactory example ---");

        var apple = fruitFactory.createApple();
        log.info("apple from AbstractFactory: {}", apple);

        var orange = fruitFactory.createOrange();
        log.info("orange from AbstractFactory: {}", orange);
    }
}
