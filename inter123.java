interface mobile{
    public void method1();
    public void method2();
}
class inter123 implements mobile {
    public void method1(){
        System.out.println("implementation of method1");
    }
     public void method2(){
        System.out.println("impementation of method2");
     }  
     public static void main(String[] args) {
         mobile obj=new inter123() ;
         obj.method1();
         obj.method2();
     } 
}