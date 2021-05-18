/*
When we System.out.println() an array, we get a memory address of the array.
To get a more descriptive printout of the array, we need a toString() method.
This method is provided by the Arrays package in Java.
 */
package src;

import java.util.Arrays;

/*
When we import a class in Java, we are making all of the methods of that package
available in our code.
 */

public class Chats {

    public Chats(){

    }

    public String[] getTopics() {
        return new String[]{"Opinion", "Tech", "Science", "Health"};
    }

    public static void main (String[] args) {
        Chats myChat = new Chats();
        String[] topics = myChat.getTopics();
        System.out.println(
            Arrays.toString(topics)
        );
    }
}
