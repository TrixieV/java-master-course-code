package PreviousChallenge;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class LinkedListChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Perth", 3923));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        printMenu();
        var iterator = placesToVisit.listIterator();
        boolean quitLoop = false;
        boolean forward = true;

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter value: ");
            String input = scanner.nextLine().toLowerCase().substring(0, 1);
            switch (input) {
                case "f":
                    System.out.println("Go forward");
                    if (!forward) {             //Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();     // adjust position forward
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case "b":
                    System.out.println("Go backwards");
                    if (forward) {             //Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();     // adjust position forward
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case "m":
                    System.out.println("Print Menu");
                    printMenu();
                    break;

                case "l":
                    System.out.println(placesToVisit);
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicated: " + place);
            return;
        }

        for (Place p: list) {
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicated: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void printMenu() {
        String textBlock = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
    }
}






















