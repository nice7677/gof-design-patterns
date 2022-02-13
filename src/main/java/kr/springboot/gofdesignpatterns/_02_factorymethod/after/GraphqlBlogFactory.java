package kr.springboot.gofdesignpatterns._02_factorymethod.after;

public class GraphqlBlogFactory implements BlogFactory{

    @Override
    public Blog createBlog(String title) {
        return new GraphqlBlog(title);
    }

}
