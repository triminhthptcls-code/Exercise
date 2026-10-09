package bai1;

import java.util.Scanner;

public class HamThucThi {
   public static void main(String[] args) {
      Scanner st2 = new Scanner(System.in);
      BaiTap st1 = new BaiTap();
      System.out.println("Nguoi dung nhap so lieu");
      System.out.println(st1.isPrime(st2.nextInt()));
      System.out.println(st1.findMax(new int[] { 12, 14, 15, 3984, 738 }));
      st1.printMultiplicationTable(5);
  st2.close();
   }

}
