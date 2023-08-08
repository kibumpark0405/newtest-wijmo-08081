package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesItem {

    private String productId;

    private Long quantity;

    private Double price;
}
