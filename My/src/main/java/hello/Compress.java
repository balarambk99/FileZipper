package hello;

import java.util.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.awt.Point;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
@WebServlet("/dec")
@MultipartConfig
/**
 * Servlet implementation class Compress
 */
public class Compress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Compress() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      try {
    	  System.out.print("Decompress");
    	  Part part=request.getPart("file");
    	  System.out.print("Decompress");
    	  InputStream pInputStream=part.getInputStream();
    	  System.out.print("Decompress");
 	  ObjectInputStream objectInputStream=new ObjectInputStream(pInputStream);
//    	  FileInputStream fp=(FileInputStream)objectInputStream.readObject();
//    	  HashMap<String, Character> hashMap=(HashMap<String, Character>)objectInputStream.readObject();
    	  OutputStream pOutputStream=response.getOutputStream();
    	  int a=0;
    	  response.setContentType("application/octet-stream");
    	  String hkString="Context-Disposition";
 		 String g=String.format("attachement;filname=\"%s\"", "hall");
 		response.setHeader(hkString, g);
 		response.setContentLength(pInputStream.available());
    	  StringBuffer bf=new StringBuffer();
    	  byte x[]=(byte[])objectInputStream.readObject();
    	  int n=x.length;
    	  for(int i=0;i<n;i++)
    	  {
    		  pOutputStream.write((char)x[i]);
    		  
    	  }
			/*
			 * while((a=fp.read())!=-1) { String aString=Integer.toBinaryString(a);
			 * if(aString.length()!=8) { for(int i=aString.length();i<=8;i++)
			 * aString="0"+aString; } bf.append(aString);
			 * 
			 * }
			 */
//    	  String p="";
//    	  for(int i=0;i<bf.length();i++)
//    	  {
//    		  p+=bf.charAt(i);
//    		  if(hashMap.get(p)!=null)
//    		  {
//    			  pOutputStream.write(hashMap.get(p));
//    		  }
//    	  }
    	  pOutputStream.close();
    	  
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
		
		
	}

}
