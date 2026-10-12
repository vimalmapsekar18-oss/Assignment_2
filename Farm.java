
class Farm {
    String crop;
    int acres;

    void display() {
        System.out.println("Crop: " + crop);
        System.out.println("Farm Area: " + acres + " acres");
    }

    public static void main(String[] args) {
        Farm f1 = new Farm();

        f1.crop = "Rice";
        f1.acres = 5;

        f1.display();
    }
}
