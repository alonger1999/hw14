package hillelHomeWorks;

// Создать класс Box с полями ширина, высота, длина.
// Определить метод класса, который вычисляет объем этой коробки (ширина * высоту * длину).
// Создать 5 конкретных объектов этого класса и задать с помощью конструктора конкретное состояние
// этих объектов (конкретные величины ширины, высоты и длины). Вывести на экран объемы этих коробок

public class HW11KravtsovVitalii {

    public static void main(String[] args) {

        try {

            Box b1 = new Box(1, 2, 3, Material.IRON);
            Box b2 = new Box(2, 3, 4, Material.WOOD);
            Box b3 = new Box(3, 4, 5, Material.PAPER);
            Box b4 = new Box(4, 5, 6, Material.WOOD);
            Box b5 = new Box(5, 6, 7, Material.WOOD);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println(b5);

            System.out.println();

            System.out.println("Volume 1: " + b1.getVolume());
            System.out.println("Volume 2: " + b2.getVolume());
            System.out.println("Volume 3: " + b3.getVolume());
            System.out.println("Volume 4: " + b4.getVolume());
            System.out.println("Volume 5: " + b5.getVolume());

            Box b = new Box(0, 2, 3, Material.IRON);
            System.out.println(b);

        } catch (IllegalArgumentException ex) {
            System.out.println("\n" + ex.getMessage());
        }

    }
}

enum Material {
    WOOD, PAPER, IRON
}

enum Color {
    WHITE, BLACK, RED, BROWN
}

class Box {
    protected double width, height, length;
    protected Material material;

    public Box(double newWidth, double newHeight, double newLength, Material newMaterial) {

        if (newWidth <= 0 || newHeight <= 0 || newLength <= 0) {
            throw new IllegalArgumentException("width, height and length must be positive");
        }

        width = newWidth;
        height = newHeight;
        length = newLength;
        material = newMaterial;

    }

    public double getVolume() {
        double volume = width * height * length;
        return volume;
    }

    @Override
    public String toString() {
        return "Box: [" + "width: " + width + " height: " + height + " length: " + length + " material: " + material + "]";
    }

}

