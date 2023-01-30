package control.structures;

public class MyClassSwitchCase {

    enum myChar {
        A,
        B
    }

    public static void main(String[] args) {
        MyClassSwitchCase myClass = new MyClassSwitchCase();
        myClass.switchCheck();
    }


    public void switchCheck() {
        String str = "c";
        myChar nowChar = myChar.B;


        switch (nowChar) {
            case A:
                System.out.println(nowChar);
                break;
            case B:
                System.out.println(nowChar);
                break;
        }

    }

}
