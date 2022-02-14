package kr.springboot.gofdesignpatterns._02_factory_method.after;

public class GraphqlBlogFactory implements BlogFactory{

    @Override
    public Blog createBlog(String title) {
        return new GraphqlBlog(title);
    }

}
