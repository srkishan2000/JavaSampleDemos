package com.shan.sample.pattern.buildpattern;

public interface CarBuilder {
	Car build();

    CarBuilder setColor(final String color);

    CarBuilder setWheels(final int wheels);
}
