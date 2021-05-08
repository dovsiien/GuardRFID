public class Main {

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.toString().replaceAll(" ",""));
        return sb.toString().replaceAll("[,.;!?:\"' ]","")
                .equalsIgnoreCase(sb.reverse().toString().toLowerCase().replaceAll("[,.;!?:\"' ]",""));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Eva, can I see bees in a cave?"));
    }
}
