import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class filterPircture {
    public static void main(String[] args) {
        for(File file:new File("D:\\pircture").listFiles()){
            String fileName= file.getName();
            int numsize=0;
            boolean isTwo=false;
            for(char c:fileName.toCharArray()){
                if(Character.isDigit(c)){
                    numsize++;
                }
                if(numsize==5&&c=='2'){
                    isTwo=true;
                }
            };
            if (!isTwo) {
                //  File;
                try {
                    Files.deleteIfExists(file.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
