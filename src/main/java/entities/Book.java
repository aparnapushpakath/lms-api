package entities;

public class Book {
private String title;

public Book(String title, String author, String isdn){
	this.title=title;
	this.author=author;
	this.isdn=isdn;
}

@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", isdn=" + isdn + "]";
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getIsdn() {
	return isdn;
}
public void setIsdn(String isdn) {
	this.isdn = isdn;
}
private String author;
private String isdn;
}
