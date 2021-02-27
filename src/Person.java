public class Person {


    String name;
    String post;
    String email;
    String telephoneNumber;
    String salary;
    int age;






    public Person(String name, String post, String email, String telephoneNumber, String salary, int age) {

        this.name = name;
        this.post = post;
        this.email = email;
       this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
   }

    public Person() {

    }

        void voice ()
        {
            System.out.println(name + " первый кандидат");
            System.out.println(post + " Предлагаемая должность");
            System.out.println(email + " Электронный адрес кандидата");
            System.out.println(telephoneNumber + " номер телефона");
            System.out.println(salary + " Оклад кандидата");
            System.out.println(age + " лет - Возраст кандидата");

        }
    }

