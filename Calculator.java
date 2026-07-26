class Calculator{
private double num1;
private double num2;
private  double result;
private int operationCount;
public Calculator(){
    this.num1 = 0;
    this.num2 = 0;
    this.result = 0;
    this.operationCount = 0;
}
public Calculator(double num1,double num2){
    this.num1 = num1;
    this.num2 = num2;
    this.result = 0;
    this.operationCount = 0;
}
public void add(){
    this.result = this.num1+this.num2;
    this.operationCount++;

}
public void subtract(){
    this.result = this.num1-this.num2;
    this.operationCount++;
}
public void multiply(){
    this.result = this.num1*this.num2;
    this.operationCount++;
}
public void divide(){
    if(this.num2==0){
        System.out.println("Cannot divided by zero");
     return;
    }
    this.result = this.num1/this.num2;
    this.operationCount++;
} 
public void modulus(){
    if(this.num2==0){
        System.out.println("Cannot take modulus by zero");
    }
        this.result = this.num1%this.num2;
        this.operationCount++;
}
public void power(){
    this.result = Math.pow(this.num1,this.num2);
    this.operationCount++;
}
public void average(){
    this.result =(this.num1+this.num2)/2;
    this.operationCount++;
}
public void set(double num1 , double num2){
    this.num1 = num1;
    this.num2 = num2;
}
public double getNum1(){
    return this.num1;
}
public double getNum2(){
    return this.num2;
}
public double getResult(){
    return this.result;
}
public int getOperationCount(){
    return this.operationCount;
}
public void show(){
    System.out.println("num1: " + this.num1);
    System.out.println("num2: " + this.num2);
     System.out.println("Result: " + this.result);
      System.out.println("OperationCount: " + this.operationCount);
}
}