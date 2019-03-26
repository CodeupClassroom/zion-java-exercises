package oop;

import java.util.Date;

public class Post {

    private String title;
    private String createdAt;
    private int authorId;
    private String body;

    public Post(String title, String createdAt, int authorId, String body) {
        this.title = title;
        this.createdAt = createdAt;
        this.authorId = authorId;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", authorId=" + authorId +
                ", body='" + body + '\'' +
                '}';
    }
}
