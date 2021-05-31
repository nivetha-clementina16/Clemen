package Tina;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import data.Patient;

public class Decision {

	public static void main(String[] args) throws ParseException {
				
		int bcount=0,ocount=0;
		String sDate1="03/05/2020";  
		String sDate2="07/05/2020";  

	    Date from=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    Date to=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
	    
		List<Patient> allPatient = new ArrayList<>();

	    Patient p=new Patient();
	    p.setName("Nivetha");
	    p.setlocation("Bangalore");
	    p.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2020"));
	    allPatient.add(p);
	    Patient p2=new Patient();
	    p2.setName("Tina");
	    p2.setlocation("KGF");
	    p2.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2020"));
	    allPatient.add(p2);
	    Patient p3=new Patient();
	    p3.setName("Clemen");
	    p3.setlocation("Bangalore");
	    p3.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2020"));
	    allPatient.add(p3);
	    Patient p4=new Patient();
	    p4.setName("NCD");
	    p4.setlocation("Kolar");
	    p4.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2020"));
	    allPatient.add(p4);
	    Patient p5=new Patient();
	    p5.setName("Subi");
	    p5.setlocation("Bangalore");
	    p5.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2020"));
	    allPatient.add(p5);
	    
	    int sizeAll=allPatient.size();
	    for(int i=0;i<allPatient.size();i++){
	    	if(allPatient.get(i).getlocation()=="Bangalore"){
	    		if(allPatient.get(i).getdate1().compareTo(from)>0 && allPatient.get(i).getdate1().compareTo(to)<0){
	    			bcount++;
	    		}
	    		else{
	    		sizeAll--;
	    		}
	    	}else{
		    	ocount++;
	    	}
	    }
	    
	    System.out.println("Bangalore: "+bcount);
	    System.out.println("Out: "+ocount);
	    
	    
	    Double inPatientPercentage = Double.valueOf(bcount * 100 / sizeAll);
        Double outPatientPercentage = Double.valueOf(ocount * 100 / sizeAll);
	    System.out.println("Local Patients(%): "+inPatientPercentage);
	    System.out.println("Outstation Patients(%): "+outPatientPercentage);

	}

}
