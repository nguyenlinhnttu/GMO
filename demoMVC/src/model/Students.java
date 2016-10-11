package model;

import java.io.Serializable;

public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
    private int mssv;
    private String name;
    private String className;
    private String address;
    
    public Students() {
        
    }
    
    public Students(int mssv, String name, String className, String address) {
        this.mssv = mssv;
        this.name = name;
        this.className = className;
        this.address = address;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
