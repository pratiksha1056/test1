public class Main{
  public static void main(String[]args) {
    Addition addObj = new Addition();
    Subtraction subObj= new Subtraction();
    int num1=10,  num2=5;
    int sum =addObj.addition(num1,num2);
    int diff = subObj.subtraction(num1,num2);

    System.out.println("Addition result : "+sum);
    System.out.println("Subtraction trt result:"+diff);
  }
}
  
