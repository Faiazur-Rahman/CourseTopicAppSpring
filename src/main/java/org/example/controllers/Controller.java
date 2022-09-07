package org.example.controllers;

import java.io.IOException;
import java.util.*;

import org.example.services.TopicService;
import org.example.entities.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/")
    public String sayHi(){
        return "Hi";
    }

    @RequestMapping("/topics")
    public List<Topic> allTopics(){
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public String getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable String id,@RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
