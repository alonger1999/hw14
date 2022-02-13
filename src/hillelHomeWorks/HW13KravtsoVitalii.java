package hillelHomeWorks;


public class HW13KravtsoVitalii {

    public static void main(String[] args) {

        Warehouse w = new Warehouse(5);

        try {

            w.add(new Box(1, 2, 3, Material.IRON));
            w.add(new Box(2, 5, 2, Material.WOOD));
            w.add(new Box(3, 1, 3, Material.PAPER));
            w.add(new Box(1, 1, 2, Material.WOOD));
            w.add(new Box(2, 2, 2, Material.WOOD));

            System.out.println(w);

            w.add(new Box(5, 5, 5, Material.IRON));

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("\n" + ex.getMessage());
        }

    }

}


class Warehouse {

    private Box[] boxes;
    private int amount;

    public Warehouse(int size) {
        boxes = new Box[size];
        amount = 0;
    }

    public void add(Box b) {

        if (amount == boxes.length) {
            throw new IndexOutOfBoundsException("Max amount of boxes exceeded");
        }

        boxes[amount] = b;
        amount++;

    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("Warehouse: {");

        for (int i = 0; i < boxes.length; i++) {
            result.append("\n\t").append(boxes[i]);
        }

        result.append("\n}");

        return result.toString();

    }

}
