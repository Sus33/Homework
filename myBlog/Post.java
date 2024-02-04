package myBlog;

import java.util.Date;

public class Post {
    String title;
    String text;
    String category;
    Date createdData;
    User user;

    public Post() {

    }

    public Post(String title, String text, String category, Date createdData, User user) {
        this.title = title;
        this.text = text;
        this.category = category;
        this.createdData = createdData;
        this.user = user;
    }

    public Post(String title, User user) {
        this.title = title;
        this.user = user;
    }

    void printAllPosts() {

    }

    void addPosts() {

    }

    public String toString() {
        return "Post{" + "title='" + title + '\'' + ", text='" + text + '\'' + ", category=" + category + '\'' + ", date =" + createdData + '\'' + ", User =" + user + '\'' + '}';
    }
}
