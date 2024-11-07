package org.keycloak.rex.storage.user;

import jakarta.persistence.*;

@NamedQueries({
        @NamedQuery(name = "getUserByUsername", query = "select u from RexUserEntity u where u.username = :username"),
        @NamedQuery(name = "getUserByEmail", query = "select u from RexUserEntity u where u.email = :email"),
        @NamedQuery(name = "getUserCount", query = "select count(u) from RexUserEntity u"),
        @NamedQuery(name = "getAllUsers", query = "select u from RexUserEntity u"),
        @NamedQuery(name = "searchForUser", query = "select u from RexUserEntity u where " +
                "( lower(u.username) like :search or u.email like :search ) order by u.username"),
})
@Entity
@Table(name = "users")
public class RexUserEntity {
    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "email_address")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "phone_number")
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
