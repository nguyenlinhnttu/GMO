package dataInputExample;

import java.io.*;

public class DataInputExample {
    private static final String OUTPUT_FILE = "C:/Users/MyPC/Downloads/input.txt";

    public static void main(String[] args) throws IOException {
        int n = 10;
        long[] longArray = { 1000, 1111, 2222, 3333 };
        String hello = "Hello, My name is Linh!";
        byte[] helloByte = hello.getBytes();
        // write data to input.txt
        try {
            OutputStream ops = new FileOutputStream(OUTPUT_FILE);
            DataOutputStream dataOutputStream = new DataOutputStream(ops);

            dataOutputStream.writeInt(n);
            for (int i = 0; i < longArray.length; i++) {
                dataOutputStream.writeLong(longArray[i]);
            }
            dataOutputStream.write(n);
            dataOutputStream.write(helloByte);

            dataOutputStream.close();
            ops.close();

        } catch (Exception e) {
            System.out.println("Lỗi: " + e);
        }
        readFile();
    }

    // Read file
    public static void readFile() throws IOException {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(OUTPUT_FILE));
            String content = new String();
            while ((content = dis.readLine()) != null) {
                System.out.println(content);
            }
            dis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
