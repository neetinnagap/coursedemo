# coursedemo - repository for spring boot udemy course

### Creating new API

Following are two ways of creating mappings:

```java
@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
public String helloWorld() {
    return "Hello World!";
}   
```

```java
@GetMapping(path = "/helloworld")
public String helloWorld() {
    return "Hello World!";
}
```

Adding path variable:
```java
@GetMapping(path = "/helloworldbean/pathvariable/{name}")
public HelloWorld helloWorldUsingBeanPathVar(@PathVariable String name) {
    return new HelloWorld(String.format("Hello World, %s", name));
}
```
Adding request body:
```java
@PostMapping(path = "/users")
public User save(@RequestBody User user) {
    return userDao.save(user);
}
```

Enabling debug loggin for spring framework:
`logging.level.org.springframework=debug`

