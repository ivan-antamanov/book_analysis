package controllers;

import com.analyzer.db.models.impl.Author;
import com.analyzer.db.models.impl.Book;
import com.analyzer.db.services.AuthorService;
import com.analyzer.db.services.BookService;
import com.analyzer.db.services.WordService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import utils.BookLoader;

import java.io.IOException;


@RequestMapping
public class LoadBookController {

    private final static Logger logger = LogManager.getLogger(LoadBookController.class);

    private final AuthorService authorService;
    private final BookService bookService;
    private final WordService wordService;

    @Autowired
    public LoadBookController(AuthorService authorService, BookService bookService, WordService wordService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.wordService = wordService;
    }

    @Transactional
    @RequestMapping(value = "/loadbook", method = RequestMethod.PUT)
    public ResponseEntity<String> loadNewBook(@RequestParam("author") String authorName, @RequestParam("book") String bookName, @RequestParam("bookPath") String bookPath) {
        Book book = new Book();
        book.setName(bookName);
        book.setPath(bookPath);

        Author author = new Author();
        author.setName(authorName);

        authorService.add(author);

        try {
            BookLoader.readFile(bookPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //todo realisation of saving words


        return ResponseEntity.status(HttpStatus.OK).body("Load book completed");
    }
}
