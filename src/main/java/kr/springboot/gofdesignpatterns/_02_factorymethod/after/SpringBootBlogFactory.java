package kr.springboot.gofdesignpatterns._02_factorymethod.after;

public class SpringBootBlogFactory implements BlogFactory{

    @Override
    public Blog createBlog(String title) {
        return new SpringBootBlog(title);
    }

}