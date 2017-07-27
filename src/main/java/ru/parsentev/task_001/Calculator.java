package ru.parsentev.task_001;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);
    private double result;

    public double getResult() {
        return this.result = result;
    }

    public void add(double first, double second) {
        result = first + second;
    }

    public void substract(double first, double second) {
        result = first - second;
    }

    public void multiple(double first, double second) {
        result = first * second;
    }

    public void div(double first, double second) {
        if(second == 0d) {
            throw new IllegalStateException("На ноль делить нельзя!");
        } else {
            result = first / second;
        }
    }

    public void expand(double first, double second) {
        double tmp = first;
        for (int i = 0; i < second - 1; i++) {
            tmp = tmp * first;
        }
        result = tmp;
    }
}
