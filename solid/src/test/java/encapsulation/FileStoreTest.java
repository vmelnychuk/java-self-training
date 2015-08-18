package encapsulation;

import org.junit.Test;

import static org.junit.Assert.*;


public class FileStoreTest {
    public static final int ID = 468;
    public static final String MESSAGE = "It's a message";

    @Test
    public void saveWithRead() {
        FileStore fileStore = new FileStore();
        fileStore.setWorkingDirectory("/tmp");
        fileStore.save(ID, MESSAGE);
        String readMessage = fileStore.read(ID);
        assertEquals(MESSAGE, readMessage);
    }
}