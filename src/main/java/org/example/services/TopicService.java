package org.example.services;

import org.example.entities.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
            new Topic("java", "Java", "Java description"),
            new Topic("python", "Python", "Python description"))
    );

    public List<Topic> getTopics(){
        return topics;
    }

    public String getTopic(String id){
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(Object::toString)
                .orElse("Not Found");
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++){
            if (topics.get(i).getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.remove(id);
    }
}
