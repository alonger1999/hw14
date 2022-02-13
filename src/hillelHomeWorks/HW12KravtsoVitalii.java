package hillelHomeWorks;

// Добавить в класс Box из предыдущей домашки несколько новых свойств (цвет и материал).
// Реализовать новый конструктор (дополнительно к существующему), который будет устанавливать все поля,
// также добавить геттеры и сеттеры на каждое поле. В сеттеры добавить логику на установку значений высоты,
// ширины и длинны - чтобы нельзя было установить значение меньше, либо равное нулю

public class HW12KravtsoVitalii {

    public static void main(String[] args) {

        try {

            ColorBox cb = new ColorBox(2, 3, 4, Material.PAPER, Color.BLACK);
            System.out.println("\nVolume: " + cb.getVolume() + "\nColor: " + cb.getColor() + "\nMaterial: " + cb.getMaterial());
            System.out.println(cb);

            cb.setWidth(5);
            cb.setHeight(6);
            cb.setLength(7);
            cb.setColor(Color.RED);
            cb.setMaterial(Material.WOOD);
            System.out.println("\nVolume: " + cb.getVolume() +  "\nColor: " + cb.getColor() + "\nMaterial: " + cb.getMaterial());
            System.out.println(cb);

            cb = new ColorBox(2, -3, 4, Material.PAPER, Color.BLACK);
            System.out.println(cb);

        } catch (IllegalArgumentException ex) {
            System.out.println("\n" + ex.getMessage());
        }

    }
}


class ColorBox extends Box {

    private Color color;

    public ColorBox(double newWidth, double newHeight, double newLengt, Material newMaterial) {
        super(newWidth, newHeight, newLengt, newMaterial);
    }

    public ColorBox(double newWidth, double newHeight, double newLength, Material newMaterial, Color newColor) {
        super(newWidth, newHeight, newLength, newMaterial);
        color = newColor;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setWidth(double newWidth) {
        if (newWidth > 0) {
            width = newWidth;
        } else {
            System.out.println("newWidth must be positive");
        }
    }

    public void setHeight(double newHeight) {
        if (newHeight > 0) {
            height = newHeight;
        } else {
            System.out.println("newHeight must be positive");
        }
    }

    public void setLength(double newLength) {
        if (newLength > 0) {
            length = newLength;
        } else {
            System.out.println("newLength must be positive");
        }
    }

    public void setMaterial(Material newMaterial) {
        material = newMaterial;
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "ColorBox: [" + "width: " + width + " height: " + height + " length: " + length + " material: " + material + " color: " + color + "]";
    }

}
