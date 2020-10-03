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
