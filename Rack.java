package previousTeams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Rack {
    String tiles;
    int blankSpace=0;
    
    private static final String ONE_POINTERS = "EAIONRTLSU";
	private static final String TWO_POINTERS = "DG";
	private static final String THREE_POINTERS = "BCMP";
	private static final String FOUR_POINTERS = "FHVWY";
	private static final String FIVE_POINTERS = "K";
	private static final String EIGHT_POINTERS = "JX";
	private static final String TEN_POINTERS = "QZ";

	public static int getScore(String word) {
		int points = 0;
		int a[]=new int[26];
		char []characters = word.toCharArray();
		for(int i=0;i<word.length();i++)
            a[(word.charAt(i)-'A')]++;
		for (char c : characters) {
			
			if(a[c-'A']==0) ;
			else {
					if (ONE_POINTERS.indexOf(c) != -1) {
						points += 1;
					}
					else if (TWO_POINTERS.indexOf(c) != -1) {
						points += 2;
					}
					else if (THREE_POINTERS.indexOf(c) != -1) {
						points += 3;
					}
					else if (FOUR_POINTERS.indexOf(c) != -1) {
						points += 4;
					}
					else if (FIVE_POINTERS.indexOf(c) != -1) {
						points += 5;
					}
					else if (EIGHT_POINTERS.indexOf(c) != -1) {
						points += 8;
					}
					else {
						points += 10;
					}
			}
		}
		return points;
	}
	
    public Rack (String tiles) {
        this.tiles = tiles;
    }

    List<String> getLegalWordsInAscendingOrderOfLetters(String path) {
        return null;
    }

    void sortTilesInAscendingOrderOfLetters() {

    }

    List<String> getPowerSetOfTiles() {
        return null;
    }

    List<String> getAllLegalWords() {
        return null;
    }

    public int calcBlankSpace(){
    	String str = this.tiles;
    	int bs=0;
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)==' ')
    			bs++;
    	}
    	return bs;
    }
    String getBestLegalWord() {
    	
    	String str = this.tiles;
    	blankSpace = calcBlankSpace();
    	str = str.replaceAll(" ", "");
    	System.out.println(str);
        int a[]=new int[27];
        for(int i=0;i<27;i++)
       	 a[i]=0;
        int max=0;
        String s="";
        for(int i=0;i<str.length();i++)
                a[(str.charAt(i)-'A')]++;
        int b[]=new int[27];
        //HashMap<String,Integer> hm=new HashMap();
        BufferedReader bReader = null;
        String line = "";
        try {
                bReader = new BufferedReader(new FileReader("C:\\Users\\echinnasamy\\Downloads\\sowpods.txt"));
                while((line = bReader.readLine())!=null)
                {
               	 b = Arrays.copyOf(a, a.length);
                        int i,flag=blankSpace;
                        for(i=0;i<line.length();i++)
                        {       
                              
                       	 if (flag<0)
                       		 break;
                       	 if(b[(line.charAt(i)-'A')]<=0)
                                  { 
                                       	 	//break;
                                      	 	flag--;
                                  	}
                                b[(line.charAt(i)-'A')]--;
                        }
                        if(i==line.length())
                        {
                       	 if(getScore(line)>max)
                       	 {
                       		 
                                max= getScore(line);
                                System.out.println(line+" "+max);
                                s=line;	
                       	 }
                        }
                }
        	}
        catch(Exception e){
       	 
        }
        
        return s;
    }
}
