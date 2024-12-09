package Library;

public class Book {
    public String tittle;
    public int year;
    public double price;

    public String getTittle() {
        return this.tittle;
    }
    public void setTittle(String tittle) {
        this.tittle;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Book() {
        tittle = "";
        year = 0;
        price = 0;
    }
    public Book(String tittle, int year, double price) {
        this.tittle = tittle;
        this.year = year;
        this.price = price;
    }
    public double discount(int a, double b) {
        int discount = 0;
        if (a <= 2020 && a >= 2011) {
            discount = 20;
        } else if (a < 2011) {
            discount = 50;
        }
        double discountPrice = b * discount / 100;
        return discountPrice;
    }
    public void print() {
        System.out.println("Judul: " + tittle);
        System.out.println("Tahun terbit: " + year);
        System.out.println("Harga: Rp" + (price - discount(year, price)) + ",-(setelah diskon)");
    }
}
