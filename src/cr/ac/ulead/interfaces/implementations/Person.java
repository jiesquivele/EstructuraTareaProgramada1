package cr.ac.ulead.interfaces.implementations;

import cr.ac.ulead.interfaces.SerializerUlead;

public class Person implements SerializerUlead {

    private String name;
    private String lastName;
    private String dateOfBirth;
    private double weight;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String serializeXML() {
        return  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Persona>\n\t<nombre>" + getName() + "</nombre>\n\t<apellido>" + getLastName() + "</apellido>\n\t<fechaDeNacimiento>" + getDateOfBirth() + "</fechaDeNacimiento>\n\t<peso>" + getWeight() + "</peso>\n\t<altura>" + getHeight() + "</altura>\n</Persona>";
    }

    @Override
    public String serializeJson() {
        return "{\n\t\"nombre\":\"" + getName() + "\"," + "\n\t\"apellido\":\"" + getLastName() + "\"," + "\n\t\"fechaDeNacimiento\":\"" + getDateOfBirth() + "\"," + "\n\t\"peso\":" + getWeight() + "," + "\n\t\"altura\":" + getHeight() + "\n}";
    }
}
