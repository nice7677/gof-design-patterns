package kr.springboot.gofdesignpatterns._02_factorymethod.after;

public class GraphqlBlog extends Blog {

    public GraphqlBlog(String title) {
        setTitle(title + " - GRAPHQL.CO.KR");
        setSubject("GraphQL");
    }

}
