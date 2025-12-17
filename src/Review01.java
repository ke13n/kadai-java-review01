
public class Review01 {

    public static void main(String[] args) {

        int price = 1500;//商品価格
        int outTax = tax(price);//消費税
        int tutelPrice =  price + outTax;

        System.out.println (price + "円の商品の税込み価格は" + tutelPrice + "円（消費税は" + outTax + "円）です。");

    }

    public static int tax(int price) {
        return (int)(price * 0.10);

    }


    

}
