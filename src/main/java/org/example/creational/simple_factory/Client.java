package org.example.creational.simple_factory;

public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("product");
        System.out.println(post);
    }
}
