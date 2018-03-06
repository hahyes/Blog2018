
package blog;

public class main {
    
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
        note2.add(c1);
        Comment c2 = new Comment("ewa","nie nie nie");
        note2.add(c2);
        System.out.println(blog);
        System.out.println("-------------");
        System.out.println(blog.mostPopular());
        
    }
    
}
