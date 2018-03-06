
package blog;

import java.util.*;

public class Blog {
    private List<Wpisy> notes = new ArrayList();
    private String title;
    
    public Blog(String title){
        this.title=title;
    }
    
    public void add(Wpisy wpis)
   {
       notes.add(wpis);
   }
    
    public Wpisy mostPopular() {
        
        /*int max = 0;
        Wpisy result = null;
        for(Wpisy note : notes)
        {
            int count = note.numberOfComments();
            if(count>max)
            {
                result = note;
            }
        }
        
        return result;
        */
        
        if(notes.isEmpty()) return null;
        Wpisy result = notes.get(0);
        for(Wpisy note : notes)
        {
            int count = note.numberOfComments();
            if(count>result.numberOfComments())
            {
                result = note;
            }
        }
        
        return result;
}
    
    public List<Wpisy> mostPopulars() {
        return null;
    }
    
    public Comment lastComment() {
        return null;
    }
    
    public List<Comment> lastComments() {
        return null;
    }
}
