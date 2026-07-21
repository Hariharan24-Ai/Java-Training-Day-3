public class Twopointer {
    public static void main(String[] args) {
        String str = "hello";
        char[] chars = str.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(chars));
    }
}
