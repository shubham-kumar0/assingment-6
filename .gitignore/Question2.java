class Question2{
   Question2(){
      System.out.println("Default constructor");
   }
   Question2(int i, int j){
      System.out.println("constructor with Two parameters");
   }
   Question2(int i, int j, int k){
      System.out.println("constructor with Three parameters");	      
   }
   Question2(int i, String name){
      System.out.println("constructor with int and String param");
   }
   public static void main(String args[]){
     Question2 obj = new Question2();
      Question2 obj2 = new Question2(12, 12);
      Question2 obj3 = new Question2(1, 2, 13);
      Question2 obj4 = new Question2(1,"BeginnersBook");
   }
}