package StaticFinal;

public class StringExample {

	public static void main(String[] args) {
		String temp="My name is KPMG";
		String Volt="MY NAME IS PRIYA";
		String[] names= {"virat","Rohit","Devadatt Padikkal","NITISH"};
		System.out.println(temp.length());
		System.out.println(temp.substring(4));
       System.out.println(temp.substring(2,9));
       System.out.println(temp.concat("MY NAME PRIYA"));
       System.out.println(temp.compareTo(temp));
       System.out.println(temp.isEmpty());
       System.out.println(temp.endsWith("PRIYA"));
       System.out.println(temp.compareToIgnoreCase(Volt));
       System.out.println(Volt.charAt(5));
       System.out.println(Volt.equalsIgnoreCase(temp));
       System.out.println(Volt.startsWith(temp));
       System.out.println(String.join(",", names));
       
	}

}
