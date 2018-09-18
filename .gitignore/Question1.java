    public class Question1{
        public static void main(String[] x){
                     new Child().foo();
               }
             }
     class Parent{
          public void foo(){
               System.out.println("I'am in the parent");
              }   
          }
      class Child extends Parent{
   
    public void foo(){
        //super.foo();
        System.out.println("I'm the child.");
    }
}