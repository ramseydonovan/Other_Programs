package hashmap;

//Donovan Ramsey 
//This program uses a hashmap and a priority queue to find the top 60 most occurring words in a text file, 
//it outputs the top 60 words in decending order, the amount of occurances that word has and it's precentage 
//out of the total words.   

//changes made from original program: main now reads in a whole folder of files into a method findSum. 
//                                 I added a variable letterCountOf_word which adds the lengths of the 60 most common words  
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
class word_freq {
static HashMap<String, Integer> map = new HashMap(); 
//static List<MostWords> findTop60 = new ArrayList(); 
public static void main(String[] args) throws IOException {
	findSum("/MobyDick.txt"); 
 
}
//________________________________________________________________ added code 
public static void findSum(String fileName) throws IOException {  

	double totalCount = 0; 

 String line = null;
 try {
   FileReader fileReader = 
     new FileReader(fileName);
   BufferedReader bufferedReader = 
     new BufferedReader(fileReader);

   while((line = bufferedReader.readLine()) != null) {
     //change here 
     line = line.toLowerCase();
     String[] word = line.split("[ \"\n\t\r.,;:!?(){}]");  
     for (int i = 0; i < word.length; i++){   
       String key = word[i];
       if (key.length() > 0){
         if(map.get(key) == null){
        	 map.put(key, 1);   
        	 totalCount++; 
       } 
       else {
         int value = map.get(key);//.intValue(); // get the word's int value 
         value++;               // add it by one 
         map.put(key, value);
       }
       }
     }  
   }
  
   bufferedReader.close();            
 }
 catch(FileNotFoundException ex) {
   System.out.println(
                     "Unable to open file '" + 
                     fileName + "'");                
 }
 catch(IOException ex) {
   System.out.println(
                     "Error reading file '" 
                       + fileName + "'");                   
 }
 Comparator<StateNum> comaprator = new NameComparator<StateNum>();
 PriorityQueue<StateNum> pq = new PriorityQueue<StateNum>(comaprator); 

 for (String name: map.keySet()){   //add to priority queue 
     StateNum st = new StateNum(name, map.get(name)); 
     pq.add(st);   }
 StateNum x; 
 int count = 0; 
 while ((x = pq.poll()) != null && count < 60 ){
	   System.out.println(x.getKey() + "\t" + x.getValue() + "\t" + Math.round(((((double) x.getValue() / totalCount))*100.0))/100.0 + "%");
	   count++; 
 }

}
}
