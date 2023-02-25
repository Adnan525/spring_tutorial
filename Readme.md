# Spring references

## Bean
- If when we generate same type of bean multiple times, we get the same instance of the bean, by default it's singleton.  
  
```
		ApplicationContext context = SpringApplication.run(Application.class, args);
		BinarySearch bs = context.getBean(BinarySearch.class);
		BinarySearch bs1 = context.getBean(BinarySearch.class);
		//bs and bs1 are same instance
```
  
- Prototype bean will get different instances.