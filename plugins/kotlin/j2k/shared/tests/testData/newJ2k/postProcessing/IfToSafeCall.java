// IGNORE_K2
import java.io.File;

class C {
    void foo(File file) {
        if (file != null) {
            file.delete();
        }
    }
}