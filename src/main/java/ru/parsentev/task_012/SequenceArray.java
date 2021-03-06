package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        int result = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == 1) {
                result++;
            } else {
                result = 0;
            }
            if (result == 3) {
                break;
            }
        }
        return result >= 3;
    }
}
