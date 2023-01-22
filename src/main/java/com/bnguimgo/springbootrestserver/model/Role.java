package com.bnguimgo.springbootrestserver.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {
    private static final long serialVersionUID = 2284252532274015507L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID", updatable = false, nullable = false)
    private int id;

    @Column(name="ROLE_NAME", updatable = true, nullable = false)
    private String roleName;

    public Role(){
        super();
    }
    public Role(String roleName){
        super();
        this.roleName = roleName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @Override
    public String toString() {
        return "Role [id=" + id + ", role=" + roleName + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        if (id != other.id)
            return false;
        if (roleName == null) {
            if (other.roleName != null)
                return false;
        } else if (!roleName.equals(other.roleName))
            return false;
        return true;
    }

    public int compareTo(Role role){
        return this.roleName.compareTo(role.getRoleName());

    }
}