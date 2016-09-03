package hashmap;

import java.util.Comparator;
// class that contains all 3 short comparator methods 
class NameComparator<S extends StateNum> implements Comparator<S> { // start comparator

public int compare(S c1, S c2) { // assign it variables to compare
//int city1 = c1.getValue();
//int city2 = c2.getValue();
return c1.compareTo(c2);
/*if (city1.compareTo(city2) > 0){
return c1.getKey(); // return 1 if city1 > city 2, return -1 if opposite, and return 0 if neither
}
else if (city1.compareTo(city2) < 0){
return c2.getKey(); // return 1 if city1 > city 2, return -1 if opposite, and return 0 if neither
}
else 
return c1.getKey()  {
	
}
*/
}
}
/*class PopComparator<S extends Records> implements Comparator<S> { // repeat same few steps but for population
public int compare(S p1, S p2) {
return (int)(p2.getPop()-p1.getPop()); // shorter code, same objective
}
}
class AreaComparator<S extends Records> implements Comparator<S> { // repeat for area
public int compare(S a1, S a2) {
return (int)(Math.signum(a2.getArea()-a1.getArea())); // oracle.com answered the reason why int is used for a double (signum: returns 0.0, 1.0, or -1.0)
}
}*/