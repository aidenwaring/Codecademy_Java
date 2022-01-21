package src;

import java.util.ArrayList;

class CheckListSimple {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        String toDo2 = "Feed the dog";
        String toDo3 = "Walk a mile";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

//      toDoList.add("Most things now make me smile");

        System.out.println(toDoList);


    }

}