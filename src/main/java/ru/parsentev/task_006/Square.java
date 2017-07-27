package ru.parsentev.task_006;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_004.IsoscelesTriangle;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public boolean exists() {
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(fourth);
        double d = fourth.distanceTo(first);
        IsoscelesTriangle tr1 = new IsoscelesTriangle(first, second, third);
        IsoscelesTriangle tr2 = new IsoscelesTriangle(first, third, fourth);

        return a == b && b == c && c == a && tr1.exists() && tr2.exists();
    }
}
