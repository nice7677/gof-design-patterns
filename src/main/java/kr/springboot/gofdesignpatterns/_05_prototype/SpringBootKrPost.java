package kr.springboot.gofdesignpatterns._05_prototype;

import java.util.Objects;

public class SpringBootKrPost implements Cloneable {

    private String postCategory;

    private String postTitle;

    private SpringBootKrBlog blog;

    public SpringBootKrPost(SpringBootKrBlog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "SpringBootKrPost{" +
                "postCategory='" + postCategory + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", blog=" + blog +
                '}';
    }

    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://").append(this.blog.getUrl())
                .append("/")
                .append(this.postCategory)
                .append("/")
                .append(this.postTitle);
        return sb.toString();
    }

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public SpringBootKrBlog getBlog() {
        return blog;
    }

    /**
     * shallow copy
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * deep copy
     * @return
     * @throws CloneNotSupportedException
     */
    protected Object clone2() throws CloneNotSupportedException {
        SpringBootKrBlog blog = new SpringBootKrBlog();
        blog.setUrl(this.blog.getUrl());

        SpringBootKrPost post = new SpringBootKrPost(blog);
        post.setPostCategory(this.postCategory);
        post.setPostTitle(this.postTitle);

        return post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpringBootKrPost that = (SpringBootKrPost) o;
        return Objects.equals(postCategory, that.postCategory) && Objects.equals(postTitle, that.postTitle) && Objects.equals(blog, that.blog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postCategory, postTitle, blog);
    }

}
