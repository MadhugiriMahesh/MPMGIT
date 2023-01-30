package four.pillars.oops.encapsulation;

public class MyClass {

    public static void main(String[] args){
        MyPrivateClass myPrivateClass = new MyPrivateClass();

        myPrivateClass.setStr("updated my string");
        myPrivateClass.printString();
        System.out.println(myPrivateClass.getStr());

        myPrivateClass.setAge(0);
        System.out.println(myPrivateClass.getAge());


    }
}
