package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private Instant moment = Instant.now();
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {}

	public Post(String title, String content, Integer likes) {
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Instant getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(LocalDateTime.ofInstant(moment, ZoneId.systemDefault()).format(fmt) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment comment: comments) sb.append(comment.getText() + "\n");
		return sb.toString();
	}
	
}
