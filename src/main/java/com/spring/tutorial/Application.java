package com.spring.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

//		SpringApplication.run(Application.class, args);
//		int[] arr = {1,2,3,4,5,9,7,8,9,10};
//		BinarySearch bs = new BinarySearch();
//		System.out.println("=========================");
//		System.out.println(bs.binarySearch(arr, 5).orElse(-1));
//		System.out.println("=========================");
		BinarySearch bs = new BinarySearch(new QuickSort());
		System.out.println(bs.binarySearch(new int[]{1,2,3,4,5,9,7,8,9,10}, 5).orElse(-1));
	}

}
