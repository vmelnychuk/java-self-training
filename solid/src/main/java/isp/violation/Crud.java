package isp.violation;

import java.util.List;

public interface Crud {
    void create(Entity entity);
    Entity readOne(int id);
    List<Entity> readAll();
    void update(Entity entity);
    void delete(Entity entity);
}
