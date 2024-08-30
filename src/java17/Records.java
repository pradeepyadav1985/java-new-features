package java17;


public class Records {
//    public record User (String name, int age){}

    public record User (String name, int age){
        public User {  //custom validation in constructor
            if (name.isBlank() || age <= 0) {
                //throw exception
            }
        }
    }

    //records are by default final, uncommenting below code will give compilation error.
    /*public class ExpertUser extends User{

        public ExpertUser(String name, int age) {
            super(name, age);
        }
    }*/

    public static void main(String[] args) {
        //jdk 16 - records
        new User("Pradeep", 40);
        System.out.println(new User("Pradeep", 40));
        System.out.println(new User("Pradeep", 40).equals(new User("Pradeep", 40)));//similarly toString(), hashcode() & equals()

    }
}
