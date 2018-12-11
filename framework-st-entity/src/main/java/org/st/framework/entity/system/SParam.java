package org.st.framework.entity.system;

import java.math.BigInteger;

@javax.persistence.Entity
@javax.persistence.Table(name = "s_param")
public class SParam {
    private String id;
    private String owner;
    private String clazz;
    private String dataType;
    private String labels;
    private String code;
    private String code1;
    private String code2;
    private String code3;
    private String layer;
    private BigInteger status;
    private BigInteger readonly;
    private String remark;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner", nullable = true, length = 64)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "clazz", nullable = true, length = 64)
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "data_type", nullable = true, length = 64)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "labels", nullable = true, length = 64)
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code", nullable = true, length = 256)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code1", nullable = true, length = 256)
    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code2", nullable = true, length = 256)
    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code3", nullable = true, length = 256)
    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "layer", nullable = true, length = 128)
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
    @javax.persistence.Column(name = "readonly", nullable = true, precision = 0)
    public BigInteger getReadonly() {
        return readonly;
    }

    public void setReadonly(BigInteger readonly) {
        this.readonly = readonly;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "remark", nullable = true, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SParam sParam = (SParam) o;

        if (id != null ? !id.equals(sParam.id) : sParam.id != null) return false;
        if (owner != null ? !owner.equals(sParam.owner) : sParam.owner != null) return false;
        if (clazz != null ? !clazz.equals(sParam.clazz) : sParam.clazz != null) return false;
        if (dataType != null ? !dataType.equals(sParam.dataType) : sParam.dataType != null) return false;
        if (labels != null ? !labels.equals(sParam.labels) : sParam.labels != null) return false;
        if (code != null ? !code.equals(sParam.code) : sParam.code != null) return false;
        if (code1 != null ? !code1.equals(sParam.code1) : sParam.code1 != null) return false;
        if (code2 != null ? !code2.equals(sParam.code2) : sParam.code2 != null) return false;
        if (code3 != null ? !code3.equals(sParam.code3) : sParam.code3 != null) return false;
        if (layer != null ? !layer.equals(sParam.layer) : sParam.layer != null) return false;
        if (status != null ? !status.equals(sParam.status) : sParam.status != null) return false;
        if (readonly != null ? !readonly.equals(sParam.readonly) : sParam.readonly != null) return false;
        if (remark != null ? !remark.equals(sParam.remark) : sParam.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (labels != null ? labels.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (code1 != null ? code1.hashCode() : 0);
        result = 31 * result + (code2 != null ? code2.hashCode() : 0);
        result = 31 * result + (code3 != null ? code3.hashCode() : 0);
        result = 31 * result + (layer != null ? layer.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (readonly != null ? readonly.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
