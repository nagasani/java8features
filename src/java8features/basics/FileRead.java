package java8features.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fi = new FileInputStream("");
		Scanner sc = new Scanner(fi);
		while(sc.hasNextLine()){
			String s= new String();
            s = sc.nextLine();
            System.out.println(s);
        }  
	}

}
