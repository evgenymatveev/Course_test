package ru.parsentev.task_007;

import org.slf4j.Logger;
import ru.parsentev.task_001.Calculator;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);
    private Calculator calculator;

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
        this.calculator = new Calculator();
    }

    public double calc() {
        String a = "";
        String b = "";
        String operator = "";
        char[] str = expr.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if(Character.isDigit(str[i])) {
                a = a + str[i];
            } else {
                operator = operator + str[i];
                if(Character.isDigit(str[i + 1])) {
                    b = a;
                    a = "";
                }
            }
            if(!Character.isDigit(str[0]) || !Character.isDigit(str[str.length - 1])) {
                throw new IllegalStateException("Не корректно введены данные!");
            }
        }
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        if(operator.equals("+")) {
            calculator.add(b1, a1);
        }
        if(operator.equals("-")) {
            calculator.substract(b1, a1);
        }
        if(operator.equals("*")) {
            calculator.multiple(b1, a1);
        }
        if(operator.equals("/")) {
            calculator.div(b1, a1);
        }
        if(operator.equals("exp")) {
            calculator.expand(b1, a1);
        }
        return calculator.getResult();
    }
}
