import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {

	public static void main(String[]args) {
		boolean flag = true;
		while (flag) {

			System.out.println("���̌v�Z�\���쐬���܂��B1�`100�܂ł̒l����͂��Ă��������B"
			);
			
			int x = 0;
			System.out.print("�c�̒l�F���͂��Ă�������: ");
			InputStreamReader isr = new InputStreamReader(System.in);

			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);

			} catch (Exception e) {
				x = 0;
			}
			if (x > 100) {
				System.out.println("1�`100�܂ł̐�������͂��Ă������� ");
				continue;
			} else {

			}

			System.out.println("�c�̒l " + x);

			// -------X�̓��͂ɂ���-------------------------------------
			int y;
			System.out.print("���̒l�F���͂��Ă�������: ");
			InputStreamReader yisr = new InputStreamReader(System.in);
			BufferedReader ybr = new BufferedReader(yisr);
			try {
				String ybuf = ybr.readLine();
				y = Integer.parseInt(ybuf);
			} catch (Exception e) {
				y = 0;
			}
			if (y > 100) {
				System.out.println("1�`100�܂ł̐�������͂��Ă�������  ");
				continue;
			}
			System.out.println("���̒l " + y);

			// -------Y�̓��͂ɂ���-------------------------------------
			// �|���Z�ɂ���

			System.out.println("+--------- �|���Z���\ -----------+");

			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= y; j++)
					System.out.print(i * j + " ");
				System.out.println();
				flag = false;
			}

		}

	}

}
