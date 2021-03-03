public class Cat extends Animal {


    Cat(String name, int maxRunLenght, int maxFloatingLenght)

        {
            super(name, maxRunLenght, maxFloatingLenght);
        }

        void voice(){
         System.out.println(name + " Мяу");
        }

        void run()
        {
            System.out.print(name + " пробежал 10 метров");
        }

        void floating() { System.out.println(name + "Кошак не умеет плавать");}








}
