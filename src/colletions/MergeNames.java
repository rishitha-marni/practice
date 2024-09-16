package colletions;

import java.util.HashSet;

public class MergeNames {
	    
	    public static String[] uniqueNames(String[] names1, String[] names2) {
	        HashSet<String> namesSet= new HashSet<>();
	        for(String name:names1){
	            namesSet.add(name);
	        }
	        HashSet<String> commonSet= new HashSet<>();
	        for(String i:names2){
	            if(namesSet.contains(i)){
	                commonSet.add(i);
	            }
	        }
	        return commonSet.toArray(new String[0]);
	    }
	    
	    public static void main(String[] args) {
	        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
	        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	    }

}
