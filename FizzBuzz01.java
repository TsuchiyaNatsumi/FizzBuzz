//FizzBuzzのルール
//数字を1から，１ずつ増やしながら数える。
//ただし，3で割り切れる場合は「Fizz」，5で割り切れる場合は「Buzz」
//両者で割り切れる場合（すなわち15で割り切れる場合）は「Fizz Buzz」を数字の代わりに言う

import java.util.Scanner;
public class FizzBuzz01 {
    public static void main (String[] args){ 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("整数nを入力してください>>");
        n= sc.nextInt();

        for(int i= 1; i<= n; i++){
            if((i %3 == 0)&&(i %5 ==0)){
                System.out.print("FizzBuzz,");
            }
            else if(i %3 == 0){
                System.out.print("Fizz,");
            }
            else if(i %5 ==0){
                System.out.print("Buzz,");
            }
            else{
                System.out.print(i+ ",");
            }
        }
    }
}
