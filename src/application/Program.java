package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.user;

public class Program {

	public static void main(String[] args) throws ParseException {
		Set<user> set = new HashSet<>();
		String patch = "C:\\Users\\rapha\\Documents\\Workspace_eclipse\\Aula211_Set\\in.txt";
		try (BufferedReader bf = new BufferedReader (new FileReader(patch))){
			String line = bf.readLine();
			while (line != null) {
				String[] splitLine = line.split(" ");
				Date date = Date.from(Instant.parse(splitLine[1]));
				String username = splitLine[0];
//				System.out.println(splitLine[0] + " " +sdf.format(date));
				set.add(new user(username, date));
				line = bf.readLine();
			}
//			for (user u : set) {
//				System.out.println(u);
//			}
			System.out.println(set.size());
		}
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
	}

}
