package k07.manager;

import java.util.ArrayList;

public class ListSorter<T extends Comparable<T>> {
    private ArrayList<T> items;

    public ArrayList<T> getItems() {
        return items;
    }

    public ListSorter(ArrayList<T> items) {
        this.items = items;
    }

    public void sort() {
        for (int index = 0; index < items.size(); index++) {
            for (int index_2 = index + 1; index_2 < items.size(); index_2++) {
                if (items.get(index).compareTo(items.get(index_2)) > 0) {
                    T item = items.get(index);
                    items.set(index, items.get(index_2));
                    items.set(index_2, item);
                }
            }
        }
    }

    public void sortReverse() {
        for (int index = 0; index < items.size(); index++) {
            for (int index_2 = index + 1; index_2 < items.size(); index_2++) {
                if (items.get(index).compareTo(items.get(index_2)) < 0) {
                    T item = items.get(index);
                    items.set(index, items.get(index_2));
                    items.set(index_2, item);
                }
            }
        }
    }
}