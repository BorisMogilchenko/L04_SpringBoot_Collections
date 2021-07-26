package ru.quazar.l04springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import ru.quazar.l04springboot.model.CustomList;
import ru.quazar.l04springboot.repository.CustomListRepository;
import ru.quazar.l04springboot.service.CheckArgsService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
@ComponentScan("ru.quazar.l04springboot")
@EnableJpaRepositories("ru.quazar.l04springboot.repository")
@EntityScan("ru.quazar.l04springboot.model")
public class CollectionRunner implements CommandLineRunner {

    @Value("${minRange}")
    private int minRange;
    @Value("${maxRange}")
    private int maxRange;

    private static final Logger logger = LoggerFactory.getLogger(ListBootApplication.class);

    @Autowired
    private CustomListRepository repository;

    public CollectionRunner(CustomListRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws IOException {

        List<String> params = Arrays.stream(args)
                .collect( Collectors.toList());

        if (wouldVerifyArguments(params)) {

//            CommandLineRunner initDatabase(CustomListRepository repository) {

                System.out.println( "Maximum Range value: " + maxRange );
                System.out.println( "Minimum Range value: " + minRange );

//                return args -> {
                    final int cycleCounter = CheckArgsService.checkIteration( args );
                    CustomList< Integer > list = new CustomList<>();
                    for (int i = minRange; i < cycleCounter; i++) {
                        Random rnd = new Random();
                        int rndNumber = minRange + rnd.nextInt( maxRange - minRange + 1 );
                        list.addList( rndNumber );
                    }
                    repository.save( list );
//                };
//            };
        } else {
            logger.warn( "Invalid arguments " + params.toString() );
        }
    }

    private static boolean wouldVerifyArguments(List<String> args) {
        boolean success = false;

        if (args.size() > 0) {
            success = true;
        } else {
            throw new RuntimeException("No arguments!!!");
        }

        return success;
    }
}
