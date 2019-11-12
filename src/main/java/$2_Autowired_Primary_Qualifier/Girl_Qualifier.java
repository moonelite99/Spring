package $2_Autowired_Primary_Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl_Qualifier {

    Outfit outfit;

    // Đánh dấu để Spring inject một đối tượng Outfit vào đây
    public Girl_Qualifier(@Qualifier("bikini") Outfit outfit) {
        // Spring sẽ inject outfit thông qua Constructor đầu tiên
        // Ngoài ra, nó sẽ tìm Bean có @Qualifier("naked") trong context để ịnject
        this.outfit = outfit;
    }

    // GET
    // SET
}