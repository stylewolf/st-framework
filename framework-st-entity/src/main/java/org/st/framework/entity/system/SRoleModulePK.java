package org.st.framework.entity.system;

import java.io.Serializable;

public class SRoleModulePK implements Serializable {
    private String roleId;
    private String moduleId;

    @javax.persistence.Column(name = "role_id", nullable = false, length = 64)
    @javax.persistence.Id
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @javax.persistence.Column(name = "module_id", nullable = false, length = 64)
    @javax.persistence.Id
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SRoleModulePK that = (SRoleModulePK) o;

        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (moduleId != null ? !moduleId.equals(that.moduleId) : that.moduleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (moduleId != null ? moduleId.hashCode() : 0);
        return result;
    }
}
