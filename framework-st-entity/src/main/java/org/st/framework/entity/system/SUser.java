package org.st.framework.entity.system;

import java.math.BigInteger;

@javax.persistence.Entity
@javax.persistence.Table(name = "s_user")
public class SUser {
    private String id;
    private String loginId;
    private String password;
    private String userName;
    private BigInteger userStatus;
    private String userType;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "login_id", nullable = true, length = 64)
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "password", nullable = true, length = 128)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_name", nullable = true, length = 32)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_status", nullable = true, precision = 0)
    public BigInteger getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(BigInteger userStatus) {
        this.userStatus = userStatus;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_type", nullable = true, length = 2)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SUser sUser = (SUser) o;

        if (id != null ? !id.equals(sUser.id) : sUser.id != null) return false;
        if (loginId != null ? !loginId.equals(sUser.loginId) : sUser.loginId != null) return false;
        if (password != null ? !password.equals(sUser.password) : sUser.password != null) return false;
        if (userName != null ? !userName.equals(sUser.userName) : sUser.userName != null) return false;
        if (userStatus != null ? !userStatus.equals(sUser.userStatus) : sUser.userStatus != null) return false;
        if (userType != null ? !userType.equals(sUser.userType) : sUser.userType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loginId != null ? loginId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }
}
