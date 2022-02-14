package kr.springboot.gofdesignpatterns._02_factory_method.before;

public class User {

    public static void main(String[] args) {

        Blog springbootKrBlog = BlogFactory.orderBlog("SPRINGBOOT.KR", "nice7677@naver.com");
        System.out.println(springbootKrBlog);

        Blog graphqlCoKrBlog = BlogFactory.orderBlog("GRAPHQL.CO.KR", "nice7677@naver.com");
        System.out.println(graphqlCoKrBlog);

    }

}
