public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();

        Cat cat = new Cat("Кошак", 10, 0);
        Dog dog = new Dog("Собакен", 500, 10);


        cat.voice();
        dog.voice();
        cat.run();
        dog.run();
        cat.floating();
        dog.floating();






    }


}
