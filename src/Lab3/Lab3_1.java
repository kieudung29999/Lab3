package Lab3;

import java.io.File;
import java.util.Scanner;

public class Lab3_1 {
	 public static long lengthFile(File file) {
	        if (file.isDirectory()) {
	            long size = 0;
	            File[] files = file.listFiles();
	            if (files != null) {
	                for (File f : files) {
	                    size += lengthFile(f);
	                }
	            }
	            return size;
	        }
	        else {
	            return file.length();
	        }

}
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Nhập đường dẫn tới file hoặc thư mục: ");
	        String filePath = scanner.nextLine();
	        
	        File file = new File(filePath);
	        if (file.exists()) {
	            long fileSize = lengthFile(file);
	            System.out.println("Độ lớn của file: " + fileSize + " bytes.");
	        } else {
	            System.out.println("File hoặc thư mục không tồn tại");
	        }
	        
	        scanner.close();
	    }
}
