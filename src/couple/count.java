package couple;

import java.util.Scanner;

 class count {
    private int number;
    private void count(long sum){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入阶乘的项数");
        number= sc.nextInt();
        long sum1=1;
        for(int i=1;i<=number;i++ ){
          sum1=sum1*i;
        }
        System.out.println("结果="+sum1);
    }
}
