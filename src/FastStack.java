public class FastStack implements Stack<Integer> {

    private final Integer[] data;
    private final Integer[] maxValues;

    private Integer itemCount = 0;
    private Integer maxCount = 0;

    public FastStack(Integer size) {
        data = new Integer[size];
        maxValues = new Integer[size];
    }

    @Override
    public boolean isEmpty() {
        return itemCount==0;
    }

    @Override
    public boolean isFull() {
        return itemCount==data.length;
    }

    @Override
    public int size() {
        return itemCount;
    }

    @Override
    public boolean contains(Integer item) {
        for (int i = 0; i < itemCount; i++) {
            if (data[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer peek() throws StackException {
        if (itemCount<=0) {
            throw new StackException();
        }
        return data[itemCount-1];
    }

    @Override
    public Integer pop() throws StackException {
        if (itemCount<=0) {
            throw new StackException();
        }

        if (maxValues[maxCount-1].equals(data[itemCount-1])) {
            maxCount--;
            maxValues[maxCount] = null;
        }

        Integer value = data[itemCount-1];
        data[itemCount-1] = null;
        itemCount--;
        return value;
    }


    @Override
    public void push(Integer item) throws StackException {
        if (itemCount >= data.length) {
            throw new StackException();
        }
        if (maxCount==0) {
            maxValues[maxCount] = item;
            maxCount++;
        } else {
            if (maxValues[maxCount-1] <= item) {
                maxValues[maxCount] = item;
                maxCount++;
            }
        }
        data[itemCount] = item;
        itemCount++;
    }

    @Override
    public Integer maxPeek() throws StackException {
        if (maxCount==0 || itemCount==0) {
            throw new StackException();
        }
        return maxValues[maxCount-1];

    }
}
