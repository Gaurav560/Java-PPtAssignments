package Assignment9;

public class Q10 {
    //Bean life cycle is managed by the spring container.
    // When we run the program then, first of all, the spring container gets started.
    // After that, the container creates the instance of a bean as per the request, and then dependencies are injected.
    // And finally, the bean is destroyed when the spring container is closed.
    // Therefore, if we want to execute some code on the bean instantiation and just after closing the spring container,
    // then we can write that code inside the custom init() method and the destroy() method.
}
