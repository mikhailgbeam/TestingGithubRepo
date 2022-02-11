package TestingCode;

import java.io.IOException;

public class LaunchNotepadTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}