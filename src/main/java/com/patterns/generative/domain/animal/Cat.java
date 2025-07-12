package com.patterns.generative.domain.animal;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
// to use fields from the parent
@ToString(callSuper = true)
public class Cat extends AbstractAnimal {

    private int size;
}
