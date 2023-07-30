package org.example.creational.simple_factory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {
    public static Post createPost(String type) {
        return switch (type) {
            case "product" -> new ProductPost();
            case "news" -> new NewsPost();
            case "blog" -> new BlogPost();
            default -> throw new IllegalArgumentException();
        };
    }
}
