package com.spring.tutorial;

import com.spring.tutorial.bean_scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	static Logger LOGGER = LoggerFactory.getLogger(Application.class);

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
//		BinarySearch bs = context.getBean(BinarySearch.class);
//		System.out.println(bs.binarySearch(new int[]{1,2,3,4,5,9,7,8,9,10}, 5).orElse(-1));

		// bean scope testing
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO2 = context.getBean(PersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}

}
