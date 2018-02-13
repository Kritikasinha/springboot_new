package newstart.springboot; /**
 * Created by krsi1016 on 2/9/2018.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lib_pojo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id ;
    private String book_name;
    private String author_name;

    public Lib_pojo() {
    }

    public Lib_pojo(String book_name, String author_name) {
        this.book_name = book_name;
        this.author_name = author_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}
