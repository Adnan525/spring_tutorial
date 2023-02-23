package com.spring.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// using optional to return a value
//		int[] arr = {1,2,3,4,5,9,7,8,9,10};
//		BinarySearch bs = new BinarySearch();
//		System.out.println("=========================");
//		System.out.println(bs.binarySearch(arr, 5).orElse(-1));
//		System.out.println("=========================");

		// not using bean
//		BinarySearch bs = new BinarySearch(new QuickSort());
//		System.out.println(bs.binarySearch(new int[]{1,2,3,4,5,9,7,8,9,10}, 5).orElse(-1));

		//bean and application context
		ApplicationContext context = SpringApplication.run(Application.class, args);
		//getting the bean
		BinarySearch bs = context.getBean(BinarySearch.class);
		System.out.println(bs.binarySearch(new int[]{1,2,3,4,5,9,7,8,9,10}, 5).orElse(-1));
	}

}
