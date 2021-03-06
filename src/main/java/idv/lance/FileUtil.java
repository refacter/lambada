package idv.lance;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;

public class FileUtil {
    @SneakyThrows(IOException.class)
    public byte[] read(String srcFilePath, String outPutPath) {

        @Cleanup InputStream in = new FileInputStream(srcFilePath);
        @Cleanup OutputStream out = new FileOutputStream(outPutPath);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
        return null;
    }
}
