package kr.springboot.gofdesignpatterns._02_factory_method.after;

public class SpringBootBlog extends Blog{

    public SpringBootBlog(String title) {
        super();
        setTitle(title + " - SPRINGBOOT.KR");
        setSubject("Spring");
    }

}
