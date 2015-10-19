import java.io.*;

public class KisoKadai3 {
	public static void main(String[] args) throws IOException {
		{
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			System.out.println("ファイル名を指定してください");
			System.out.println("例：text ※テキスト形式でファイルを作成します。");

			String str = br.readLine();
			File file = new File(str);

			File newfile = new File(file + ".txt");
		
			try {
				if (newfile.createNewFile()) {
					System.out.println("ファイルの作成に成功しました。");
					System.out.println("ファイルに書き込みを行う場合"
							+ "【1】　追記する場合【2】　参照する場合【3】　終了する場合【4】を押してください。");
				} else {
					System.out.println("既にそのファイルは存在します。");
					System.out.println("ファイルに書き込みを行う場合"
							+ "【1】　追記する場合【2】　参照する場合【3】　終了する場合【4】を押してください。");
					}
				
			} catch (IOException e) {
				System.out.println("例外が発生しました。再実行してください。");
				System.out.println(e);
			}
			//コマンド（数字）選択した後の動作
			String key = br.readLine();
			
			switch (key) {
			case "1"://書き込みを選択した場合。
				try{
					  File file2 = new File(newfile+".txt");
					  FileWriter filewriter = new FileWriter(file2);
					  filewriter.write(br.readLine());
					  filewriter.close();
					}catch(IOException e){
					  System.out.println(e);
					}
					
			case "2"://既存ファイルへの追記を選択した場合。
				try{
					  File file3 = new File(newfile+".txt");
					  FileWriter filewriter = new FileWriter(file3,true);
					  filewriter.write(br.readLine());
					  filewriter.close();
					}catch(IOException e){
					  System.out.println(e);
					}
						
			case "3"://参照するを選択した場合。	
				
			case "5"://終了するを選択した場合。	
				break;
			}
		}
		
		}
	}
