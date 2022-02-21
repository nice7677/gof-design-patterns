package kr.springboot.gofdesignpatterns._05_prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        SpringBootKrBlog blog = new SpringBootKrBlog();
        blog.setUrl("springboot.kr");

        SpringBootKrPost post = new SpringBootKrPost(blog);
        post.setPostCategory("java");
        post.setPostTitle("design-pattern-prototype");

        System.out.println(post.getUrl());

        SpringBootKrPost post2 = (SpringBootKrPost) post.clone();
        System.out.println(post2.getUrl());

        System.out.println(post.equals(post2));

        SpringBootKrPost post3 = (SpringBootKrPost) post.clone2();

        System.out.println(post3.getUrl());
        System.out.println(post.equals(post3));
    }

}
