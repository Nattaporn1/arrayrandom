import java.util.Random;

public class ArrayOperations {
    static int n = 5;  // จำนวนของ element ในแต่ละ array
    static int[] array1 = new int[n];
    static int[] array2 = new int[n];

    static int[] sumArray = new int[n]; // บวก
    static int[] subArray = new int[n]; // ลบ
    static int[] mulArray = new int[n]; // คูณ
    static int[] divArray = new int[n]; // div
    static int[] modArray = new int[n]; // mod
    
    public static void displayArray(int[] array) {
            for(int i =0;i<array.length;i++)         {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
         Random rand = new Random();

        // สุ่มค่าให้กับ array1 และ array2
        for (int i = 0; i < n; i++) {
            array1[i] = rand.nextInt(100) ;
            array2[i] = rand.nextInt(100) ;
        }


        for (int i = 0; i < n; i++) {
            sumArray[i] = array1[i] + array2[i];
            subArray[i] = array1[i] - array2[i];
            mulArray[i] = array1[i] * array2[i];
            divArray[i] = array1[i] / array2[i];
            modArray[i] = array1[i] % array2[i];
        }

        // Display the results
        System.out.println("เมธอด บวก:");
        displayArray(sumArray);

        System.out.println("เมธอด ลบ:");
        displayArray(subArray);

        System.out.println("เมธอด คูณ:");
        displayArray(mulArray);

        System.out.println("เมธอด div:");
        displayArray(divArray);

        System.out.println("เมธอด mod:");
        displayArray(modArray);
    }

}
