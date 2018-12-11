package org.st.framework.entity.system;

import java.math.BigInteger;
import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "s_role")
public class SRole {
    private String id;
    private String name;
    private String layer;
    private BigInteger status;
    private String createrId;
    private Timestamp createrTime;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = true, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "layer", nullable = true, length = 64)
    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "status", nullable = true, precision = 0)
    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "creater_id", nullable = true, length = 64)
    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "creater_time", nullable = true)
    public Timestamp getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Timestamp createrTime) {
        this.createrTime = createrTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SRole sRole = (SRole) o;

        if (id != null ? !id.equals(sRole.id) : sRole.id != null) return false;
        if (name != null ? !name.equals(sRole.name) : sRole.name != null) return false;
        if (layer != null ? !layer.equals(sRole.layer) : sRole.layer != null) return false;
        if (status != null ? !status.equals(sRole.status) : sRole.status != null) return false;
        if (createrId != null ? !createrId.equals(sRole.createrId) : sRole.createrId != null) return false;
        if (createrTime != null ? !createrTime.equals(sRole.createrTime) : sRole.createrTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (layer != null ? layer.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createrId != null ? createrId.hashCode() : 0);
        result = 31 * result + (createrTime != null ? createrTime.hashCode() : 0);
        return result;
    }
}
