package com.model;

import java.io.File;
import java.util.Scanner;


public class LoadFile {
	FileCSV fileCSV = new FileCSV(); 
	public void load(String ruta){
		try{
			Scanner scanner = new Scanner(new File(ruta));
	        scanner.useDelimiter(";");
	        int i = 0;
	        String line ;
	        while(scanner.hasNext()){
	        	//System.out.println("QQQQQ   "+scanner.nextLine().charAt(i));
	        	//System.out.println("linea >>>> "+i);

	        	//DENTRO DE ESTE IF SE UBICAN LOS CAMPOS DENTRO DEL OBJETO QUE REPRESENTA 
	        	//EL ARCHIVO CSV/XML Y POSTERIORMENTE SE LE PASA A LA FUNCION QUE CREA EL XML
	        	if(i!=0){
	        	    line = scanner.nextLine();
	        	    //System.out.println("&&&&&&&&&&&&&&&&&&&"+i);
	        	    //System.out.println(line);
	        	    //System.out.println("&&&&&&&&&&&&&&&&&&&");
	        	    String [] arr = line.split(";");
	        	    //System.out.println("$$$$$ "+arr.length);
	        	    int j=0;
	        	    for(String str : arr){
	        	    	//System.out.println("&&&"+str+"&&&");
	        	    	
	        	    	if(j==0){
	        	    		fileCSV.setDsDigestValue(str);
	        	    	}	        	    	
	        	    	if(j==1){
	        	    		//fileCSV.setDsDigestValue(str);
	        	    	}
	        	    	if(j==2){
	        	    		fileCSV.setDsSignatureValue(str);
	        	    	}
	        	    	if(j==3){
	        	    		fileCSV.setDsX509Certificate(str);
	        	    	}
	        	    	if(j==14){	        	    		
	        	    		fileCSV.setCbcRegistrationName(str);
	        	    	}	        	    	
	        	    	j++;
	        	    	//System.out.println("WWW "+str);
	        	    }
	        	    //System.out.println("12345678--"+i);
	        		//fileXML.setCbcIdentificationCode("12345678--"+i);
	    	    	CreateXML createXML = new CreateXML();
	    			createXML.create(fileCSV,i);
	        		//System.out.println(line);	        	    
	        	}		        	
	        		i++;
	        }
	        	//System.out.println(i);
			/*BufferedReader reader =new BufferedReader(new FileReader(ruta));

	        String line = "";
	        while((line=reader.readLine())!=null){
	            String [] employee =line.trim().split(",");
	            // if you want to check either it contains some name
	            //index 0 is first name, index 1 is last name, index 2 is ID
	        }*/
	        scanner.close();
	        //CreateXML createXML = new CreateXML();
			//createXML.create(fileXML);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}