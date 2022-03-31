import java.io.File;

public class FileUtils {

    static final String WRONG_PATH_MESSAGE = "Путь не существует или указан неверно!";
    static final String FILE_NOT_DIRECTORY_MESSAGE = "Указан файл, а не папка!";

    public static long calculateFolderSize(String path) {
        File directory = new File(path);

        directory(directory);
        file(directory);

        long size = org.apache.commons.io.FileUtils.sizeOfDirectory(directory);
        return size;
    }

    private static void directory(File directory){
        if(!directory.exists()){
            throw new IllegalArgumentException(WRONG_PATH_MESSAGE);
        }
    }

    private static void file(File directory){
        if(directory.isFile()){
            throw new IllegalArgumentException(FILE_NOT_DIRECTORY_MESSAGE);
        }
    }
}
