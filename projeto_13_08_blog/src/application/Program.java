package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post postOne = new Post(
				"Traveling to New Zeland", "I'm going to visit this wonderful country!", 12,
				simpleDateFormat.parse("27/04/2020 12:22:00"));
		postOne.addComent(new Comment("Have a nice trip!"));
		postOne.addComent(new Comment("Wow that's awesome!"));
		
		Post postTwo = new Post(
				"Good night guys", "See you tomorrow", 5,
				simpleDateFormat.parse("27/04/2020 19:33:31"));
		postTwo.addComent(new Comment("Good night!"));
		postTwo.addComent(new Comment("May the force be with you"));
		
		System.out.println(postOne);
		System.out.println(postTwo);
	}

}
