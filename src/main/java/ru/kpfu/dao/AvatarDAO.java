package ru.kpfu.dao;

import ru.kpfu.entities.Avatar;

public interface AvatarDAO {
    public void addAvatar(Avatar avatar);
    public void deleteAvatar(int id);
}
