package k07.manager;

import java.util.ArrayList;

public class ListHandler<T extends Comparable<T>> {
    private final ArrayList<T> items;

    public ListHandler(ArrayList<T> items) {
        this.items = items;
    }

    public void sortAscending() {
        for (int index = 0; index < items.size() - 1; index++) {
            for (int secondIndex = 0; secondIndex < items.size() - index - 1; secondIndex++) {
                if (items.get(secondIndex).compareTo(items.get(secondIndex + 1)) > 0) {
                    T temp = items.get(secondIndex);
                    items.set(secondIndex, items.get(secondIndex + 1));
                    items.set(secondIndex + 1, temp);
                }
            }
        }
    }

    public void sortDescending() {
        for (int index = 0; index < items.size() - 1; index++) {
            for (int secondIndex = 0; secondIndex < items.size() - index - 1; secondIndex++) {
                if (items.get(secondIndex).compareTo(items.get(secondIndex + 1)) < 0) {
                    T temp = items.get(secondIndex);
                    items.set(secondIndex, items.get(secondIndex + 1));
                    items.set(secondIndex + 1, temp);
                }
            }
        }
    }

    public ArrayList<T> getItems() {
        return items;
    }
}