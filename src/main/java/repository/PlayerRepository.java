package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import player.Player;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String > {
    void deleteByName(String playerName);
    Optional<Player> findByName(String name);
}
