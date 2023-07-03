package lk.ijse.dep10.app.dao.util;

import lk.ijse.dep10.app.enity.Book;
import org.springframework.jdbc.core.RowMapper;

public class Mappers {
    public static final RowMapper<Book> BOOK_ROW_MAPPER = (rs, rowNum) -> {
        return new Book(rs.getString("isbn"), rs.getString("title"));
    };
}
