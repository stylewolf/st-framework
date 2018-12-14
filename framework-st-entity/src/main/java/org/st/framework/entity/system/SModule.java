package org.st.framework.entity.system;

import java.math.BigInteger;

@javax.persistence.Entity
@javax.persistence.Table(name = "s_module")
public class SModule {
    private String id;
    private String owner;
    private String name;
    private BigInteger leaf;
    private BigInteger type;
    private String platform;
    private BigInteger pos;
    private BigInteger operate;
    private BigInteger shortcut;
    private String url;
    private String rmethod;
    private String layer;
    private BigInteger showType;
    private BigInteger status;
    private String icon;
    private String params;
    private String spell;
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
    @javax.persistence.Column(name = "name", nullable = false, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "leaf", nullable = false, precision = 0)
    public BigInteger getLeaf() {
        return leaf;
    }

    public void setLeaf(BigInteger leaf) {
        this.leaf = leaf;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "type", nullable = false, precision = 0)
    public BigInteger getType() {
        return type;
    }

    public void setType(BigInteger type) {
        this.type = type;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "platform", nullable = false, length = 12)
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pos", nullable = false, precision = 0)
    public BigInteger getPos() {
        return pos;
    }

    public void setPos(BigInteger pos) {
        this.pos = pos;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "operate", nullable = false, precision = 0)
    public BigInteger getOperate() {
        return operate;
    }

    public void setOperate(BigInteger operate) {
        this.operate = operate;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "shortcut", nullable = true, precision = 0)
    public BigInteger getShortcut() {
        return shortcut;
    }

    public void setShortcut(BigInteger shortcut) {
        this.shortcut = shortcut;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "url", nullable = true, length = 512)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "rmethod", nullable = true, length = 20)
    public String getRmethod() {
        return rmethod;
    }

    public void setRmethod(String rmethod) {
        this.rmethod = rmethod;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "layer", nullable = false, length = 64)
    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "show_type", nullable = false, precision = 0)
    public BigInteger getShowType() {
        return showType;
    }

    public void setShowType(BigInteger showType) {
        this.showType = showType;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "status", nullable = false, precision = 0)
    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "icon", nullable = true, length = 128)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "params", nullable = true, length = 256)
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "spell", nullable = true, length = 256)
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
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

        SModule sModule = (SModule) o;

        if (id != null ? !id.equals(sModule.id) : sModule.id != null) return false;
        if (owner != null ? !owner.equals(sModule.owner) : sModule.owner != null) return false;
        if (name != null ? !name.equals(sModule.name) : sModule.name != null) return false;
        if (leaf != null ? !leaf.equals(sModule.leaf) : sModule.leaf != null) return false;
        if (type != null ? !type.equals(sModule.type) : sModule.type != null) return false;
        if (platform != null ? !platform.equals(sModule.platform) : sModule.platform != null) return false;
        if (pos != null ? !pos.equals(sModule.pos) : sModule.pos != null) return false;
        if (operate != null ? !operate.equals(sModule.operate) : sModule.operate != null) return false;
        if (shortcut != null ? !shortcut.equals(sModule.shortcut) : sModule.shortcut != null) return false;
        if (url != null ? !url.equals(sModule.url) : sModule.url != null) return false;
        if (rmethod != null ? !rmethod.equals(sModule.rmethod) : sModule.rmethod != null) return false;
        if (layer != null ? !layer.equals(sModule.layer) : sModule.layer != null) return false;
        if (showType != null ? !showType.equals(sModule.showType) : sModule.showType != null) return false;
        if (status != null ? !status.equals(sModule.status) : sModule.status != null) return false;
        if (icon != null ? !icon.equals(sModule.icon) : sModule.icon != null) return false;
        if (params != null ? !params.equals(sModule.params) : sModule.params != null) return false;
        if (spell != null ? !spell.equals(sModule.spell) : sModule.spell != null) return false;
        if (remark != null ? !remark.equals(sModule.remark) : sModule.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (leaf != null ? leaf.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        result = 31 * result + (operate != null ? operate.hashCode() : 0);
        result = 31 * result + (shortcut != null ? shortcut.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (rmethod != null ? rmethod.hashCode() : 0);
        result = 31 * result + (layer != null ? layer.hashCode() : 0);
        result = 31 * result + (showType != null ? showType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (spell != null ? spell.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
