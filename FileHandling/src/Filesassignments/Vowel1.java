package Filesassignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Vowel1 {

	public static void main(String[] args) throws IOException {
    int countvowels=0;
    FileInputStream obj =new FileInputStream("mydec200");
    int i;
    do {
    i = obj.read();
    if(i=='a' || i== 'e'|| i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='O'|| i=='U');  
    countvowels++;
    }while (i!=-1);
    System.out.println("number of vowels");
     obj.close();
    
    
    }}
