package dev.zk.annotations;

public class CustomAnnotationMain {

    @CustomAnnotation(value = "Hello, Annotation")
    public void myMethod(){
        System.out.println("This is instance method");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        CustomAnnotationMain customAnnotationMain = new CustomAnnotationMain();
        customAnnotationMain.myMethod();

        CustomAnnotation customAnnotation = customAnnotationMain.getClass().getMethod("myMethod").getAnnotation(CustomAnnotation.class);
        System.out.println("Annotation Value = "+customAnnotation.value() );
    }
}
