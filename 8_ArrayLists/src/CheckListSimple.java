package src;

import java.util.ArrayList;

class CheckListSimple {

    public static void main(String[] args) {

        //ArrayList<String> toDoList;

        //toDoList = new ArrayList<String>();

        //Declaration and initialisation
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        String toDo2 = "Feed the dog";
        String toDo3 = "Walk a mile";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);


    }

}