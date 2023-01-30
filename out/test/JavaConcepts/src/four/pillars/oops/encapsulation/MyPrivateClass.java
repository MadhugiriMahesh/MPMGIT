package four.pillars.oops.encapsulation;

public class MyPrivateClass {
    private String str = "My Private String";
    private int age;

    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str = str;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
           this.age=age;

        else
             System.out.println("Age cannot be Negative or Zero") ;


    }

    public void printString(){
        System.out.println(str);
    }

    private void myMethod(){
        System.out.println("My Private Method");
    }
}
