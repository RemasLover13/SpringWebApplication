package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.dao.AvatarDAO;
import ru.kpfu.entities.Avatar;
import ru.kpfu.entities.Detail;
import ru.kpfu.entities.User;

@Service
@Transactional
public class AvatarServiceImpl implements AvatarService {
    @Autowired
    private AvatarDAO avatarDAO;

    @Override
    public void addAvatar(String url, User user, Detail detail) {
        Avatar avatar = new Avatar();
        avatar.setUrl(url);
        avatar.setUser(user);
        avatar.setDetail(detail);
        avatarDAO.addAvatar(avatar);
    }

    @Override
    public void deleteAvatar(int id) {
        avatarDAO.deleteAvatar(id);
    }
}
