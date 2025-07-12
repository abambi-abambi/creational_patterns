package com.patterns.generative.domain.animal;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public abstract class AbstractAnimal {

    private String name;
}
