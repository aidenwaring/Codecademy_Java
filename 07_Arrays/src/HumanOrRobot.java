package src;

import java.util.Arrays;

public class HumanOrRobot {

    String[] topics;

    public HumanOrRobot(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        HumanOrRobot feed;
        if (args[0].equals("Human")) {

            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new HumanOrRobot(humanTopics);

        } else if(args[0].equals("Robot")) {

            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new HumanOrRobot(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new HumanOrRobot(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
