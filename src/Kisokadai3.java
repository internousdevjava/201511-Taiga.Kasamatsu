import java.io.File;
import java.io.IOException;

      public class Kisokadai3 {
    	  public static void main(String args[]) {

    	try{
    		String name = new java.util.Scanner(System.in).nextLine();
    		File newfile =new File("C:\\kadai3\\"+name);
    		if (newfile.createNewFile()){
    			System.out.println("ファイルの作成に成功しました");
    		}else{
    			System.out.println("ファイルの作成に失敗しました");
    		}
    	} catch(IOException e){
    		System.out.println(e);
    	}
    	  }
      }
