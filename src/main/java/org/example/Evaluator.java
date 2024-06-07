package org.example;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Evaluator {
    private Map<String,Boolean> knowledgeBase;

    public Evaluator() {
        knowledgeBase = new HashMap<>();
        knowledgeBase.put("Le ciel est bleu",true);
        knowledgeBase.put("Le ciel est rouge",false);
    }

    public Boolean evaluate(Assertion assertion) {
        String statement = assertion.getStatement();
        return knowledgeBase.getOrDefault(statement,null);
    }
}
