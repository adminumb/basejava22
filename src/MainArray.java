import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Interactive test for ArrayStorage implementation
 * (just run, no need to understand)
 */
public class MainArray {
    private final static ArrayStorage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) throws IOException {
        Resume r1 = new Resume();
        r1.setUuid("#001");
        Resume r2 = new Resume();
        r1.setUuid("#002");
        Resume r3 = new Resume();
        r1.setUuid("#003");
        Resume r4 = new Resume();
        r1.setUuid("#004");

        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);
        ARRAY_STORAGE.save(r4);

        System.out.println("Get r1:" + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Get size:" + ARRAY_STORAGE.size());
    }

    static void printAll() {
        Resume[] all = ARRAY_STORAGE.getAll();
        System.out.println("----------------------------");
        if (all.length == 0) {
            System.out.println("Empty");
        } else {
            for (Resume r : all) {
                System.out.println(r);
            }
        }
        System.out.println("----------------------------");
    }
}
