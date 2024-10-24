import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        tree_node node1 = new tree_node(5);
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i < 500; i ++) {
            array.add(i);
        }
        Collections.shuffle(array);

        for(int num: array){
            node1.add(num);
        }
        String text = node1.order();
        System.out.println(node1.find(410));
    }

}
//Hello :D this is an example comment of how to use github
//Small example edit
