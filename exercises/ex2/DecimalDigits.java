package exercise2;

import java.util.Scanner;
public class DecimalDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double in = input.nextDouble();
		
		String data = Double.toString(in); //转化成字符串
		
		int dot = data.indexOf('.'); //小数点的位置
		
		String output = ""; //输出
		if(dot != -1 && data.length() >= dot + 10) {
            // 如果小数点后至少有10位，则提取第5到第10位
            output = data.substring(dot + 5, dot + 11);
        } else if (dot != -1 && data.length() > dot + 4) {
            // 如果小数点后不足10位但至少有4位，则提取剩余的位数并用0填充至6位
            output = data.substring(dot + 5);
            while(output.length() < 6) {
                output += "0";
            }
        } else {
            // 如果小数点后不足5位，则输出六个0
            output = "000000";
        }
        
        System.out.println(output);

		input.close();
	}
}
