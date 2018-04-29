package 把连续的字符串进行压缩;

public class Demo {

    public static void main(String[] args) {
        encode("aaabbcaa");
        encode("a");
        encode("abcabc");
        encode("ppppp");
        encode("");
        encode(null);
    }

    public static void encode(String str) {
        if (str == null || str.equals("")) {
            System.out.println("");
            return;
        }

        StringBuffer sb = new StringBuffer();
        int count = 1;
        char element = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == element) {
                count++;
            } else {
                sb.append(element);
                sb.append(count == 1 ? "" : count);
                element = str.charAt(i);
                count = 1;
            }
        }

        sb.append(element);
        sb.append(count == 1 ? "" : count);

        System.out.println(sb.toString());
    }
}
