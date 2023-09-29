package Filesassignments;

import java.io.FileInputStream;

public class Vowels {

	public static void main(String[] args) {
     int countvowels=0;
     FileInputStream obj =new FileInputStream("mydec2022");
     int i;
     do {
    	 i=obj.read();
    	 if(i=='a'|| i=='e'|| i=='i'|| i== 'o'|| i=='u'||i== 'A'|| i=='E'|| i=='I'||i=='O'|| i =='U') { 
    		 countvowels++;
     }while(i!=-1) {
    	 obj.close();
    	 
	}}}
	
	

