package ru.parsentev.task_014;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder();
        String[] str = line.split(" ");
        for (int i = 0; i < str.length / 2; i++) {
            for (int j = str.length - 1; j > str.length / 2 ; j--) {
                String tmp = str[i];
                str[i] = str[j];
                str[j] = tmp;
            }
        }
        for (int i = 0; i < str.length; i++) {
            sb = sb.append(str[i]);
            if(i != str.length - 1) {
                sb = sb.append(" ");
            }
        }
        return sb.toString();
    }
}


