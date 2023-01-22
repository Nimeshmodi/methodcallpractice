package MethodCall;

public class emplyee {
    static void emplyee(String emplyeename){
        System.out.println(emplyeename);
    }
    static void emplyee(int emplyeeId){
        System.out.println(emplyeeId);
    }

    public static void main(String[] args) {
        emplyee("Nimesh");
        emplyee(07);
    }
}
