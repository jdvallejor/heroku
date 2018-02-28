package com.psl.integrador.config;

import com.psl.integrador.model.Collaborator;
import com.psl.integrador.model.Topic;
import com.psl.integrador.model.enums.Expertise;
import com.psl.integrador.repository.CollaboratorRepository;
import com.psl.integrador.repository.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories(basePackageClasses = {TopicRepository.class, CollaboratorRepository.class})
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(TopicRepository topicRepository, CollaboratorRepository collaboratorRepository) {
        return strings -> {

            List<Topic> listTopics = new ArrayList<>();
            Topic t1 = new Topic("Java", "Java test");
            Topic t2 = new Topic("C#", "C# Test");
            Topic t3 = new Topic("Python", "Python Test");
            Topic t4 = new Topic("Ruby", "Ruby Test");
            Topic t5 = new Topic("Scala", "Scala Test");

            listTopics.add(t1);
            listTopics.add(t2);
            listTopics.add(t3);
            listTopics.add(t4);
            listTopics.add(t5);

            topicRepository.save(listTopics);

            Collaborator c1 = new Collaborator();
            c1.setName("Jose");
            c1.addTopicToTeach(t1, Expertise.beginner);
            c1.addTopicToLearn(t2, Expertise.expert);

            Collaborator c2 = new Collaborator();
            c2.setName("Juan");
            c1.addTopicToTeach(t3, Expertise.intermediate);
            c1.addTopicToLearn(t4, Expertise.expert);

            collaboratorRepository.save(c1);
            collaboratorRepository.save(c2);
        };
    }

}
