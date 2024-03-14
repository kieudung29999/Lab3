package Lab3;

import java.io.File;
import java.util.Scanner;

public class Lab3_2 {
	 public static void delete(File file) {
	        if (file.isDirectory()) {
	            File[] files = file.listFiles();
	            if (files != null) {
	                for (File f : files) {
	                    delete(f);
	                }
	            }
	        }
	  
	        file.delete();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập đường dẫn tới file hoặc thư mục: ");
	        String path = scanner.nextLine();

	        File file = new File(path);
	        if (file.exists()) {
	            delete(file);
	            System.out.println("Đã xóa thành công");
	        } else {
	            System.out.println("File hoặc thư mục không tồn tại");
	        }

	        scanner.close();
	    }

}
