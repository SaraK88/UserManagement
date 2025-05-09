package se.sara.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.sara.usermanagement.models.Player;
import se.sara.usermanagement.models.PlayerRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    public PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {
        if(playerRepository.count() == 0) {
            Player player = new Player();
            player.setAge(21);
            player.setName("Player1");
            playerRepository.save(player);

            player = new Player();
            player.setAge(28);
            player.setName("Player2");
            playerRepository.save(player);
        }
        // kolla om count(*) = 0
        // insert into hockeyplayer
    }
}
