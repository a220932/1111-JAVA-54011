import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 *�ɮפ��C�@��N��@�Ӿǥͪ��U�즨�Z�A�U�즨�Z�Ʀr���H�@�өΦh�ӪťթҤ��j�C
�мg�@Java�{���AŪ��C:\file_practice.txt�ɮפ��e�A�p��C�Ӿǥͪ��������ơA�ñN�C�Ӿǥͪ��������ƨ̧ǳv��g�JC:\out.txt�C 
 */
public class S1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\file_practice.txt");
		FileWriter fw = new FileWriter("C:\\out.txt");
		char data[] = new char[128];
		int num = fr.read(data);
		String str = new String(data, 0, num);
		System.out.println(str);
		
		
		
		String s[]=str.split("\n");//�N�r����Φ��}�C
		for (int i = 0; i < s.length; i++){
			float avg = 0;
			String sc[] = s[i].split(" ");
			for (int j = 0; j < sc.length; j++){
				//System.out.println(Float.parseFloat(sc[j]));
				if (sc[j] != "")
					avg += Float.parseFloat(sc[j]);
			}
			avg /= sc.length;
			System.out.println(avg);
			fw.write(Float.toString(avg) + "\n");
		}
		
		
		
		
		fr.close();
		fw.close();
	}

}
