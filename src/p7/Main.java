package p7;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) throws EOFException, FileSystemNotFoundException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        }else{
            throw  new FileNotFoundException();
        }
    }
}
