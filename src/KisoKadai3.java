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
				System.out.println("                                ");
				System.out.println("下記の中から行う作業の数字を選択してください");
				System.out.println("１：上書きを行う場合　２：追記する場合　３：参照する場合　４：終了する場合");
				// コマンド（数字）選択した後の動作
				key = Integer.parseInt(br.readLine());

				switch (key) {
				case 1:// 書き込みを選択した場合---------------------------------------------
					try {

						FileWriter filewriter = new FileWriter(file);
						filewriter.write(br.readLine() + "\r\n");
						filewriter.close();
						System.out.println("上書きが完了しました。");
						
					} catch (IOException e) {
						System.out.println(e);
						System.out.println("正しく上書きが出来ていません。");
					}
					break;
				// ----------------------------------------------------------------

				case 2:// 既存ファイルへの追記を選択した場合--------------------------------------
					try {

						FileWriter filewriter = new FileWriter(file, true);
						filewriter.write(br.readLine() + "\r\n");
						filewriter.close();
						System.out.println("追記が完了しました。");
						System.out.println("正しく追記が出来ていません。");
					} catch (IOException e) {
						System.out.println(e);
						
					}
					break;
				// ---------------------------------------------------------------

				case 3:// 参照するを選択した場合---------------------------------------------
					try {
						FileReader fileReader = new FileReader(file);
						int ch = fileReader.read();
						while (ch != -1) {
							System.out.print((char) ch);
							
							ch = fileReader.read();
							
						}

					} catch (Exception e) {
						System.out.println(e);

					}
					
				case 4:// 終了するを選択した場合---------------------------------------------
					
					break;
					
				default:
					System.out.println("1～4以外が入力されています。もう一度選択してください。");
					break;
				}
			}
		}
	}
}
