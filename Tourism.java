
class Tourism {
    void visit() {
        System.out.println("Tourists visit beautiful places.");
    }
}

class TouristGuide extends Tourism {
    void guide() {
        System.out.println("A guide helps tourists.");
    }

    public static void main(String[] args) {
        TouristGuide t = new TouristGuide();

        t.visit();
        t.guide();
    }
}
