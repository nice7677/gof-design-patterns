package kr.springboot.gofdesignpatterns._02_factory_method.after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new SpringBootBlogFactory(), "SPPPPPP", "nice7677@naver.com");
        client.print(new SpringBootBlogFactory(), "HAHAHAHAHAHA", "nice7677@naver.com");
        client.print(new GraphqlBlogFactory(), "GRAPPPPPP", "nice7677@naver.com");

        Blog springbootKrBlog = new SpringBootBlogFactory().orderBlog("SPPPPPP1111", "nice7677@naver.com");
        System.out.println(springbootKrBlog);

        Blog graphqlCoKrBlog = new GraphqlBlogFactory().orderBlog("GRAPPPPPP2222", "nice7677@naver.com");
        System.out.println(graphqlCoKrBlog);

    }

    private void print(BlogFactory blogFactory, String title, String mail) {
        System.out.println(blogFactory.orderBlog(title, mail));
    }

}
