package ru.parsentev.task_013;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class MonoArray {
    private static final Logger log = getLogger(MonoArray.class);

    private final int[] values;

    public MonoArray(final int[] values) {
        this.values = values;
    }

    public boolean exists() {
        for (int i = 1; i < values.length; i++) {
            int tmp = values[0];
            if (values[i] != tmp) {
                return false;
            }
        }
        return true;
    }
}
