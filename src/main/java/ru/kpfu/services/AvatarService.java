package ru.kpfu.services;

import ru.kpfu.entities.Detail;
import ru.kpfu.entities.User;

public interface AvatarService {
    public void addAvatar(String url, User user, Detail detail);
    public void deleteAvatar(int id);
}
