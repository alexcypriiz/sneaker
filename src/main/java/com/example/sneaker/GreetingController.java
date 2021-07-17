package com.example.sneaker;

import com.example.sneaker.domain.Message;
import com.example.sneaker.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Alexey Podlubnyy on 13.07.2021
 */

@Controller
public class GreetingController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepository.findAll();
        model.put("massages", "messages");
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String text,@RequestParam String tag,
                      Map<String, Object> model) {
        Message message = new Message(text, tag);

        messageRepository.save(message);

        Iterable<Message> messages = messageRepository.findAll();
                model.put("messages", messages);
        return "main";
    }
}
