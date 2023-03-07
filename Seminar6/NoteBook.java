package Seminar6;

public class NoteBook {

    String brand = "undefined";
    String model = "undefined";
    String OS = "Windows";
    int hd = 0;
    int ram = 0;
    int price = 0;


    public NoteBook(String brand, String model, String OS, int hd, int ram, int price) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.hd = hd;
        this.ram = ram;
        this.price = price;
    }

    public String toString() {
        String res = String.format("Брэнд: " + brand + "\n" + "Модель: " + model + "\n"
                + "Жесткий диск: " + hd + "\n" + "Оперативная память: " +  ram + "\n" + "Цена: " + price + "\n");
        return res;
    }
}
