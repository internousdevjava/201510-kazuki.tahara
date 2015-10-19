import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	public static void main(String[] args) {
		System.out.println("数当てゲームをおこないます。1～100までの数のうち正解と思う数を入力してください。");

		int i;
		i = (int) (Math.random() * 100 + 1);

		while (true) {

			int x;

			InputStreamReader isr = new InputStreamReader(System.in);

			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				x = 0;
			}

			System.out.println("入力された数は" + x + "ですね");

			if (x == i) {
				System.out.println("正解です!!おめでとうございます");
				break;
			} else if (x < i) {
				System.out.println("残念、もう少し大きな数ですよ。");
			} else if (x > i) {
				System.out.println("残念、もう少し小さな数ですよ。");
			}

			{
				//System.out.println(i);
				System.out.println("もう一度数を入力してください。");
				continue;
			}
		}
	}
}
