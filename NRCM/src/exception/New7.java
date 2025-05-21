package exception;

import java.io.*;

public class New7 {
    public static void main(String[] args) throws IOException {
        // Escape backslashes correctly
        FileWriter f1 = new FileWriter("C:\\Users\\Administrator\\Desktop\\file2.txt");
        f1.write("hi how are you");
        f1.close();
        System.out.println("success");
        }
    }

