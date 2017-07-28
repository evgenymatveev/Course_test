package ru.parsentev.task_015;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    private final int[] values;

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {
        for (int j = 0; j < position; j++) {
            int end = values[values.length - 1];
            System.arraycopy(values, 0, values, 1, values.length - 2 + 1);
            values[0] = end;
        }
        return values;
    }
}
