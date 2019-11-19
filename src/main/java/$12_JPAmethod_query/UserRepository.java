package $12_JPAmethod_query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByAtk(int atk);
    List<User> findAllByHp(int hp);
    List<User> findAllByAgiBetween(int start, int end);
    List<User> findAllByDefGreaterThanEqual(int defThreshold);
    @Query("SELECT u FROM User u WHERE u.hp = :hp")
    User findUserByHpQuery(@Param("hp") Integer hp);
}