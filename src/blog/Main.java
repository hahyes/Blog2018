
package blog;


public class Main {
    
    public static void main()
    {
        Blog blog = new Blog("Blog programistyczny");
        
        Wpisy note = new Wpisy("Co novego w Java 9","Co novego w Java 9");
        Wpisy note1 = new Wpisy("Kolekcje","Kolekcje");
        Wpisy note2 = new Wpisy("Listy","Listy");
        
        blog.add(note2);
        blog.add(note1);
        blog.add(note);
        
        Comment c1 = new Comment("jan","Kolekcje sa trudne");
        
    }
    
}
