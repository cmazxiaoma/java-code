package 删除字符串中出现次数最少的字符;

import java.util.Scanner;

/**
 *
 * @author cmazxiaoma 删除字符串中出现次数最少的字符
 *         链接：https://www.nowcoder.com/questionTerminal/
 *         05182d328eb848dda7fdd5e029a56da9 来源：牛客网
 *         实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 *         输入描述: 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。 输出描述:
 *         删除字符串中出现次数最少的字符后的字符串。 示例1 输入 abcdd 输出 dd
 *
 */
public class TestDemo {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.nextLine();
            int a[] = new int[26];

            int count = str.length();

            for (int i = 0; i < count; i++) {
                char element = str.charAt(i);
                int n = element - 'a';
                a[n]++;
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 26; i++) {
                if (a[i] != 0 && a[i] < min) {
                    min = a[i];
                }
            }

            for (int i = 0; i < count; i++) {
                char element = str.charAt(i);
                int n = element - 'a';

                if (a[n] != min) {
                    System.out.print(element);
                }
            }
        }
        System.out.println();
    }
}