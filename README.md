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
Custom not found exception:
```java
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
```
Custom exception handler:
```java
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    // Will handle all except UserNotFoundException.class due to below method
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
        var exceptionResponse = new ExceptionResponse(ex.getMessage(), new Date());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Will handle only UserNotFoundException.class
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception {
        var exceptionResponse = new ExceptionResponse(ex.getMessage(), new Date());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
```
### Validation
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```
Adding validation:
```java
@PostMapping(path = "/users")
public ResponseEntity<Object> save(@Valid @RequestBody User user) {
```

```java
@Size(min=2, message = "Name should be atleast 2 characters in length")
private String name;

@Past(message = "Birth date cannot be in future")
private Date birthData;
```

Enabling custom error json response:
```java
//inside your exception handler override:
@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
    var exceptionResponse = new ExceptionResponse("Validation Failed!", ex.getBindingResult().toString(), new Date());
    return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
}
```

Enabling debug logging for spring framework:
`logging.level.org.springframework=debug`