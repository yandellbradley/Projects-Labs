/*
 * list of movies
 */
package movielist;

/**
 *
 * @author Bradley
 */
public class MovieClass {

    private String title;
    private String category;

    public MovieClass(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
