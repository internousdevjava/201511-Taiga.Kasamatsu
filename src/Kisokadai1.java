import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Kisokadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String x = null;
		String y = null;
		int a=0;
		int b=0;
		int c=0;
		do {
			try{
				BufferedReader br =
						new BufferedReader(new InputStreamReader(System.in));
				if(c==0){
					c++;
				}else{
					System.out.println("もう一度入力して下さい。");
				}
				System.out.println("Xの値1～100までの数字を入力して下さい。");
				//Xの値を入力させる。
				x = br.readLine();
				try {
					Integer.parseInt(x);

				} catch (NumberFormatException nfex) {
					continue;
				}

				if(Integer.parseInt(x) > 100 || Integer.parseInt(x) <1){
					continue;

				}

				System.out.println("Yの値1～100までの数字を入力して下さい。");
				//Yの値を入力させる。
				y = br.readLine();
				try {
					Integer.parseInt(y);
				} catch (NumberFormatException nfex) {
					continue;
				}

if(Integer.parseInt(y) > 100 || Integer.parseInt(y) <1){
	continue;

				}

			}catch(Exception e){
				e.printStackTrace();
			}
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
		} while (a>100 || a<=0 || b>100 || b<=0);

		for(int i=1; i<=a; i++){
			for(int j=1; j<=b; j++){
				int kotae = i*j;
				System.out.print(String.format("%1$5d", kotae));
				}

//xが全部表示されたら改行
		System.out.println("");
	}
		}
}





