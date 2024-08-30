package java17;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {

        //jdk 16 pattern matching for instance of
        Object name = "ING";
        if(name instanceof String){
            String str = (String) name;
            if(str.length() == 3){
                System.out.println("Its a string object of length 3");
            }
        }
        if(name instanceof String str && str.length() == 3) {
            System.out.println("Its a string object of length " + str.length());
        }
    }
}
