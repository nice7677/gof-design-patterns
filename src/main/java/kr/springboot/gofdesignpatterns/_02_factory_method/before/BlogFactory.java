package kr.springboot.gofdesignpatterns._02_factory_method.before;

/**
 * 확장에는 열려있고 변경에는 닫혀있어야 한다. 는 객체지향의 원칙
 */
public class BlogFactory {

    public static Blog orderBlog(String title, String mail) {

        if (title == null || title.isBlank()) throw new IllegalArgumentException("블로그 타이틀을 지어주세요.");
        if (mail == null || mail.isBlank()) throw new IllegalArgumentException("메일을 적어주세요.");

        prepareFor(title);

        Blog blog = new Blog();
        blog.setTitle(title);

        if (title.equals("SPRINGBOOT.KR")) blog.setSubject("Spring");
        else if (title.equals("GRAPHQL.CO.KR")) blog.setSubject("GraphQL");

        sendEmailTo(mail, blog);
        
        return blog;
    }

    private static void sendEmailTo(String mail, Blog blog) {
        System.out.println("Mail sent " + mail + ", blog title is " + blog.getTitle());
    }

    private static void prepareFor(String title) {
        System.out.println(title + " 만들 준비 중");
    }

}
