import java.util.*;

class Number{
    double real, imaginary;
    public Number(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public  double getImaginary(){
        return this.imaginary;
    }
    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
}

class Complex extends Number{
    public Complex(double real, double imaginary){
        super(real, imaginary);
    }
    public boolean checkComplex(){
        if(super.imaginary!=0) return true;
        return false;
    }
}

class PurelyImaginary extends Complex{
    public PurelyImaginary(double real, double imaginary){
        super(real, imaginary);
    }

    public boolean checkPurelyImaginary(){
        if(super.real==0 && super.imaginary!=0) return true;
        return false;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PurelyImaginary obj = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(obj.getImaginary());
        if(obj.checkComplex()) System.out.println("The given number is complex");
        else System.out.println("The given number is real");
        if(obj.getReal()==0 && obj.getImaginary()!=0) System.out.println("i"+obj.getImaginary());
        else System.out.println(obj.getReal()+"+i"+obj.getImaginary());
        if(obj.checkPurelyImaginary()) System.out.println("The number is purely imaginary");
        else System.out.println("The number is not purely imaginary");
    }
}
