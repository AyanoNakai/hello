import java.util.*;

public class kazuate {
  public static void main(String[] args) throws Exception {
    int ans = 27; //答え
    int in = 0; //入力される数
    int dif; //答えと入力数の差

    Scanner sc = new Scanner(System.in); //入力の取得用
    
    //数当て開始
    while(in != ans){
      System.out.print("予想した数字を入力：");
      in = sc.nextInt();
      dif = ans - in; //答えとの差
      if(dif == 0) break;
      else if(Math.abs(dif) > 20) System.out.println("20以上離れています");
      System.out.println("不正解です"); 
    }
    
    System.out.println("正解しました");
  }

}