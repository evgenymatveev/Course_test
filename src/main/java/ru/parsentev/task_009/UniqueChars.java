package ru.parsentev.task_009;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        char[] ch = line.toCharArray();
        int result = ch.length;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if(i != j && ch[i] == ch[j]) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UniqueChars unique = new UniqueChars("2+2");
        System.out.println(unique.unique());
    }
}

