package $12_JPAmethod_query;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PLAYER")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 2910L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Mapping thông tin biến với tên cột trong Database
    @Column(name = "hp")
    private int hp;
    @Column(name = "stamina")
    private int stamina;

    // Nếu không đánh dấu @Column thì sẽ mapping tự động theo tên biến
    private int atk;
    private int def;
    private int agi;
}