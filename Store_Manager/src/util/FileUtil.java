package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import model.Book;

public class FileUtil {
    private static FileUtil fileUtil;
    private FileUtil(){
    }
    

    public static FileUtil GetInstance(){
        if(fileUtil == null){
            fileUtil = new FileUtil();
        }
        return fileUtil;
    }
    public void writeFile(List<Book> listBook) throws IOException {
        String path = "/Users/mac/Downloads/case_study_module2-main/Store_Manager/src/database/data_book.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (Book book : listBook) {
            bw.write(book.toString());
            bw.write("\n");
            bw.flush();
        }
    }
}
