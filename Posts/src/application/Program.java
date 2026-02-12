package application;



import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;




public class Program{

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        
        Comment c1 = new Comment("Have a nice trip! ");
        Comment c2 = new Comment("Wow that's awsome! ");
        LocalDateTime d01= LocalDateTime.parse("2018-06-21T13:05:44");
        Post p1 = new Post(d01, "Traveling to New Zeland","I'm going to this wonderful country!" ,12);
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        Comment c3 = new Comment("Good night ");
        Comment c4 = new Comment("Carlos ferreira it's coming for you ");
        LocalDateTime d02= LocalDateTime.parse("2018-07-28T23:14:19");
        Post p2 = new Post(d02, "Good Night guys","See you tomorrow" ,5);
        
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

        sc.close();
	}
	
	
	
	

}
