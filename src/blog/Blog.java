
package blog;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
        
        List<Comment> allComments = new ArrayList();
        for(Wpisy note : notes)
        {
            allComments.addAll(note.getComments());
        }
        Comment result = allComments.get(0);
        for (Comment comment : allComments)
        {
            LocalDate d1 = comment.getDate();
            LocalDate d2 = result.getDate();
            if(d1.isAfter(d2))
            {
                result = comment;
            }
        }
        
        /*
        LocalDate now = LocalDate.now();
        Comment result = null;
        long min = Long.MAX_VALUE;
        for(Wpisy note: notes)
        {
            for(Comment comment : note.getComments())
            {
                LocalDate date = comment.getData();
                long x = now.until(date, ChronoUnit.MINUTES);
                if(x<min)
                {
                    min = x;
                    result = comment;
                }
            }
        }
        
        return result;

*/
    }
    
    public List<Comment> lastComments() {
        return null;
    }
}
