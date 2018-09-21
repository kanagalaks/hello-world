
public class Selenium_workout {
	
	public static void main(String args[]){
		
	
		
System.out.println("String methods in java");
        String s1 ="Test";
        String s2 ="TEST";
        char ch[] = {'J','A','V','A'};
        System.out.println("*************START**************");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0,3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.startsWith("Te"));
        System.out.println(s1.endsWith("e"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        System.out.println(s1.intern());
        String s=s1.replace("Test","Testing");
        System.out.println(s);
        System.out.println(s1);
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.reverse());
         System.out.println(sb.append("Automation"));
        System.out.println(sb.insert(1,"selenium"));   
        System.out.println("***********END*************");
        System.out.println("Automation"));
	}
}
		
   
