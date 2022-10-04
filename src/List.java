//COPY
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.*;
//
//public class List {
//
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//    }
//}
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//    }
//}
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("mazda");
//        cars.add("toyota");
//        cars.add("mers");
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<Integer> cars = new ArrayList<Integer>();
//        cars.add(11);
//        cars.add(12);
//        cars.add(13);
//        cars.add(14);
//        for (Integer i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("mazda");
//        cars.add("toyota");
//        cars.add("mers");
//        Collections.sort(cars);
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<Integer> cars = new ArrayList<Integer>();
//        cars.add(11);
//        cars.add(12);
//        cars.add(1);
//        cars.add(4);
//
//        Collections.sort(cars);
//        for (Integer i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//
//public class List {
//    public static void main(String[] args) {
//
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        String car = cars.get(0);
//        System.out.println("get method:" + car);
//        cars.set(0, "Opel");
//        System.out.println("set method:" + cars);
//        cars.remove(0);
//        System.out.println("remove method:" + cars);
//        cars.clear();
//        System.out.println("clear method:" + cars);
//        int s = cars.size();
//        System.out.println("list size" + s);
//    }
//}
//    problem Solving
//    practice
//            Problem1
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("red");
//        color.add("blue");
//        color.add("gray");
//        color.add("black");
//        System.out.println(color);
//    }
//}
//Problem2
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("red");
//        color.add("blue");
//        color.add("gray");
//        color.add("black");
//
//        color.add(0, "white");
//        System.out.println(color);
//    }
//}
//Problem3
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("red");
//        color.add("blue");
//        color.add("gray");
//        color.add("black");
//        color.remove(2);
//        System.out.println(color);
//    }
//}
//Problem4
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("red");
//        color.add("blue");
//        color.add("gray");
//        color.add("black");
//        color.set(2, "yellow");
//        System.out.println(color);
//    }
//}
//Problem5
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("red");
//        color.add("blue");
//        color.add("gray");
//        color.add("black");
//        color.remove(2);
//        System.out.println(color);
//    }
//}
//Proble6
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("red");
//        color.add("blue");
//        color.add("gray");
//        color.add("black");
//        for (String i : color) {
//            if (i == "red") {
//                System.out.println(i);
//            } else {
//                break;
//            }
//        }
//    }
//}
// Problem7
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> List1 = new ArrayList<String>();
//        List1.add("1");
//        List1.add("2");
//        List1.add("3");
//        List1.add("4");
//        System.out.println("List1: " + List1);
//        ArrayList<String> List2 = new ArrayList<String>();
//        List2.add("A");
//        List2.add("B");
//        List2.add("C");
//        List2.add("D");
//        System.out.println("List2: " + List2);
//        // Copy List2 to List1
//        Collections.copy(List1, List2);
//        System.out.println("==================");
//        System.out.println("List1: " + List1);
//        System.out.println("List2: " + List2);
//    }
//}
//Problem8
//
//public class List {
//    public static void main(String[] args) {
//        // Creae a list and add some colors to the list
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//        System.out.println("List before shuffling:" + list);
//        Collections.shuffle(list);
//        System.out.println("List after shuffling:" + list);
//    }
//}
//Problem9
//
//public class List {
//    public static void main(String[] args) {
//        // Creae a list and add some colors to the list
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//        System.out.println("List before shuffling:" + list);
//        Collections.reverse(list);
//        System.out.println("List after reverse:" + list);
//    }
//}
//    BONUS
//            Problem1
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> arr1 = new ArrayList<String>();
//        arr1.add("Jomart");
//        arr1.add("Dias");
//        arr1.add("Ers");
//        arr1.add("Roma");
//        arr1.add("Hurik");
//        arr1.add("Alnur");
//        arr1.add("Madi");
//        arr1.add("dONI");
//        System.out.println(arr1);
//        System.out.println(arr1.subList(2, 5));
//    }
//}
//Problem2
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> arr1 = new ArrayList<String>();
//        arr1.add("Jomart");
//        arr1.add("Dias");
//        arr1.add("Ers");
//        arr1.add("Roma");
//        ArrayList<String> arr2 = new ArrayList<String>();
//        arr2.add("Hurik");
//        arr2.add("Alnur");
//        arr2.add("Madi");
//        arr2.add("Aldik");
//        arr2.add("dONI");
//        if (arr1.size() > arr2.size()) {
//            System.out.println(arr1);
//        } else if (arr1.size() < arr2.size()) {
//            System.out.println(arr2);
//        }
//    }
//}
//Problem3
//
//public class List {
//    public static void main(String[] args) {
//        ArrayList<String> arr1 = new ArrayList<String>();
//        arr1.add("Jomart");
//        arr1.add("Dias");
//        arr1.add("Ers");
//        arr1.add("Roma");
//        arr1.add("Hurik");
//        arr1.add("Alnur");
//        arr1.add("Madi");
//        arr1.add("Aldik");
//        arr1.add("dONI");
//        Collections.swap(arr1, 2, 4);
//        System.out.println(arr1);
//    }
//}
//Problem4
//
//public class List {
//    public static void main(String[] args) {
//
//        ArrayList<String> arr1 = new ArrayList<String>();
//        arr1.add("Jomart");
//        arr1.add("Dias");
//        arr1.add("Ers");
//        arr1.add("Roma");
//        ArrayList<String> arr2 = new ArrayList<String>();
//        arr2.add("Hurik");
//        arr2.add("Alnur");
//        arr2.add("Madi");
//        arr2.add("Aldik");
//        arr2.add("dONI");
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.addAll(arr1);
//        arr.addAll(arr2);
//        System.out.println(arr);
//    }
//}