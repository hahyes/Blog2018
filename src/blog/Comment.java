
package blog;

import java.time.LocalDate;
import java.util.*;

public class Comment {
    private String author, content;
    private LocalDate data;
    
    public Comment(String author, String content)
    {
        this.author = author;
        this.content = content;
        this.data = LocalDate.now();
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getContent() {
        return content;
    }
    
    public LocalDate getData(){
        return data;
    }
    
    public String toString()
    {
        return author+": "+content+" ("+data+")";
    }
}
