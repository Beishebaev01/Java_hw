public class Lab2Task4 {
    public static void main(String[] args) {
        String text = "This is a very big house with a very big garden.";

        String result = replaceVeryBig(text);

        System.out.println(result);
    }

    public static String replaceVeryBig(String str) {
        return str.replace("very big", "enormous");
    }
}
