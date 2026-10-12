
abstract class Farming {
    abstract void growCrop();
}

class RiceFarming extends Farming {
    void growCrop() {
        System.out.println("Growing rice using proper farming methods.");
    }

    public static void main(String[] args) {
        RiceFarming r = new RiceFarming();
        r.growCrop();
    }
}
