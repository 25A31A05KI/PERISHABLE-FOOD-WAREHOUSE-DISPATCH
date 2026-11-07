
import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    private List<FoodBatch> heap = new ArrayList<>();

    public void insert(FoodBatch batch) {
        heap.add(batch);
        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent).getExpiryDate()
                    .compareTo(heap.get(index).getExpiryDate()) <= 0) {
                break;
            }

            swap(parent, index);
            index = parent;
        }
    }

    public FoodBatch extractMin() {
        if (heap.isEmpty()) {
            return null;
        }

        FoodBatch min = heap.get(0);
        FoodBatch last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }

        return min;
    }

    private void heapify(int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() &&
            heap.get(left).getExpiryDate()
                .compareTo(heap.get(smallest).getExpiryDate()) < 0) {
            smallest = left;
        }

        if (right < heap.size() &&
            heap.get(right).getExpiryDate()
                .compareTo(heap.get(smallest).getExpiryDate()) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        FoodBatch temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void display() {
        if (heap.isEmpty()) {
            System.out.println("No food batches available.");
            return;
        }

        for (FoodBatch batch : heap) {
            System.out.println(batch);
        }
    }
}
