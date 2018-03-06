
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
}
