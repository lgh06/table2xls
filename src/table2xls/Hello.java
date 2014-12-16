package table2xls;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import me.chyxion.xls.TableToXls;

public class Hello {
	
	public static void hi() throws Exception{
	
		StringBuilder html = new StringBuilder();
	    Scanner s = new Scanner(new FileInputStream("F:/KanBox/BinhaiFront/table-to-xls/sample.html"), "utf-8");
	    while (s.hasNext()) {
	        html.append(s.nextLine());
	    }
	    s.close();
	    FileOutputStream fout = new FileOutputStream("F:/KanBox/BinhaiFront/table-to-xls/data.xls");
	    fout.write(TableToXls.process(html));
	    fout.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		Hello.hi();
	}
    

}
