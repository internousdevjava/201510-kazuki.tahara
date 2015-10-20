import java.io.*;

public class KisoKadai3 {
	public static void main(String[] args) throws IOException {
		{
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			System.out.println("ファイル名を指定してください");
			System.out.println("例：c:/Users//internous//text.txt");

			String str = br.readLine();
			File file = new File(str);

			// File newfile = new File(file);
			try {
				if (file.createNewFile()) {
					System.out.println("ファイルの作成に成功しました。");

				} else {
					System.out.println("既にそのファイルは存在します。");
				}
			} catch (IOException e) {
				System.out.println("例外が発生しました。再実行してください。");
				System.out.println(e);
			}

			int key = 0;
			while (4 != key) {
				System.out.println("ファイルに書き込みを行う場合" + "【1】　追記する場合【2】　参照する場合【3】　終了する場合【4】を押してください。");
				// コマンド（数字）選択した後の動作
				key = Integer.parseInt(br.readLine());

				switch (key) {
				case 1:// 書き込みを選択した場合---------------------------------------------
					try {
						// File file2 = new File(newfile);
						FileWriter filewriter = new FileWriter(file);
						filewriter.write(br.readLine() + "\r\n");
						filewriter.close();
					} catch (IOException e) {
						System.out.println(e);
					}
					break;
                       //----------------------------------------------------------------
					
				case 2:// 既存ファイルへの追記を選択した場合--------------------------------------
					try {
						// File file3 = new File(file+".txt");
						FileWriter filewriter = new FileWriter(file, true);
						filewriter.write(br.readLine() + "\r\n");
						filewriter.close();
					} catch (IOException e) {
						System.out.println(e);
					}
					break;
                       //---------------------------------------------------------------
					
				case 3:// 参照するを選択した場合---------------------------------------------
try {
	
} catch (Exception e) {
	
}
				case 4:// 終了するを選択した場合---------------------------------------------
					break;
				default:
					System.out.println("1～4以外が入力されています。");
					break;
				}
			}
		}
	}
}
