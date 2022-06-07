package kamiz.kami.repository;

import kamiz.kami.model.AuthenticationToken;
import kamiz.kami.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);

    AuthenticationToken findByToken(String token);

}
