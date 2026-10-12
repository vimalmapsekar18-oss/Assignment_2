
class Tourist {
    String name;
    String destination;

    void display() {
        System.out.println("Tourist Name: " + name);
        System.out.println("Destination: " + destination);
    }

    public static void main(String[] args) {
        Tourist t = new Tourist();

        t.name = "Diya";
        t.destination = "Goa";

        t.display();
    }
}
