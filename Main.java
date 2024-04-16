package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
	    String metin = "Ahmet   Ensar   YIRTICI   H5220100";
	        
        String temizMetin = StringUtils.deleteWhitespace(metin);
        
        System.out.println("Önce: '" + metin + "'");
        System.out.println("Sonra: '" + temizMetin + "'");

	}		

}
