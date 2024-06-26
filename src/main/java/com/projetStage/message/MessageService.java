package com.projetStage.message;

import java.util.List;

public interface MessageService {
public void save(Message message);
public Message findById(Integer id);
public List<Message> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
