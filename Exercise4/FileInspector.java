package Exercise4;

import java.io.*;


public class FileInspector{
	public static int[] run(File f){
		int[] stats = new int['z'-'a'+1];
		InputStreamReader isr = null;
		try{
			isr = new InputStreamReader(new FileInputStream(f));
			int c = isr.read();
			while (c!=-1){
				c = Character.toLowerCase(c);
				if (c>='a' && c<='z'){
					stats[c-'a']++;
				} 
				c = isr.read();
			}
		} catch(Exception e){
		} finally{
			try {
				isr.close();
			} catch (IOException e) {
			}
		}
		return stats;
	}
}