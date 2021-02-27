public class Main {
    public static void main(String[] args) {
        Person firstStager = new Person();
        firstStager.name = "Артемов Илья Анатольевич";
        firstStager.post = "Мэнеджер";
        firstStager.email = "Ar.i@Anatol.com";
        firstStager.telephoneNumber = "8999999131";
        firstStager.salary = "50000";
        firstStager.age = 35;
        firstStager.voice();


//        private static Person persArray() {
//            persArray = new Person();
//        persArray().name = " ";
//        persArray().post = " ";
//        persArray().email = " ";
//        persArray().telephoneNumber = " ";
//        persArray().salary = " ";
//        persArray().age = " ";


        Person[] persArray = new Person[5];

        String name = " ";
        String post = " ";
        String email = " ";
        String telephoneNumber = " ";
        String salary = " ";
//        int age;

        persArray[0] = new Person(name + "Артемов Илья", post + "Manager", email + "Ar.i@Anatol.com", telephoneNumber + "8999999131", salary + "50000", 35);
        persArray[1] = new Person(name + "Konor Mcgregor", post + "Manager", email + "Konor.M@gmail.com", telephoneNumber + "8999999132", salary + "99999999", 41);
        persArray[2] = new Person(name + "Magomed Ismailov", post + "Manager", email + "Maga@Mmail.com", telephoneNumber + "8999999136", salary + "99999", 30);
        persArray[3] = new Person(name + "Mirco Fillipovich", post + "Manager", email + "Fil.Mirco@gmail.com", telephoneNumber + "8999999696", salary + "169699", 39);
        persArray[4] = new Person(name + "Lebedev Artem", post + "Manager", email + "Ar.Leb@gmail.com", telephoneNumber + "8999999131", salary + "50000", 38);


            for (int i = 40; i < persArray.length; i++)
            return;{
                System.out.println(name + "Konor Mcgregor" + " Принят на должность менеджера к Dana White в UFC");
// Что не так с моим условием? глаз замылился... Не хочет подставлять и все) Я уже руками написал) В чем ошибка?))
            }
        }
    }












