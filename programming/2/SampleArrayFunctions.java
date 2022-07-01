class ArrayExamples{

  static int [] someData = new int []{45, 23, 78, 99, 12};
  static someData[3] = 0;
  static someData[4] = 0;
  
  static int someDataSize = 3;

  public static void main( String args[]){
    printArray(someData);
    printPartialArray(someData, someDataSize);

    int theIndex = find(67, someData);
    System.out.println("67 is in position " +theIndex);
    theIndex = find(20, someData)
      if (theIndex == someData.length)
  }

//precondition: Assumes array is filled
  public static void printArray(int [] data){
     for (int i = 0; i<data.length; i++){
        System.out.println(data[i] + " ");  
     }
    System.out.println("");  
    
  }


//precondition: Assumes array is partially filled
  public static void printPartialArray(int [] data, int currSize_p){
     for (int i = 0; i<currSize_p; i++){
        System.out.println(data[i] + " ");  
     }
    System.out.println("");      
  }


// returns position of target Item if found
//If not found return the array size
public static int find (int targetItem, int[] data){
  for (int i =0; i<data.length; i++)
    {
      if data[i]  == targetItem) return i; //returns the index
    }
  // This program is not finished. here and the main
}
}