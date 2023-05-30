package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.dao.DetailDAO;
import ru.kpfu.entities.Detail;

import java.util.List;

@Service
@Transactional
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDAO detailDAO;
    @Override
    public void addDetail(String bio, String location, String website) {
        detailDAO.addDetail(new Detail(bio, location, website));
    }

    @Override
    public void updateDetail(int id, String bio, String location, String website) {
        Detail detail = detailDAO.getDetailById(id);
        if (detail != null) {
            detail.setBio(bio);
            detail.setLocation(location);
            detail.setWebsite(website);
            detailDAO.updateDetail(detail);
        }
    }

    @Override
    public void deleteDetail(int id) {
        detailDAO.deleteDetail(id);
    }

    @Override
    public List<Detail> getAllDetails() {
        return detailDAO.getAllDetails();
    }

    @Override
    public Detail getDetailById(int id) {
        return detailDAO.getDetailById(id);
    }
}
