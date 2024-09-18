package dev.zk.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface CustomAnnotationContainer {
    CustomAnnotationJava8[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(CustomAnnotationContainer.class)
@interface CustomAnnotationJava8 {
    String value();
}


