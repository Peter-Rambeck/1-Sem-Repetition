/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringToArrayList {

    public StringToArrayList(){
        System.out.println("\n### ArrayList opgave ###");
    }

    public void runArrayList(){
        ArrayList<String> arrayList = new ArrayList();
        System.out.println(addToArrayList(arrayList,"abc"));
        System.out.println(addToArrayList(arrayList,"abcd"));
        System.out.println(addToArrayList(arrayList,"abc"));
        System.out.println(addToArrayList(arrayList,null));
    }

    public boolean addToArrayList(ArrayList<String> arraylist, String str){
        if(arraylist.contains(str) || str == null){
            return false;
        } else {
            arraylist.add(str);
            Collections.sort(arraylist);
            return true;
        }
    }


}
