package com.example.sneaker.repository;

import com.example.sneaker.domain.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alexey Podlubnyy on 17.07.2021
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
}
