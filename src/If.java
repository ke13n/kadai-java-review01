
public class If {

    public static void main(String[] args) {
        int score =80;//成績
        
        //scoreが６０未満ではないなら
        if (score == 100) {
            System.out.println("満点です。よくがんばりました");
        }else if (score >= 80) {
            System.out.println("よく頑張りました");
        }else if (!(score < 60)) {  //scoreが６０未満ではないなら
            System.out.println("合格です");
        
        }else {
            //「赤点です」...と表示
            System.out.println("赤点です..");
            
        }

    }

}
