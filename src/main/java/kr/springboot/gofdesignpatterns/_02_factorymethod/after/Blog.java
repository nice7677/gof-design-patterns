package kr.springboot.gofdesignpatterns._02_factorymethod.after;

public class Blog {

    private String title;
    private String subject;

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
