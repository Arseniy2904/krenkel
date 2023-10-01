package Urok_03;

public class User {
    public static void main(String[] args) {
        String firstName = "Фамилия" , secondName = "Имя", lastName = "Отчество";
        String str = String.format(
                "это инициалы: %s, %s и %s",
                firstName,
                secondName,
                lastName

        );
        System.out.println(str);
    }
}
