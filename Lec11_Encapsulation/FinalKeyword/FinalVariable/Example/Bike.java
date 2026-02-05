package Lec11_Encapsulation.FinalKeyword.FinalVariable.Example;

public class Bike {
    final int speedlimit=90;
    void run(){
        speedlimit = 400;
    }
    public static void main(String[] args){
        Bike obj = new Bike();
        obj.run();
    }
}
