package kr.springboot.gofdesignpatterns._04_builder;

import java.time.LocalDateTime;

public class PostBuilder extends SpringbootKrBlog implements SpringbootKrBlogBuilder{

    @Override
    public SpringbootKrBlogBuilder postTitle(String postTitle) {
        setTitle(postTitle);
        return this;
    }

    @Override
    public SpringbootKrBlogBuilder postContent(String postContent) {
        setContent(postContent);
        return this;
    }

    @Override
    public SpringbootKrBlogBuilder postWriter(String postWriter) {
        setWriter(postWriter);
        return this;
    }

    @Override
    public SpringbootKrBlogBuilder postDate(LocalDateTime postDate) {
        setDate(postDate);
        return this;
    }

    @Override
    public SpringbootKrBlog getPost() {
        return this;
    }
}
