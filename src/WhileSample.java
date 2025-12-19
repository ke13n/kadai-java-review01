
public class WhileSample {

    public static void main(String[] args) {
        int num = 1;//初期値
        
        //切り返しの条件（numが１０２４より小さい間）
        while(num < 1024) {
            //２の累乗を計算
            num = num * 2;
            
            //結果を計算
            System.out.println(num);
            
        }

    }

}
