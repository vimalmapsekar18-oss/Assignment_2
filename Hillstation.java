
class TourismPlace {
    void visit() {
        System.out.println("This is a tourist destination.");
    }
}

class Beach extends TourismPlace {
    void activity() {
        System.out.println("Enjoy swimming at the beach.");
    }
}

class HillStation extends TourismPlace {
    void activity() {
        System.out.println("Enjoy trekking in the hills.");
    }

    public static void main(String[] args) {
        Beach b = new Beach();
        HillStation h = new HillStation();

        b.visit();
        b.activity();

        h.visit();
        h.activity();
    }
}
