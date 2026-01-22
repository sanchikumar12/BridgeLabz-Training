package robowarehouse;

public class RoboWarehouse {
    public static void main(String[] args) {
        PackageShelf shelf = new PackageShelf(10);

        shelf.insertPackage(30);
        shelf.displayShelf();

        shelf.insertPackage(10);
        shelf.displayShelf();

        shelf.insertPackage(25);
        shelf.displayShelf();

        shelf.insertPackage(5);
        shelf.displayShelf();
    }
}

