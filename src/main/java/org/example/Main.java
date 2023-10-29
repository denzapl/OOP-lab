package org.example;
import org.example.People;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printDepartment(List<People> people){
        for (People person : people){
            System.out.println(people);
        }
    }


    public static void main(String[] args) {
        People pekka= new People("Pekka Mikkola\n", "Korsontie Street 1 03100 Vantaa\n");
        People esko = new People("Esko Ukkonen\n", "Mannerheimintie Street 15 00100 Helsinki\n");


        System.out.println(pekka);
        System.out.println(esko);


        Student pekka1 = new Student("Pekka Mikkola\n", "Korsontie Street 1 03100 Vantaa\n", 0);
        Student esko1 = new Student("Esko Ukkonen\n", "Mannerheimintie Street 15 00100 Helsinki\n",0);

        System.out.println(pekka1);
        System.out.println(esko1);
        pekka1.study();
        esko1.study();

        System.out.println(esko1.getCredits());
        System.out.println(pekka1.getCredits());

        Teacher pekka2 = new Teacher("Pekka Mikkola\n", "Korsontie Street 1 03100 Vantaa\n", 1200);
        Teacher esko2 = new Teacher("Esko Ukkonen\n", "Mannerheimintie Street 15 00100 Helsinki\n",5400);

        System.out.println(pekka2);
        System.out.println(esko2);


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );
        System.out.println("Credits " + olli.getCredits());


        List<People> people = new ArrayList<People>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Al bergintie Street 1 00400 Helsinki") );


        printDepartment(people);

        Circle circle = new Circle("Grey", FillType.FILLED, 3.5);
        Rectangle rectangle = new Rectangle("White", FillType.NOT_FILLED, 5, 6);

        System.out.println(circle.displayInfo());
        System.out.println(rectangle.displayInfo());


    }
}