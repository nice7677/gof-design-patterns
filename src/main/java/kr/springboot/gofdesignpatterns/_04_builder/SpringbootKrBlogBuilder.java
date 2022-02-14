package kr.springboot.gofdesignpatterns._04_builder;

import javax.swing.*;
import java.time.LocalDateTime;

public interface SpringbootKrBlogBuilder {

    SpringbootKrBlogBuilder postTitle(String postTitle);

    SpringbootKrBlogBuilder postContent(String postContent);

    SpringbootKrBlogBuilder postWriter(String postWriter);

    SpringbootKrBlogBuilder postDate(LocalDateTime postDate);

    SpringbootKrBlog getPost();

}
