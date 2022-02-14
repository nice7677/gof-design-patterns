package kr.springboot.gofdesignpatterns._04_builder;


import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        SpringbootKrBlogBuilder postBuilder = new PostBuilder();
        SpringbootKrBlog post1 = postBuilder.postTitle("HELLO")
                .postContent("hi---")
                .postWriter("nice7677@naver.com")
                .postDate(LocalDateTime.now())
                .getPost();
        System.out.println(post1);

        SpringbootKrBlog post2 = postBuilder.postTitle("HELLO2")
                .postContent("hi2---")
                .postWriter("nice7677@naver.com")
                .postDate(LocalDateTime.now())
                .getPost();
        System.out.println(post2);

    }

}
