import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Main {
  public static void main(String[] args) {
      System.out.println("最初はグー！！ジャンケン...！!\n");
      while (true) {
      System.out.println("出したい手の数字を入力してください。 １：グー、２：チョキ、３：パー");
      Scanner scanner = new Scanner(System.in);
      int myHand = scanner.nextInt();
          if(myHand > 3) {
              System.out.println("1~3を入力してください");
              continue;
          }
          Random rand = new Random();
      int opponentHand = rand.nextInt(3)+1;
      Map<Integer, String> hands = new HashMap<>();
      hands.put(1, "グー");
      hands.put(2, "チョキ");
      hands.put(3, "パー");
      System.out.println("自分："+ hands.get(myHand) + " VS 相手：" + hands.get(opponentHand));
      if(myHand == opponentHand) {
        System.out.println("あいこです！もう一回！");
      }else if(myHand ==1 && opponentHand == 2 || myHand ==2 && opponentHand == 3 || myHand ==3 && opponentHand == 1){
          System.out.println("Win!!やったー！おめでとう！");
          break;
      }else{
          System.out.println("Lose…どんまい！");
          break;
          }
     }
     System.out.println("終わります");
  }
}







