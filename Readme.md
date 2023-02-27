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
- When using proxy, even a method call like getJdbcConnection() will return different instance of jdbc connection.
- In the proxy's case, while autowiring, instead of autowiring the object, spring autowires the proxy.
- In gang of 4 GO4 design pattern, singleton is 1 instance per JVM; but in Spring it's 1 per application context.

```
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
```
  
## Component Scan Troubleshooting
If we are in package called com.example.demo and have a class with @SpringApplication annotation
the component scan will start from com.example.demo and won't include any other packages. 
To include other packages we can use @ComponentScan annotation with package name passed as parameter.
```
@ComponentScan("com.example.demo")
```