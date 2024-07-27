package persona.domain;

public class Persona {
private int id;
private String name;
private String lastname;
private int idcity;
private String address;
private int age;
private String email;
private int idgender;
private String fecha;



public Persona() {
    
}
public Persona(int id, String name, String lastname, int idcity, String address, int age, String email, int idgender,String fecha) {
    this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.idcity = idcity;
    this.address = address;
    this.age = age;
    this.email = email;
    this.idgender = idgender;
    this.fecha = fecha;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
public int getIdcity() {
    return idcity;
}
public void setIdcity(int idcity) {
    this.idcity = idcity;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public int getIdGender() {
    return idgender;
}
public void setIdGender(int gender) {
    this.idgender = gender;
}


public String getFecha() {
    return fecha;
}
public void setFecha(String fecha) {
    this.fecha = fecha;
}
@Override
public String toString() {
    return "Persona [id=" + id + ", name=" + name + ", lastname=" + lastname + ", idcity=" + idcity + ", address="
            + address + ", age=" + age + ", email=" + email + ", idgender=" + idgender + "]";
}



}
