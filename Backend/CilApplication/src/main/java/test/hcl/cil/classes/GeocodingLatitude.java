//package test.hcl.cil.classes;
//package test.classes;
//
//
//import java.util.List;
//
//import com.google.code.geocoder.Geocoder;
//import com.google.code.geocoder.GeocoderRequestBuilder;
//import com.google.code.geocoder.model.GeocodeResponse;
//import com.google.code.geocoder.model.GeocoderRequest;
//import com.google.code.geocoder.model.GeocoderResult;
//
//public class GeocodingLatitude 
//{
//	private String Key = "AIzaSyBEgeQ6rR7AHxEazyvtuJUhkKaxZu5efWU";
//	private static double Latitude;
//	private static double Longitude;
//	private static String temp;
//	
//	public static void main(String args[])
//	{
//		final Geocoder geocoder = new Geocoder();
//		
//		    GeocoderRequest geocoderRequest1 = new GeocoderRequestBuilder().setAddress("Hadapsar Pune").getGeocoderRequest();
//		    GeocoderRequest geocoderRequest2 = new GeocoderRequestBuilder().setAddress("Baner Pune").getGeocoderRequest();
//		    GeocodeResponse geocoderResponse1 = geocoder.geocode(geocoderRequest1);
//		    GeocodeResponse geocoderResponse2 = geocoder.geocode(geocoderRequest2);
//		    List<GeocoderResult> results1 = geocoderResponse1.getResults();
//		    List<GeocoderResult> results2 = geocoderResponse2.getResults();
//		    
//		     Latitude = results1.get(0).getGeometry().getLocation().getLat().floatValue();
//		     Longitude = results1.get(0).getGeometry().getLocation().getLng().floatValue();
//		    System.out.println("------> " + Latitude);
//		    System.out.println("------> " + Longitude);
//		    
//		    Latitude = results2.get(0).getGeometry().getLocation().getLat().floatValue();
//		     Longitude = results2.get(0).getGeometry().getLocation().getLng().floatValue();
//		    System.out.println("------> " + Latitude);
//		    System.out.println("------> " + Longitude);
//
//	}
//}
