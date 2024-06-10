package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class StringBuilderJava {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) throws ParseException {
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		LocalDateTime date = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
		
		Post p1 = new Post(
				date.format(fmt), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12
				);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		
		LocalDateTime date1 = LocalDateTime.parse("28/07/2018 23:14:19", fmt);
		
		Post p2 = new Post(
				date1.format(fmt),
				"Good night guys",
				"See you tomorrow",
				5
				);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		
		System.out.println(p2);

	}

}
