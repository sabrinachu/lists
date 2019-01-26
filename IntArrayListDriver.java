public class IntArrayListDriver 
{
  public static void main(String [] args)
  {
    testSet();
    testRemove();
    testEquals();
    testIsEmpty();

    // // IntList list = new IntArrayList(2); 
    // // IntList secondList = new IntArrayList(2);
    // // IntArrayList zeroList = new IntArrayList(0);
    // // IntArrayList notZeroList = new IntArrayList(1); 
    // // IntList thirdList = new IntArrayList();
    

    // IntList list = new IntArrayList();
    // //test size
    // System.out.println("size: " + list.size());
    // list.add(100);
    // System.out.println("size: " + list.size());
    // list.remove(0);
    // System.out.println("size: " + list.size());


    // //test add
    //  list = new IntArrayList(1);
    //  list.add(0, 2);
    //  list.add(1, 3); 
    //  list.add(1, 5);
    //  list.add(3, 7);
    // // System.out.println("Expected: 2,5,3,7  actual: " + list.toString());
    
    //  System.out.println(list.add(8));
    // // System.out.println("Expected: 2,5,3,7,8   actual: " + list.toString());

    // //test get
    // // System.out.println("expect: 2  actual: " + list.get(0));
    // // System.out.println("expect: 3  actual: " + list.get(2));
    // // System.out.println(list.get(5));


    // //test set 
    // // System.out.println("expect: 7  actual: " + list.set(3, 100));
    // // System.out.println("Expected: 2,5,3,100,8  actual: " + list.toString());

    // // System.out.println(list.set(6, 2));

    // // //test remove 
    // System.out.println("size before: " + list.size());
    // System.out.println("expected: 3  actual: " + list.remove(2));
    // System.out.println("expected: 2,5,100,8  actual: " + list.toString());
    // System.out.println("size after: " + list.size());

    
    // /*System.out.println("size before: " + list.size());
    // System.out.println("expected: 8  actual: " + list.remove(4));
    // System.out.println("expected: 2,5,3,100  actual: " + list.toString());
    // System.out.println("size after: " + list.size());*/


    // // System.out.println("size before: " + list.size());
    // // System.out.println("expected: 2 actual: " + list.remove(0));
    // // System.out.println("expected: 5,3,100,8  actual: " + list.toString());
    // // System.out.println("size after: " + list.size());

    
    // //test equals 
    // list = new IntArrayList(1);
    // IntList secondList = new IntArrayList(1); 

    // list.add(1);
    // secondList.add(1);

    // list.add(2);
    // secondList.add(2);

    // list.add(3);
    // secondList.add(3);

    // System.out.println("should be true: " + list.equals(secondList));


    // list = new IntArrayList(2);
    // secondList = new IntArrayList(1); 

    // list.add(2);

    // System.out.println("diff size: " + list.equals(secondList));

    // list = new IntArrayList(2);
    // secondList = new IntArrayList(2); 

    // list.add(2);
    // secondList.add(2);

    // list.add(3);
    // secondList.add(3);

    // list.add(4);
    // secondList.add(3);

    // secondList = null; 
    // System.out.println(list.equals(secondList));


    // //test isEmpty
    // IntArrayList list1 = new IntArrayList(2);
    // IntArrayList list2 = new IntArrayList(2); 

    // list2.add(2); 

    // System.out.println("is empty: " + list1.isEmpty());
    // System.out.println("is not empty: " + list2.isEmpty());

  
  }

  public static void testSet() {
    IntList list = new IntArrayList(2);
    list.add(0,2);
    list.set(0,1);
    System.out.println("\n\ntestSet=================");
    System.out.println("Expected: 1   Actual: " + list.get(0));
  }

  public static void testRemove() {
    IntList list = new IntArrayList(2);
    list.add(0,10);
    list.add(1,20);
    list.add(2,30);

    list.remove(1);

    System.out.println("\n\ntestRemove=================");
    System.out.println("Expected: [10,30]  Actual: " + list.toString());

    list.remove(1);
    System.out.println("Expected: [10]  Actual: " + list.toString());
  }

  public static void testEquals() {
    IntList list1 = new IntArrayList();
    IntList list2 = new IntArrayList();

    System.out.println("\n\ntestEqual=================");
    System.out.println("Expected: true   Actual: " + list1.equals(list2));

    list1.add(3);
    list2.add(4);
    System.out.println("Expected: false   Actual: " + list1.equals(list2));

    list1.add(3);
    list2.add(3);
    list2.add(4);
    System.out.println("Expected: false   Actual: " + list1.equals(list2));

  }

  public static void testIsEmpty()
  {
    IntArrayList list1 = new IntArrayList();

    System.out.println("\n\ntestIsEmpty=================");
    System.out.println("Expected: true  Actual: " + list1.isEmpty());

    list1.add(2);
    System.out.println("Expected: false  Actual: " + list1.isEmpty());

    

  }
}