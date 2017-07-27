package ru.parsentev.task_005;

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
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double ab = first.distanceTo(second);
        double bc = second.distanceTo(third);
        double ca = third.distanceTo(first);

        return (ab == bc && bc == ca && ca == ab && ab != 0);
    }
}
