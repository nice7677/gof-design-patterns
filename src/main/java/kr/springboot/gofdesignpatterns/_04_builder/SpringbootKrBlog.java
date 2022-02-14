package kr.springboot.gofdesignpatterns._04_builder;

import java.time.LocalDateTime;

public class SpringbootKrBlog {

    private String title;
    private String content;
    private String writer;
    private LocalDateTime date;

    void setTitle(String title) {
        this.title = title;
    }

    void setContent(String content) {
        this.content = content;
    }

    void setWriter(String writer) {
        this.writer = writer;
    }

    void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SpringbootKrBlog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                '}';
    }

}
