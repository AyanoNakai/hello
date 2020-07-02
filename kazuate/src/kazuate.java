import java.util.*;

public class kazuate {
  public static void main(String[] args) throws Exception {
    int ans = 27; //答え
    int in = 0; //入力される数
    int dif, i;

    Scanner sc = new Scanner(System.in); //入力の取得用
    System.out.println("5回まで入力できます");
    //数当て開始
    for(i=0; i<5; i++){
      System.out.print(i+1+"回目 予想した数字を入力：");
      in = sc.nextInt();
      dif = in - ans; //答えとの差
      if(dif == 0){
        System.out.println("正解しました");
        break;
      }
      else if(dif < 0){
        System.out.println("答えは入力された数より大きいです");
      }
      else if(dif > 0){
        System.out.println("答えは入力された数より小さいです");
      }

      if(Math.abs(dif) > 20) System.out.println("20以上離れています");
      
    }

    System.out.println("終了します");
  }

}