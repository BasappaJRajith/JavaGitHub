package day2;

public class Assignment4 {

    public static void main(String[] args) {
        int i = 15; //variable initialization
        int j = 25;
//Before Swap

        System.out.println("i :" + i);
        System.out.println("j :" + j);

        i = i + j;
        j = i - j;
        i = i - j;
//After swap

        System.out.println("i :"+ i);
        System.out.println("j :"+j);
    }
}
