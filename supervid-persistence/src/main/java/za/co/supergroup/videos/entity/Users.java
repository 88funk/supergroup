package za.co.supergroup.videos.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
@NamedQuery(name = "Users.findUser",
        query = "Select users FROM Users users WHERE users.name=:userName AND users.userPassword=:userPassword"
)
public class Users {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="username")
    private String name;

    @Column(name="user_password")
    private String userPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }



}
