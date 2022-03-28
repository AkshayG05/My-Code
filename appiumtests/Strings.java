package appiumtests;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Akshay code";
		System.out.println(name);
        int len = name.length(); //this will show length of the string 
        System.out.println(len);
        
        String lstring = name.toLowerCase(); // this will show lower case
        System.out.println(lstring);
	
        String Ustring = name.toUpperCase(); //this will show upper case
        System.out.println(Ustring);
        
        String nonTrimmedString = "    Akshay             ";
        System.out.println(nonTrimmedString); // this will not trim the space of the string
        String trimmedString=nonTrimmedString.trim(); // will trim the space of the string
        System.out.println(trimmedString);
	  
         System.out.println(name.substring(4)); // will print from index 4 to end of the string 
         
         System.out.println(name.substring(1)); // skipped from index no 1
      System.out.println(name.substring(3,6)); // skiped index no from 3 and index no6
         
         System.out.println(name.replace('s', 'a')); // we can replace the characters from the given string
        System.out.println(name.replace("c", "dec")); // we can replcae the charcters and words
        
        System.out.println(name.startsWith("Aks")); // we can find the first letter matched and o/p is true
        System.out.println(name.endsWith("de")); // we can find the last letter matched and o/p is true
        System.out.println(name.charAt(2));
        
        String modifiedName = "Akshayyy";
        System.out.println(modifiedName.indexOf("ayy"));
        System.out.println(modifiedName.indexOf("shayy",3));
        System.out.println(modifiedName.lastIndexOf("kshyy", 6));
	}
	
	

}
