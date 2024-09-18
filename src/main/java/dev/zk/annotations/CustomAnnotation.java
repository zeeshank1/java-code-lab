package dev.zk.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //When this annotation will be available
@Target(ElementType.METHOD)         //Where this annotation is applied
public @interface CustomAnnotation {
    String value() default "hello value";
}
