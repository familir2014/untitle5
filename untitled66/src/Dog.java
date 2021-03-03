public class Dog extends Animal {

    Dog(String name, int maxRunLenght, int maxFloatingLenght) {
        super(name, maxRunLenght, maxFloatingLenght);
    }
    void voice(){
        System.out.println(name + " Гав Гав");
    }

    void run(){
        System.out.println(name + " пробежала 500 метров");
    }

    void floating() {
        System.out.print(name + " проплыл 10 метров");

    }

}
