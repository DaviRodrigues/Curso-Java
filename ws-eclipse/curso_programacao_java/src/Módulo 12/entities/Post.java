package entities;

import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private String moment;
	
	private String title;
	
	private String content;
	
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(String moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
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

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(moment + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment comment: comments) {
			sb.append(comment.getText() + "\n");
		}
		return sb.toString();
	}

}
