public class Animal {

    public String name;
//    public int run;
//    public int floating;

    protected int maxRunLenght;
    protected int maxFloatingLenght;


    public Animal(String name, int maxRunLenght, int maxFloatingLenght)
    {
        this.name = name;
        this.maxRunLenght = maxFloatingLenght;
        this.maxFloatingLenght = maxRunLenght;
    }
    void voice()
    {
        System.out.println(name + " сказал");
    }
    void run() {
        System.out.println(name + " пробежал");
    }

    void floating() {
        System.out.println(name + " проплыл");
    }


}


