package com.coffeepoweredcrew.simplefactory;

public class Client {

	public static void main(String[] args) {
		
		Post blog = PostFactory.createPost("blog");
		System.out.println(blog);
		
		Post news = PostFactory.createPost("news");
		System.out.println(news);
		
		Post product = PostFactory.createPost("product");
		System.out.println(product);
	}
}
