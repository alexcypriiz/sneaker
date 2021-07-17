package com.example.sneaker.repository;

import com.example.sneaker.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Alexey Podlubnyy on 17.07.2021
 */
public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
