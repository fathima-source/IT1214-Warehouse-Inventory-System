import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added");
    }

    public void removeItem(String id) {
        if (items.containsKey(id)) {
            items.remove(id);
            System.out.println("Item removed");
        } else {
            System.out.println("Item not found");
        }
    }

    public void updateQuantity(String id, int qty) {
        if (items.containsKey(id)) {
            items.get(id).setQuantity(qty);
            System.out.println("Quantity updated");
        } else {
            System.out.println("Item not found");
        }
    }

    public void searchById(String id) {
        if (items.containsKey(id)) {
            System.out.println(items.get(id));
        } else {
            System.out.println("Item not found");
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Item i : items.values()) {
            if (i.getItemName().equalsIgnoreCase(name)) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items");
        } else {
            for (Item i : items.values()) {
                System.out.println(i);
            }
        }
    }
}