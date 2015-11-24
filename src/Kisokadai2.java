import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		System.out.println("数当てゲームを始めます！\n１～１００までの数字をコンピューターが\n"
				+ "ランダムに決めます！当ててみて下さい！");
		
		int i =(int) (Math.random() * 100) + 1;

		String str = null;
		boolean fl = true;
		
		
		while(fl)
			
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str = br .readLine();
		 if(isNumber(str)){
			 int a =Integer.parseInt(str);
			 
			 if((i - a <= 100 && (i - a) >= 50))
			 System.out.println("はるか上です！");
			 else if ((i - a) <= 49 && (i - a) >= 20)
					System.out.println("もっと上です！");
				else if ((i - a) <= 19 && (i - a) >= 5)
					System.out.println("近い！もちっと上です！");
				else if ((i - a) <= 4 && (i - a) >= 1)
					System.out.println("惜しい、わずかに上");
			 
			 if (i < a)
					if ((a - i) <= 100 && (a - i) >= 50)
						System.out.println("はるか下です！");
					else if ((a - i) <= 49 && (a - i) >= 20)
						System.out.println("もっと下です！");
					else if ((a - i) <= 19 && (a - i) >= 5)
						System.out.println("近い！もちっと下です！");
					else if ((a - i) <= 4 && (a -i ) >= 1)
						System.out.println("惜しい！わずかに下です！");
			 if(a==i)
				 System.out.print("☆大正解☆");
			 		else {
						// 1～100以外の数値を入力した場合
						System.out.println("１～１００までの値を入力して下さい！");
							continue;

					}
				} else {
					// 数値以外を入力した場合
					System.out.println("１～１００までの値を入力して下さい。");
					continue;
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.print("☆大正解☆");
			}
	}

			// 数値型チェック
			public static boolean isNumber(String val) {
				try {
					Integer.parseInt(val);
					return true;
				} catch (NumberFormatException nfex) {
					return false;
				}
			}
		}