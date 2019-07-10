####Static value assignment example with Spring Boot and @Value annotation
The purpose here is to solve the problem of setting values from properties files for static fields with the @Value annotation. This can be done by creating a setter for the public static fields and annotating that with `@Value("${placeholder}")`.

- Note: remember to annotate the class containing the static fields with `@Component`