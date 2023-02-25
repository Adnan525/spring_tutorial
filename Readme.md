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
```
@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //best practice
```
- Request bean will get different instances for each request.
- Session bean will get different instances for each session.
- If we have person class with @singleton scope and it's dependency jdbc as @prototype scope, we still get same instance of jdbc for each person instance. To get different jdbc we will need proxy.  
  
```
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
```