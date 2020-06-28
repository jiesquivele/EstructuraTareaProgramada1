package cr.ac.ulead.interfaces.implementations;

import cr.ac.ulead.interfaces.SerializerUlead;

public class Pet implements SerializerUlead {

    private String name;
    private String type;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String serializeXML() {
        return  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Mascota>\n\t<nombre>" + getName() + "</nombre>\n\t<tipo>" + getType() + "</tipo>\n\t<edad>" + getAge() + "</edad>\n</Mascota>";
    }

    @Override
    public String serializeJson() {
        return "{\n\t\"nombre\":\"" + getName() + "\"," + "\n\t\"tipo\":\"" + getType() + "\"," + "\n\t\"edad\":\"" + getAge() + "\"\n}";
    }
}
