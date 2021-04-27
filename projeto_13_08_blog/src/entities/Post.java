package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private String title;
	private String content;
	private int likes;
	private Date date;
	private List<Comment> comments = new ArrayList<Comment>();
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post() {
		
	}

	public Post(String title, String content, int likes, Date date) {
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.date = date;
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComent(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComent(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(title + "\n");
		stringBuilder.append(likes);
		stringBuilder.append(" Likes - ");
		stringBuilder.append(simpleDateFormat.format(date) + "\n");
		stringBuilder.append(content + "\n");
		stringBuilder.append("Comments:\n");
		
		for (Comment comment : comments) {
			stringBuilder.append(comment.getText() + "\n");
		}
		
		return stringBuilder.toString();
	}
}
