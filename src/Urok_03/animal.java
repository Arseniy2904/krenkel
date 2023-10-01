package Urok_03;

class Animal {
    public String animal;
    public String name;
    public double weight;
    private double weigh;

    public static void zvuk(String animal) {
        if (animal == "кот") {
            System.out.println("Мяууу Мяууу");
        } else if (animal == "Собака") {
            System.out.println("Гаав Гаав");
        } else if (animal == "Попугай") {
            System.out.println("Чик Чирик");
        }
    }

    public static double eda(Animal animal1) {
        System.out.println("Мням Мням Мням");
        animal1.weight = animal1.weight + 0.1;
        return animal1.weigh;

    }

    public class main {
        public static void main(String[] args) {
            Animal animal1 = new Animal();
            animal1.animal = "Кот";
            animal1.name = "Пуся";
            animal1.weight = 12.450;
        }
    }

}
