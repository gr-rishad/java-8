package com.learnjava.optional;

import java.util.Optional;

public class OptionalOfNullableExample {

    public static Optional<String> ofNullable() {
        Optional<String> stringOptional = Optional.ofNullable("Hello");
        return stringOptional;
    }

    public static Optional<String> of() {
        Optional<String> stringOptional = Optional.of("Hello");
        return stringOptional;
    }

    public static Optional<String> empty() {
        return Optional.empty();
    }

    public static void main(String[] args) {

        System.out.println("OfNullable() ::" + ofNullable().isPresent());
        System.out.println("Of() ::" + of().isPresent());
        System.out.println("empty() ::" + empty());
    }
}
