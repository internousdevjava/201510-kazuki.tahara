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
		System.out.println("�����ăQ�[���������Ȃ��܂��B1�`100�܂ł̐��̂��������Ǝv��������͂��Ă��������B");

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

			System.out.println("���͂��ꂽ����" + x + "�ł���");

			if (x == i) {
				System.out.println("�����ł�!!���߂łƂ��������܂�");
				break;
			} else if (x < i) {
				System.out.println("�c�O�A���������傫�Ȑ��ł���B");
			} else if (x > i) {
				System.out.println("�c�O�A�������������Ȑ��ł���B");
			}

			{
				//System.out.println(i);
				System.out.println("������x������͂��Ă��������B");
				continue;
			}
		}
	}
}
