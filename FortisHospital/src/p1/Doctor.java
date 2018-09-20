package p1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Doctor {
	@Id
int dId;
String name;
String specialization;
public Doctor(int dId, String name, String specialization) {
	super();
	this.dId = dId;
	this.name = name;
	this.specialization = specialization;
}
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
@Override
public String toString() {
	return "Doctor [dId=" + dId + ", name=" + name + ", specialization=" + specialization + "]";
}


}
