/**
 * Created by Xsnud on 2016-06-12.
 */
public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();
        System.out.println("myList size: " + myList.size());
        myList.add(4);
        myList.add(200);
        myList.add(4);
        System.out.println(myList.contains(200));
        System.out.println(myList.contains(333));
        System.out.println("myList size: " + myList.size());
    }
}
