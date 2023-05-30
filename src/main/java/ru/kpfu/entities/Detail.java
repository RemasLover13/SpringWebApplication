package ru.kpfu.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "bio")
    private String bio;
    @Column(name = "location")
    private String location;
    @Column(name = "website")
    private String website;

    @OneToMany(mappedBy = "detail")
    private List<Avatar> avatars;

    public Detail() {}

    public Detail(String bio, String location, String website) {
        this.bio = bio;
        this.location = location;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Avatar> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<Avatar> avatars) {
        this.avatars = avatars;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", bio='" + bio + '\'' +
                ", location='" + location + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
