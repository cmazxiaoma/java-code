package 删除字符串中出现次数最少的字符;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TestDemoX {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            char[] inputChars = input.toCharArray();

            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

            for (char c : inputChars) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            Collection<Integer> values = map.values();
            Integer minIndex = Collections.min(values);
            StringBuffer sb = new StringBuffer();

            for (char key : inputChars) {
                if (map.get(key) != minIndex) {
                    sb.append(key);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
