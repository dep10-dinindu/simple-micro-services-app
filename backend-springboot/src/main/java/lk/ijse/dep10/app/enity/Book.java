package lk.ijse.dep10.app.enity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Book implements SuperEntity {
    private String isbn;
    private String title;
}
