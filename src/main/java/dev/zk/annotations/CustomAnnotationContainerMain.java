package dev.zk.annotations;

public class CustomAnnotationContainerMain {

    @CustomAnnotationJava8(value = "First annotation")
    @CustomAnnotationJava8(value = "Second annotation")
    public void instMethod(){
        System.out.println("Instance method called \n------" );
    }

    public static void main(String[] args) throws NoSuchMethodException {
        CustomAnnotationContainerMain obj = new CustomAnnotationContainerMain();
        obj.instMethod();

        CustomAnnotationJava8[] customAnnotationJava8 = obj.getClass().getMethod("instMethod").getAnnotationsByType(CustomAnnotationJava8.class);
        for ( CustomAnnotationJava8 annotationJava8 : customAnnotationJava8 ) {
            System.out.println(annotationJava8.value() );

        }
    }
}
