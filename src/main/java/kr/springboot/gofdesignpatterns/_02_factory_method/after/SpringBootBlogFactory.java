package kr.springboot.gofdesignpatterns._02_factory_method.after;

public class SpringBootBlogFactory implements BlogFactory{

    @Override
    public Blog createBlog(String title) {
        return new SpringBootBlog(title);
    }

}