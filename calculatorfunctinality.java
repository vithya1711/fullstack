public class CalculatorFunctinality{
public void addnumbers(int a,int b){
System.out.println(a+b);
}
public void addnumbers(int a,int b,int c){
System.out.println(a+b+c);
}
public void addnumbers(float a,float b){
System.out.println(a+b);
}
public static void main(String[] args){
CalculatorFunctionality calc=new CalculatorFunctionality();
calc.addnumbers(1.5f,1.5f);
calc.addnumbers(7,8);
calc.addnumbers(2,5,7);
}
}