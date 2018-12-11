package org.st.framework.entity.system;

@javax.persistence.Entity
@javax.persistence.Table(name = "s_user_role")
@javax.persistence.IdClass(SUserRolePK.class)
public class SUserRole {
    private String userId;
    private String roleId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "user_id", nullable = false, length = 64)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @javax.persistence.Id
    @javax.persistence.Column(name = "role_id", nullable = false, length = 64)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SUserRole sUserRole = (SUserRole) o;

        if (userId != null ? !userId.equals(sUserRole.userId) : sUserRole.userId != null) return false;
        if (roleId != null ? !roleId.equals(sUserRole.roleId) : sUserRole.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        return result;
    }
}
