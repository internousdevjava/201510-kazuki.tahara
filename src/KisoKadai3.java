import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(System.in);
		String str = "";
		int select = 0;

		try {
			System.out.println("��̂悤�Ƀt�@�C���������ĉ�����");
			System.out.print("�t�@�C����:C:/Users//internous//test.txt");
			str = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		File file = new File(str);
		File dir = new File(file.getParent());
		if (!dir.exists()) {
			System.out.println("���");
			dir.mkdir();
		} else if (dir.exists()) {
			System.out.println("���łɂ���");
		}
		if (file.exists()) {
			System.out.println("���łɂ���");
		} else {
			System.out.println("�쐬");

			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		boolean flag = true;
		while (flag) {
			System.out.println("�t�@�C���̍�Ƃ�I�����Ă�������");
			System.out.println("1:�ǂݎ��@2�F�������@3�F�I��");

			try {
				slcm = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}

			switch (slcm) {
			case 1:
				try {
					FileReader filereader = new FileReader(file);
					int ch;

					while ((ch = filereader.read()) != -1) {
						System.out.print((char) ch);
					}
					filereader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				int slcw = 0;
				System.out.println("�������ݕ��@��I�����Ă�������\n1:�ǋL�@2:�㏑��");
				try {
					slcw = Integer.parseInt((br.readLine()));
					System.out.print("�L��: ");
					if (slcw == 1) {
						FileWriter fwt = new FileWriter(file, true);
						String strfwt = "";
						strfwt = br.readLine();
						fwt.write(strfwt + "\r\n");
						fwt.close();
					} else if (slcw == 2) {
						FileWriter fwf = new FileWriter(file, false);
						String strfwf = "";
						strfwf = br.readLine();
						fwf.write(strfwf + "\r\n");
						fwf.close();
					}
				} catch (IOException e) {
					System.out.println(e);

				}
				break;
			case 3:
				System.out.println("�����l�ł���");
				flag = false;
			default:
				System.out.println("1~3�ŋL�����Ă�������");
				break;
			}
		}
	}
}