import java.util.*;

public class MagazineMapNoteMap {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public MagazineMapNoteMap(String magazine, String note) {
    		String[] temp = magazine.split(" ");
    		String[] temp2 = note.split(" ");
    		magazineMap = new HashMap<String, Integer>();
    		noteMap = new HashMap<String,Integer>();
    		for(int i=0;i<temp.length;i++)
    		{
    			if(!magazineMap.containsKey(temp[i]))
    			magazineMap.put(temp[i], 0);
    			else{
    				Integer k=magazineMap.get(temp[i]);
    				magazineMap.replace(temp[i], k, k+1);
    			}
    		}
    		for(int i=0;i<temp2.length;i++)
    		{
    			if(!noteMap.containsKey(temp2[i]))
    			noteMap.put(temp2[i], 0);
    			else
    			{
    				Integer k = noteMap.get(temp2[i]);
    				noteMap.replace(temp2[i], k, k+1);
    			}
    		}
    		
        
    }
    
    public boolean solve() {
    	Boolean flag=true;
    	for (String key : noteMap.keySet()) {
    		if(!magazineMap.containsKey(key))
    		return false;
    		else
    		{
    			if(magazineMap.get(key) < noteMap.get(key) )
    			{
    				return false;
    			}
    		}
		}
    	
    		
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        MagazineMapNoteMap s = new MagazineMapNoteMap(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
