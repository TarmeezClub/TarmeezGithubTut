import java.util.List;

public interface Manageable<T> {
    /**
     * Adds an object to the management system.
     *
     * @param item The object to add.
     */
    void add(T item);

    /**
     * Deletes an object from the management system.
     *
     * @param item The object to delete.
     */
    void delete(T item);

    /**
     * Lists all objects in the management system.
     *
     * @return An array or collection of objects.
     */
    List<T> list();

}
