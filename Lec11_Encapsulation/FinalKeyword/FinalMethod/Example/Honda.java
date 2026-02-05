package Lec11_Encapsulation.FinalKeyword.FinalMethod.Example;

public class Honda extends Bike{
    void run(){
        System.out.println("running safely with 100kmph");
    }
    public static void main(String[] args){
        Honda honda = new Honda();
        honda.run();
    }
}
