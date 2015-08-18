package encapsulation;

import org.junit.Test;

import static org.junit.Assert.*;


public class FileStoreTest {
    public static final int ID = 468;
    public static final String MESSAGE = "It's a message";
    public static final String DIR = "/tmp";

    @Test
    public void saveWithRead() {
        FileStore fileStore = new FileStore(DIR);
        fileStore.save(ID, MESSAGE);
        String readMessage = fileStore.read(ID);
        assertEquals(MESSAGE, readMessage);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullInConstructor() {
        FileStore fileStore = new FileStore(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void directoryNotExists() {
        FileStore fileStore = new FileStore("/someRandomDiretory");
    }

}