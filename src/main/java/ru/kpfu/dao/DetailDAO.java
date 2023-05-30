package ru.kpfu.dao;

import ru.kpfu.entities.Detail;

import java.util.List;

public interface DetailDAO {
    public void addDetail(Detail detail);
    public void updateDetail(Detail detail);

    public void deleteDetail(int id);

    public List<Detail> getAllDetails();

    public Detail getDetailById(int id);
}
