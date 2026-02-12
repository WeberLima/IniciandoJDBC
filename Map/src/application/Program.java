package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file path: ");
		String path = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String item = br.readLine();
			Map<String, Candidate> map = new HashMap<>();

			while (item != null) {
			    String[] fields = item.split(",");
			    String name = fields[0];
			    int votes = Integer.parseInt(fields[1]);

			    if (map.containsKey(name)) {
			        Candidate cand = map.get(name);
			        cand.setVotes(cand.getVotes() + votes);
			    } else {
			        map.put(name, new Candidate(name, votes));
			    }

			    item = br.readLine();
			}
		
	}catch(IOException e) {
		System.out.println("Error writing file: " + e.getMessage());
	}

}

}