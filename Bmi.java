import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.Scanner;

public class Bmi {
    public static void main(String args[] )  {
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI計算サイト");
        System.out.println();
        
	 for(int i = 0; i<=1; i++){
       	System.out.println("身長をメートル(m)で数値のみ入力してください。");
       	System.out.println("(例)　175.5cmの場合　　1.755");
       	double height = Double.parseDouble(sc.nextLine());
        System.out.println("体重をキログラム(kg)で数値のみ入力してください。");
        System.out.println("(例)　124.5kgの場合　　124.5");
        double weight =  Double.parseDouble(sc.nextLine());

        double BMI = weight/(height*height);
        double number1 =  BMI * 100 ;
        int number2 = (int)number1;
        BMI = number2;
        BMI = BMI/100;
        System.out.println();
        System.out.println("あなたのBMIは"+ BMI + "です。");
        if(BMI<18.5){
            System.out.println("あなたは痩せているのでもっと太りましょう。");
        }else if(BMI <25){
            System.out.println("あなたは標準体型です。このまま維持しましょう。");
        }else{
            System.out.println("あなたは肥満体型なのでもう少し痩せましょう。");
        }
        System.out.println();

        System.out.println("日本肥満学会による肥満度分類");
        System.out.println();
        System.out.println("   BMI(kg/M*M)   |    判定    |     WHO基準     ");
        System.out.println("       < 18.5    |   低体重  　|   Underweight  ");
        System.out.println("  18.5 <   25    |   普通体重  |   Normal range ");
        System.out.println("    25 <   30    |   肥満(1度) |   Pre-obese   ");
        System.out.println("    30 <   35    |   肥満(2度) | Obese class I");
        System.out.println("    35 <   40    |   肥満(3度) | Obese class II   ");
        System.out.println("    40           |   肥満(4度) | Obese class III   ");
	}

  }
}
