package kr.springboot.gofdesignpatterns._05_prototype;

public class SpringBootKrBlog {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SpringBootKrBlog{" +
                "url='" + url + '\'' +
                '}';
    }

}
