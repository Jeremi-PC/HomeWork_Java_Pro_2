package org.example.organization;
//Создайте классы Сотрудник, Директор,
// Департамент и Организация. Создайте необходимые поля в каждом классе.
// Какие виды отношений будут между указанными классами?
// public class Organization extends Department{
public class Organization {
    private String nameOfOrganization;
    private String areaOfActivity;

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getAreaOfActivity() {
        return areaOfActivity;
    }

    public void setAreaOfActivity(String areaOfActivity) {
        this.areaOfActivity = areaOfActivity;
    }

    public Organization(String nameOfOrganization, String areaOfActivity) {
        this.nameOfOrganization = nameOfOrganization;
        this.areaOfActivity = areaOfActivity;
    }
}

