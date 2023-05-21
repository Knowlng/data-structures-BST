public class Book implements Comparable<Object> {

    private int id;
    private String title;
	
    public Book() {}
    
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id +":" + title;
    }

    @Override
    public int compareTo(Object p1) {
        Book p = (Book) p1;
        return this.getId() - p.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
