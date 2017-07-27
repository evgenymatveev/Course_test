package ru.parsentev.task_010;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        char[] ch = line.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if(ch[i] == '(') {
                if (ch[i + 1] == ')')  {
                    return true;
                }
            }
        }
        return false;
    }
}
