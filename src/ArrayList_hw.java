import java.util.ArrayList;

public class ArrayList_hw {
    public static void main(String[] args) {
        // 1 - список основной группы
        ArrayList<String> ib = new ArrayList<>();
        ib.add("Argen");
        ib.add("Emir");
        ib.add("Astra");
        ib.add("Joma");
        ib.add("Dastan");
        System.out.println("Список группы ИБ: " + ib);

        // 2 - список ускоренной группы
        ArrayList<String> usk = new ArrayList<>();
        usk.add("Azim");
        usk.add("Atay");
        usk.add("Doni");
        System.out.println("Список ускоренной группы: " + usk);

        // 2 - Объединение двух групп
        ib.addAll(usk);
        System.out.println("Список после объединения: " + ib);

        // 3 - список отчисленных студентов
        ArrayList<String> otch = new ArrayList<>();
        otch.add("Argen"); // неуспеваемость
        otch.add("Doni"); // перевелся
        otch.add("Emir"); // неуспеваемость
        System.out.println("Список отчисленных студентов: " + otch);

        // 4 - удаление студентов за неуспеваемость
        ib.remove("Argen");
        ib.remove("Emir");
        System.out.println("Список после удаления: " + ib);

        // 5 - Проверка переведенных на другие спец
        String student = "Doni";
        boolean perevelsya = ib.contains(student);
        System.out.println("Есть ли переведенные студенты: " + perevelsya);

        // 6 - нахождение позации
        for (String i : ib) {
            if (i.equals(student)) {
                int pos = ib.indexOf(student);
                System.out.println(student + " находится на позиции " + pos);
            }
        }

        ib.remove("Doni");
        System.out.println("Список после удаления переведенного: " + ib);
    }
}