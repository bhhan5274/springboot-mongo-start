package com.bhhan.mongo;

import com.bhhan.mongo.domain.User;
import com.bhhan.mongo.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class MongoApplication {
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            IntStream.rangeClosed(1, 100)
                    .forEach(i -> {
                        final User user = User.builder()
                                .name("name" + i)
                                .address("address" + i)
                                .build();
                        userRepository.save(user);
                    });
        };
    }
}
