package java17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SmallFeatures {
    public static void main(String[] args) {
       //Type Inference
        var a = 5.0; //jdk 10
        a = 3;

        /*Scanner scanner =  new Scanner(System.in);
        var scan = scanner.nextInt();
        System.out.println(scan);*/

        var list = new ArrayList<String>(); // Inferred as ArrayList<String>


        /************************************************************************************************/

        //Immutable collections alternative to Collections.immutable..
        var intList = List.of(1, 2, 3, 4);
//        intList.add(5); //Runtime exception as collection is immutable

        var set = Set.of(1,2,3);
        var stateCapitals = Map.of(
                "Maharashtra", "Mumbai",
                "Karnataka", "Bengaluru",
                "Tamilnadu", "Chennai");

        /************************************************************************************************/

        //String utility methods ind jdk 11
//        System.out.println("   ".isBlank());
//        "Hellow\nworld".lines().forEach(System.out::println);
//        System.out.println("Hello\nworld".indent(5)); //jdk 12 (also indents new lines)

        String unicodeString = '\u000c' + "hello world" + '\u000c' ;
        System.out.println(Character.isWhitespace('\u000c')); // '\u2008'
        System.out.println("---->" + unicodeString +"<-----");
        System.out.println("---->" + unicodeString.trim() +"<-----");
        System.out.println("---->" + unicodeString.strip() +"<-----");
    }
}
