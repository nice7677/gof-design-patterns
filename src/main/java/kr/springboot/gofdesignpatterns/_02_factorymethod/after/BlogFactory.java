package kr.springboot.gofdesignpatterns._02_factorymethod.after;

public interface BlogFactory {

    default Blog orderBlog(String title, String mail) {
        validate(title, mail);
        prepareFor(title);
        Blog blog = createBlog(title);
        sendEmailTo(mail, blog);
        return blog;
    }

    Blog createBlog(String title);

    private void validate(String title, String mail) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("블로그 타이틀을 지어주세요.");
        if (mail == null || mail.isBlank()) throw new IllegalArgumentException("메일을 적어주세요.");
    }

    private void sendEmailTo(String mail, Blog blog) {
        System.out.println("create finish send mail " + mail + ", blog title is " + blog.getTitle());
    }

    private void prepareFor(String title) {
        System.out.println(title + " 만들 준비 중");
    }


}
