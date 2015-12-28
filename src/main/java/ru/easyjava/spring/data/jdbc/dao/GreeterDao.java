package ru.easyjava.spring.data.jdbc.dao;

import java.util.List;
import java.util.Map;

/**
 * Database layer.
 */
public interface GreeterDao {
    /**
     * Returns all greetings.
     * @return List with all greetings in the database.
     */
    List<Map<String, Object>> getGreetings();
}
