package $2_Autowired_Primary_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    // Đánh dấu để Spring inject một đối tượng Outfit vào đây
    @Autowired    Outfit outfit;

    // Spring sẽ inject outfit thông qua Constructor trước
   public Girl() {}



    // Nếu không tìm thấy Constructor thoả mãn, nó sẽ thông qua setter
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    // GET
    // SET
}