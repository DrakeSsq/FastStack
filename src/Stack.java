public interface Stack<T> {

    /**
     * @return пуст ли стек
     */
    boolean isEmpty();

    /**
     * @return заполнен ли стек
     */
    boolean isFull();

    /**
     * @return размер стека
     */
    int size();

    /**
     * @param item элемент
     * @return содержится ли элемент в стеке
     */
    boolean contains(T item);

    /**
     * Возвращает элемент с вершины стека
     * @return элемент с вершины стека
     * @throws StackException если стек пуст
     */
    T peek() throws StackException;

    /**
     * Удаляет элемент с вершины стека и возвращает его
     * @return элемент с вершины стека
     * @throws StackException если стек пуст
     */
    T pop() throws StackException;

    /**
     * Добавляет элемент в вершину стека
     * @param item элемент
     * @throws StackException если стек уже переполнен
     */
    void push(T item) throws StackException;

    /**
     *
     * @return Максимимальный элемент в стеке
     * @throws StackException если стек пуст
     */
    T maxPeek() throws StackException;
}
