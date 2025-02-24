public class Lab2Task3 {
    public static void main(String[] args) {
        String str = " Я помню ЧУДНОЕ мгновенье ";

        // Убираем пробелы в начале и конце строки
        str = str.trim();

        // Преобразуем строку в нижний регистр
        str = str.toLowerCase();

        // Выводим результат
        System.out.println(str);
    }
}