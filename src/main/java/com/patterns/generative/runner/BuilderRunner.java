package com.patterns.generative.runner;

import com.patterns.generative.domain.animal.Cat;
import com.patterns.generative.domain.fruit.Apple;
import com.patterns.generative.domain.fruit.Orange;
import com.patterns.generative.enums.FruitType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BuilderRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("--- Builder example ---");

        var apple = Apple.builder()
                .name("green apple")
                .fruitType(FruitType.APPLE)
                .build();
        log.info("apple from builder: {}", apple);

        var orange = Orange.builder()
                .name("orange orange")
                .fruitType(FruitType.ORANGE)
                .build();

        log.info("orange from builder: {}", orange);

        var cat = Cat.builder()
                .name("small cat")
                .size(1)
                .build();

        log.info("cat from superBuilder: {}", cat);
    }
}
