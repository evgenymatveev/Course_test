package ru.parsentev.task_004;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class IsoscelesTriangle extends Triangle {
    private static final Logger log = getLogger(IsoscelesTriangle.class);

    public IsoscelesTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double ab = first.distanceTo(second);
        double bc = second.distanceTo(third);
        double ca = third.distanceTo(first);

        return (ab + bc > ca && bc + ca > ab && ab + ca > bc && ((ab == bc && ab != ca && bc != ca)
                || (bc == ca && bc != ab && ca != ab)
                || (ca == ab && ca != bc && ab != bc)));
    }
}
