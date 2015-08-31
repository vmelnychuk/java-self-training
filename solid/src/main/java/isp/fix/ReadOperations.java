package isp.fix;

import java.util.List;

public interface ReadOperations {
    Entity readOne(int id);
    List<Entity> readAll();
}
