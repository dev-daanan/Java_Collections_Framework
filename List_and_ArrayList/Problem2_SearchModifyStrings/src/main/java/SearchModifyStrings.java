package List_and_ArrayList.Problem2_SearchModifyStrings.src.main.java;

import java.util.ArrayList;

public class SearchModifyStrings {
    public void replaceFirstWholeIfPresent(ArrayList<String> stringArrayList, String target, String replacement) {
        for (int i = 0; i < stringArrayList.size(); i++) {

            if (stringArrayList.get(i).contains(target)) {
                System.out.println("\"" + stringArrayList.get(i) + "\"" + " changed to " + "\"" + replacement + "\"");
                stringArrayList.set(i, replacement);
                return;
            }
        }
        System.out.println("No Match Found!");
    }
}
