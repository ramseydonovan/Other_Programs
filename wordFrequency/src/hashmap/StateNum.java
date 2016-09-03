package hashmap;

public class StateNum {
    private String key;
    private int value;
    
public StateNum(String key, int value) {
        this.key = key;
        this.value = value;
    }

public int getValue(){
 return this.value; }

public String getKey(){
 return this.key; }

//@Override
    public int compareTo(StateNum other) {
	     
	   return -(this.value - other.value);
       // return this.value.compareTo(other.value);
    }

 
}

