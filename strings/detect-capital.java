import java.util.*;
//if everything is captialized
//if only the first case is capitalized
//if none of the words are capitalized
class Solution {
    public boolean detectCapitalUse(String word) {
        int length = word.length();
        int capitalCount = 0;
        boolean firstLetterCapital = false;
        
        for(int i=0; i<word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                if(i==0)
                {
                    firstLetterCapital = true;
                }
                
                capitalCount++;
            }
        }
        
        boolean allLettersCapital = (capitalCount == length);
        boolean allLettersNonCapital = (capitalCount == 0);
        boolean onlyFirstLetterCapital = (capitalCount == 1 && firstLetterCapital);
        
        return allLettersCapital || allLettersNonCapital || onlyFirstLetterCapital;
    }

}