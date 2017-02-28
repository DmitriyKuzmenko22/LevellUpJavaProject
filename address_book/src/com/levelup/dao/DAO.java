package com.levelup.dao;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 26.02.2017.
 */
public interface DAO<T> {
    void create(T t);

    ArrayList<T>read();

    void update (T t);
    void delete (T t);
}
