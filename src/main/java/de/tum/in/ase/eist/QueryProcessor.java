package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {
//change 1
    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "AnkaraMessi";

        }
        // TODO extend the programm here
        else if(query.contains("plus")){
            return "";
        }
        else if(query.contains("largest")){
            String [] arrayS = query.split(",");
            int [] arrayInt = new int[arrayS.length];

            for(int i = 0; i < arrayInt.length; i++){
                arrayInt[i] = Integer.parseInt(arrayS[i]);
            }

            int largest = Integer.MIN_VALUE;
            for(int i = 0; i < arrayInt.length; i++){
                if (arrayInt[i] > largest) {
                    largest = arrayInt[i];
                }
            }
            return Integer.toString(largest);
        }
        else { // TODO extend the programm here

            return "";
        }

    }
}
