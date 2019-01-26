/*******************************************************************************
* Program: IntArrayList.java                                                   *
********************************************************************************
* Author: Sabrina Chu                                                          *
* Due Date: 12/07/2018                                                         *
* Description: This class implements the IntList interface, and contains       *
*              methods to use auto-resize arrays.                              *
*******************************************************************************/

public class IntArrayList implements IntList {
  private int[] array;
  private int listSize;

  public IntArrayList() {
    this(10);
  }

  public IntArrayList(int initLength) {
    this.array = new int[initLength];
    this.listSize = 0;
  }

  public int size() {
    return listSize;
  }

  public boolean add(int value) {
    add(listSize, value); //calls the other add method 
    return true; 
  }

  public void add(int index, int value) {

    //if the number given is greater than the user's list size
    if (index > listSize || index < 0) {
      throw new IndexOutOfBoundsException("Array index out of bounds");
    }

    // doubles the array's size when it's running out of space
    if (listSize == array.length) {
      int[] newArray = new int[array.length * 2];

      // copies everything in the old array into the new, bigger array
      for (int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
      }
      this.array = newArray; // returns everything back into the original array
    }

    //move all the values one space to the right in the array from the index 
    for(int i = listSize; i > index; i--)
    {
      array[i] = array[i-1]; 
    }

    array[index] = value; //adds value to given index 

    listSize++; // a number was added into the user's array
  }

  public int get(int index) {
    if (index > listSize - 1 || index < 0) {
      throw new IndexOutOfBoundsException("Array index out of bounds");
    }

    return array[index];
  }

  public int set(int index, int value) {
    if (index > listSize - 1 || index < 0) {
      throw new IndexOutOfBoundsException("Array index out of bounds");
    }

    int oldNum = array[index]; //saves the original value
    array[index] = value;

    return oldNum;
  }

  public int remove(int index) {

    if (index > listSize - 1 || index < 0) {
      throw new IndexOutOfBoundsException("Array index out of bounds");
    }

    int oldNum = array[index]; // saves the original value

    //moves all the values after the index one space to the left 
    for(int i = index; i < listSize; i++)
    {
      array[i] = array[i + 1]; 
    }

    listSize--; //a number was removed from the user's array

    return oldNum;
  }

  public String toString() {
    String result = "";

    for (int i = 0; i < listSize; i++) {
      result += array[i];
      if (i != listSize - 1) {
        result += ", ";
      }
    }

    return "[" + result + "]";
  }

  // this overrides object's equals method because the method signatures are the same
  public boolean equals(Object obj) {
    Boolean result;

    if (obj instanceof IntList) // checks if obj is of type IntList
    {
      result = this.equals((IntList) obj); // calls the overloaded equals method in this class
    } else {
      result = false;
    }

    return result;
  }

  // does not have the same method signature as the equals method in Object Class so it cannot override it
  public boolean equals(IntList other) {


    boolean isEqualOrNot = true; // first assumes it's true

    if(other == null)
    {
      isEqualOrNot = false; 
    }
    else if (this.size() == other.size()) // if the arrays are the same size
    {
      for (int i = 0; i < other.size(); i++) {
        if (array[i] != other.get(i)) // if the numbers in the arrays aren't the same
        {
          isEqualOrNot = false; // sets to false
          break; // exits loop
        }
      }
    } else {
      isEqualOrNot = false; // if the arrays are not the same size
    }
    return isEqualOrNot;
  }

  // checks if the array's size is 0
  public boolean isEmpty() {
    if (listSize != 0) {
      return false;
    }
    return true;
  }

}