public class Lab2Task4 {
    public static void main(String[] args) {
        String text = "This is a very big house with a very big garden.";

        // Вызов метода для замены
        String result = replaceVeryBig(text);

        // Вывод результата
        System.out.println(result);
    }

    // Метод для замены "very big" на "enormous"
    public static String replaceVeryBig(String str) {
        return str.replace("very big", "enormous");
    }
}
