package fileio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamModel {
	private static final String FILE_INPUT="C:/Users/MyPC/Downloads/input.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        try {
            in = new FileInputStream(FILE_INPUT);
            // Đọc dữ liệu trong file input.txt
            int content;
            while ((content = in.read()) != -1) {
                System.out.print((char) content);
            }
        } finally {
            in.close();
        }
    }
}
