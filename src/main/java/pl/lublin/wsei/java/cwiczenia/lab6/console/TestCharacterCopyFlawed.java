package pl.lublin.wsei.java.cwiczenia.lab6.console;

import java.io.*;

public class TestCharacterCopyFlawed {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        long startTime = System.nanoTime();

        try{
            in = new BufferedReader(new FileReader("sample_1920×1280.tiff"));
            out = new BufferedWriter(new FileWriter("img_copy3.tiff"));
            int c;
            while ((c = in.read()) !=-1){
                out.write(c);
            }
        }
        catch (IOException e){
            System.out.println("IOException: "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (in !=null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime-startTime;
        System.out.println("czas wykonania w nanosekundach: "+timeElapsed);
        System.out.println("czas wykonania w milisekundach: "+timeElapsed/1000000);


    }
}
