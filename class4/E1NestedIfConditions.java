package Java.class4;

public class E1NestedIfConditions {
    public static void main(String[] args) {
        boolean isMainDoorOpened = true;
        boolean isRoom1Opened = false;
        boolean isRoom2Opened = true;

        if (isMainDoorOpened) {
            if (isRoom1Opened) {
                System.out.println("We are in Room1");
            } else {
                System.out.println("Room 1 is closed ");
            }
            if (isRoom2Opened) {
                System.out.println("We are in Room 2 ");
            } else {
                System.out.println("Room 2 is closed");
            }

        }else {
                System.out.println("Can't enter the house main door is closed");
            }
        }
    }

