import java.util.Vector; 
public class Shell { 
 static int N; 
 static int distance; 
 static int j; 
 static int i; 
 static Vector<Integer> vectorShell; 
 public static Vector<Integer> shellSort(Vector<Integer> vectorShell) { 
 N = Data.getUkuranVector(); 
 distance = N / 2; 
 while (distance > 0) { 
 for (i = 0; i < N - distance; i++) { 
 j = i + distance; 
 if (vectorShell.get(i) > vectorShell.get(j)) { 
 int temp = vectorShell.get(i); 
 vectorShell.set(i, vectorShell.get(j)); 
 vectorShell.set(j, temp); 
 } 
 } 
 distance = distance / 2; 
 } 
 return vectorShell; 
 } 
}