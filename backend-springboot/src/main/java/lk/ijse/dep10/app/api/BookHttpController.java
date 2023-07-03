package lk.ijse.dep10.app.api;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/books")
public class BookHttpController {
    @GetMapping
    public String getAllBooks() {
        return "<h1>Get All Books</h1>";
    }

    @PostMapping(consumes = "application/json")
    public String saveBook() {
        return "<h1>Save Book</h1>";
    }


}
