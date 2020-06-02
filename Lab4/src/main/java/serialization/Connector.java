package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Connector {
    public final String PATH_TO_FILE = "";

    public void serialize(Object a, Object b) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\projects\\2kJava\\JavaLabsGit\\Lab4\\t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.writeObject(b);
        oos.close();
    }
}
