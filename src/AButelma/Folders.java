package AButelma;

import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	ArrayList<String> names = new ArrayList<>();
    	String test;
    	
    	for (int i = 0; i < xml.length(); i++) {
              test = "";  
    		
    		  if (xml.charAt(i) == '<') {
            	  // System.out.println("\nEncontró <");
            	  
            	  int j = i + 15;
            	  
            	  if (j <= xml.length()) {
            		 //  System.out.println("Hay 15 caracteres más");
            		  test = xml.substring(i, j); 
            	  }
                  
                  if (test.equals("<folder name=\"" + startingLetter)) {
                	  // System.out.println("Encontró folder name");
                	  
                	  // j++;
                	 // if (xml.charAt(j) == startingLetter) {
                		  
                		  // System.out.println("Encontró u");
                	  	  j--;
                		  int k = j+1;
                		  while (xml.charAt(k) != '"') {
                			  k++;
                		  }
                		  
                		  names.add(xml.substring(j, k));
                	  //}              	  
                  }
              }
        }
    	
    	return names;
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        
        for(String name: names)
            System.out.println(name);
    }
}