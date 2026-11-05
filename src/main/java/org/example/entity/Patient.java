package org.example.entity;

public class Patient {
    private Integer id;
    private String name;
    private String idCard; // 身份证号
    private String phone;

    public Patient() {}

    public Patient(Integer id, String name, String idCard, String phone) {
        this.id = id;
        this.name = name;
        this.idCard = idCard;
        this.phone = phone;
    }

    // Getter 和 Setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getIdCard() { return idCard; }
    public void setIdCard(String idCard) { this.idCard = idCard; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}