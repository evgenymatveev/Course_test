package ru.parsentev.task_003;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        double ab = first.distanceTo(second);
        double bc = second.distanceTo(third);
        double ca = third.distanceTo(first);
        return ab + bc > ca && bc + ca > ab && ab + ca > bc;
    }

    public double area() {
        double ab = first.distanceTo(second);
        double bc = second.distanceTo(third);
        double ca = third.distanceTo(first);

        double d = (ab + bc + ca)/2;
        double s = Math.sqrt(d*(d-ab)*(d-bc)*(d-ca));

        if (s > 0) {
            return Math.round(s);
        } else {
            throw new IllegalStateException();
        }
    }
}
