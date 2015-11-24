import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Kisokadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{



		int i =0;
		int a =0;
		String str = null;
		boolean fl = true;


		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		//Randomクラスのインスタンス化
		Random rnd = new Random();
		//1～100まで
		a = rnd.nextInt(100);
		a+=1;

		while(fl){
			try{
			System.out.println("数当てゲームです！1～100までの間で、\nコンピュータが選んだ数字を当ててください。");

    		str = br.readLine();
    		i = Integer.parseInt(str);



				if(i > 100 || i < 1){
					continue;
				}
				}catch (NumberFormatException nfex) {
					System.out.println("整数を入力してください");
					continue;
		    	}catch(IOException e){
		    		System.out.println("何かエラー出たよ!");
		    		e.printStackTrace();
		    	}

		    	//答えが合ってたらクリア！
		    	if(i == a){
		    		System.out.println("大当たり！！");
		    		fl = false;

		    		//選んだ数字よりコンピュータの数字の方が低かったら処理される。
		    	}else if(a < i){
		    		System.out.println("下の数字です！！");



		    	}else{

		    		System.out.println("上の数字です！！");

		    	}
		    }
		}
	}