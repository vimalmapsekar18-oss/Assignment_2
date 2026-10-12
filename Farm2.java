class Farm2 {
    private String crop;
    private int quantity;

    public void setDetails(String c, int q) {
        crop = c;
        quantity = q;
    }

    public void display() {
        System.out.println("Crop: " + crop);
        System.out.println("Quantity: " + quantity + " kg");
    }

    public static void main(String[] args) {
        Farm2 f = new Farm2();
        f.setDetails("Wheat", 500);
        f.display();
    }
}