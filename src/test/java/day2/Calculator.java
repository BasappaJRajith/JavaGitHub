package day2;

/**
 * @auothor Basappa J Rajith
 * @Practice Assignment
 * @Date 12-01-2023
 * @time 13:44:00
 * @comments
 */
public class Calculator {

    public static void main(String[] args) { //Main Method

//        int i = 10; //variable Declaration
//        int j = 20;
//        int sum = i + j;
//        System.out.println("Sum: " + sum); //Output-
//
//
//
//        i = 101; //variable Initialization
//        j = 202;
//        sum = i + j;
//        System.out.println("sum: "+ sum);

        Calculator calculator = new Calculator(); //Class Object
        /*
        By Creating CLASS OBJECT we can get the output
        class name and class name should be the same
        Here calculator is Reference
         */



        calculator.addNumbers(300, 200); //calling Addnumbers
        calculator.SubNumbers(20,10); // calling  SubNumbers
        calculator.MulNumbers(25,5); //calling MulNumbers
        calculator.DivNumbers(20,10); //calling DivNumbers
        calculator.Modulus(22,10); //calling Modulus

     /*
     Method Should be called here for OUTPUTS
     Is known for Calling for output
      */


    }

    //Outside the Main Method

    public void addNumbers(int x,int y){ //Method created for Addition
        int sum = x + y;
        System.out.println("Sum :"+ sum);

    }
    // Outside the Main Method
    public void SubNumbers(int x, int y){ //Method created for Subtraction
        int sub = x - y;
        System.out.println("Sub :" + sub);

    }
    //Outside the Main Method
    public void MulNumbers(int x,int y){ //Method created for Multiplication
        int mul = x * y;
        System.out.println("Mul: "+ mul);
    }
    public void DivNumbers(int x, int y){ //Method created for Division
        int div = x / y;
        System.out.println("Division :" + div);
    }
    //Outside the Main Method
    public void Modulus (int x, int y){
        int mod = x % y;
        System.out.println("Modulus: "+ mod);
    }

}
