import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Question2 {
 public static void main(String[] args) throws 
FileNotFoundException {
 // Create a File object for the text file
 File file = new 
File("C:\\Users\\leoth\\OneDrive\\Desktop\\question2.txt");//Crea
ting a file object for the .txt file
 Scanner scanner = new Scanner(file);//Creating a scanner 
object for the .txt
 ArrayList<Integer> list = new ArrayList<>();//my array 
list to store contents that in my .txt file.
 while (scanner.hasNextLine()) {//i use the while loop to 
Read the contents of the .txt file and store them in the 
5 | P a g e
ArrayList
 list.add(scanner.nextInt());
 }
 System.out.print("Before Sorting : ");
 for (Integer line : list) {// i use the for loop to 
display the contents in .txt file
 System.out.print(line+" ");
 }
 System.out.println();
 Collections.sort(list);//Collection.sort(variable) is 
used to sort the data in the .txt
 System.out.print("After Sorting : ");
 for (Integer line : list) {//i used the for loop to go 
through all the contents of the .txt file and sort it.
 System.out.print (line+" ");
 }
 }
}
