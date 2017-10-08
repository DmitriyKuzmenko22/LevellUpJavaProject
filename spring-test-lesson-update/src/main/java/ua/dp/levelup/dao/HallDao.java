package ua.dp.levelup.dao;

import ua.dp.levelup.core.model.Hall;

import java.util.List;

/**
 * Created by Дмитрий on 12.07.2017.
 */
public interface HallDao {
    void createHall(Hall hall);
    void updateHall(Hall hall);
    void deleteHall(Hall hall);
    void getHallById(Long id);

    List<Hall> getAllHalls();
}
