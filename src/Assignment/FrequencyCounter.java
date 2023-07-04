package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
	 public static void main(String args[]) throws IOException

     {
		               String path = "C:\\Users\\shibodasmallick\\eclipse-workspace\\new_java\\file1";

		               FileReader file = new FileReader(path);

		              

		               BufferedReader bufferedReader = new BufferedReader(file);

		              

		               ArrayList<String> arr = new ArrayList<String>();

		               Map<String, Integer> a = new HashMap<String, Integer>();

		               String line;

		               while ((line = bufferedReader.readLine()) != null) {

		                      String words[] = line.split(" ");

		                      for(int i=0;i<words.length;i++)

		                      {

		                                 arr.add(words[i]);

		                      }

		               }

		               for (String w : arr) {

		            int count = Collections.frequency(arr, w);

		            a.put(w, count);

		        }

		               for (String key : a.keySet()) {

		            System.out.println(key + " = " + a.get(key));

		        }

		              

		               bufferedReader.close();

		           }
}



