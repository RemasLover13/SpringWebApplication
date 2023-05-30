package ru.kpfu.services;

import ru.kpfu.entities.Detail;

import java.util.List;

public interface DetailService {
    public void addDetail(String bio, String location, String website);
    public void updateDetail(int id, String bio, String location, String website);
    public void deleteDetail(int id);
    public List<Detail> getAllDetails();

    public Detail getDetailById(int id);
}
