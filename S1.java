import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 *檔案中每一行代表一個學生的各科成績，各科成績數字間以一個或多個空白所分隔。
請寫一Java程式，讀取C:\file_practice.txt檔案內容，計算每個學生的平均分數，並將每個學生的平均分數依序逐行寫入C:\out.txt。 
 */
public class S1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\file_practice.txt");
		FileWriter fw = new FileWriter("C:\\out.txt");
		char data[] = new char[128];
		int num = fr.read(data);
		String str = new String(data, 0, num);
		System.out.println(str);
		
		
		
		String s[]=str.split("\n");//將字串切割成陣列
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
