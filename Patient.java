package data;

import java.awt.List;
import java.util.Date;

public class Patient {
	String name,location;
    Date date1;
    
    public Patient(){
    name="";
    location="";
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }
    public Date getdate1() {
        return date1;
    }

    public void setdate1(Date date1) {
        this.date1 = date1;
    }


}
