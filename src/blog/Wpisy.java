
package blog;

import java.util.ArrayList;
import java.util.List;


public class Wpisy {
    
    private String title, content;
    private List<Comment> comments = new ArrayList();
    
    public Wpisy(String title, String content){
        this.title=title;
        this.content=content;
    }
    
    public void add(Comment comment)
    {
        comments.add(comment);
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("WPIS");
        sb.append("tytul: "+title);
        sb.append("tresc: "+content);
        sb.append("komentarze: "+comments);
        return sb.toString();
    }
    
}
