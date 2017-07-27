package ru.parsentev.task_008;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;
    private List<Integer> list;


    public Primes(final int limit) {
        this.limit = limit;
        this.list = new ArrayList<Integer>();
    }

    public List<Integer> calc() {
        int counter = 0;
         for (int i = 0; i <= limit; i++) {
             if(i != 0 && i != 1 && i % 2 != 0 || i == 2) {
                    for (int j = 2; j < i; j++) {
                        counter = 0;
                        if(i % j == 0) {
                            counter++;
                            break;
                        }
                    }
                    if(counter == 0) {
                        list.add(i);
                    }
             }
         }
        return list;
    }
}
