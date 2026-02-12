package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Marcex");
        list.add(2, "Erick");
        
        System.out.print(list.size());
        for(String i: list) {
        	System.out.println(i);
        }
    	System.out.println();

        list.remove("Erick");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) =='M');

        for(String i: list) {
        	System.out.println(i);
        }
        list.add("Pedro");
        list.add("Bruno");

        System.out.println("Index of Bob: "+list.indexOf("Bob"));
        System.out.println("Index of Bob: "+list.indexOf("Maria"));
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for(String i: result) {
        	System.out.println(i);
        }
    	

        
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
    	System.out.println(name);

	}

}
