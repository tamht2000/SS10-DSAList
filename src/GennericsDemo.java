import java.util.List;

public interface GennericsDemo<T> {
    List<T> getAll();
    void delete();
    void update(int id, T t);
    T findById(int id);
}
