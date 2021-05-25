package src;

import java.util.ArrayList;

class Lunch {

    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i) == "ant") {
                lunchBox.remove(lunchBox.get(i));
                /*
                Now whenever we remove an item, we’ll decrease i by 1.
                Then when we reach the end of the loop, i will increase by 1. It will be like i never changed!
                 */
                i--;

            }
        }
        return lunchBox;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);

    }
}