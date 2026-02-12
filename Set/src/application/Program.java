package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;





public class Program {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			System.out.print("How many students for course A? ");
			int n = sc.nextInt();

			Set<Integer> set = new HashSet<>();

			for(int i=0; i<n;i++) {
				int id = sc.nextInt();
				set.add(id);
			}
			
			System.out.print("How many students for course B? ");
			n = sc.nextInt();
			for(int i=0; i<n;i++) {
				int id = sc.nextInt();
				set.add(id);
			}
			
			System.out.print("How many students for course C? ");
			n = sc.nextInt();
			for(int i=0; i<n;i++) {
				int id = sc.nextInt();
				set.add(id);
			}
			
			System.out.println("Total students: " + set.size());

			
			/*
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			System.out.print("Enter file full path: ");
			String path = sc.nextLine();
			try(BufferedReader br = new BufferedReader(new FileReader(path))){
				String item = br.readLine();
				Set<LogEntry> set = new HashSet<>();
				while(item != null) {
					String[] fields = item.split(" ");
					String name = fields[0];
					Instant moment = Instant.parse(fields[1]);
					set.add(new LogEntry(name, moment));
					item = br.readLine();

				}
				System.out.println("Total: "+ set.size());

				
			}catch(IOException e) {
				System.out.println("Error: "+e.getMessage());
			}*/


	}
}