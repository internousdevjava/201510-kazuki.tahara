import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {

	public static void main(String[]args) {
		boolean flag = true;
		while (flag) {

			System.out.println("九九の計算表を作成します。1～100までの値を入力してください。"
			);
			
			int x = 0;
			System.out.print("縦の値：入力してください: ");
			InputStreamReader isr = new InputStreamReader(System.in);

			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);

			} catch (Exception e) {
				x = 0;
			}
			if (x > 100) {
				System.out.println("1～100までの数字を入力してください ");
				continue;
			} else {

			}

			System.out.println("縦の値 " + x);

			// -------Xの入力について-------------------------------------
			int y;
			System.out.print("横の値：入力してください: ");
			InputStreamReader yisr = new InputStreamReader(System.in);
			BufferedReader ybr = new BufferedReader(yisr);
			try {
				String ybuf = ybr.readLine();
				y = Integer.parseInt(ybuf);
			} catch (Exception e) {
				y = 0;
			}
			if (y > 100) {
				System.out.println("1～100までの数字を入力してください  ");
				continue;
			}
			System.out.println("横の値 " + y);

			// -------Yの入力について-------------------------------------
			// 掛け算について

			System.out.println("+--------- 掛け算九九表 -----------+");

			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= y; j++)
					System.out.print(i * j + " ");
				System.out.println();
				flag = false;
			}

		}

	}

}
