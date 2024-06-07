package org.example;

import lombok.Getter;

@Getter
public class Assertion {
    private String statement;

    public Assertion(String statement) {
        this.statement = statement;
    }
}
