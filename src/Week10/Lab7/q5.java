package Week10.Lab7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class q5 {
    private String name;
    private int age;
    private char gender;

    public q5(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Week10/files/person.dat"));
            int total = in.readInt();
            ArrayList<q5> people = new ArrayList<>();

            for(int i = 0; i < total; i++){
                String name = in.readUTF();
                int age = in.readInt();
                char gender = in.readChar();
                q5 person = new q5(name, age, gender);
                people.add(person);
            }
            in.close();

            System.out.println("before sort:");
            print(people);
            sort(people);

            System.out.println();

            System.out.println("after sort:");
            print(people);

        } catch(IOException e){
            System.out.println("error with file");
        }
    }

    static void sort(ArrayList<q5> people){
        for (int i = 0; i < people.size(); i++){
            for(int j = 0; j < people.size() - i - 1; j++){
                if(people.get(j).name.compareTo(people.get(j+1).name) > 0){
                    Collections.swap(people, j, j+1);
                }
            }
        }
    }

    static void print(ArrayList<q5> people){
        for (q5 person : people){
            System.out.print(person.name + " ");
            System.out.print(person.age + " ");
            System.out.println(person.gender);
        }
    }
}