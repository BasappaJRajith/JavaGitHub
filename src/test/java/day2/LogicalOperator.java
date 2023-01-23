package day2;
public class LogicalOperator {

    public static void main(String[] args) {
        //Logical Operators with comparison operators

        int x = 20;//Variable Declarations
        int y = 10;//Variable Declarations

        System.out.println(x<y && y > 10);
        /*Both Statements must be true in the AND operators to get the TRUE as output
         */
        System.out.println(x>y && y==10);
        /*Here Both Statements are true in AND operator. So, output is True
         */
        System.out.println(x<y || y==10);
        /*Here in OR operator anyone statement must be correct to get the True as output
         */
        System.out.println(x>30 || y>x);
    }
}



