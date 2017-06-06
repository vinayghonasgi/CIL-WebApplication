//package test.hcl.cil.classes;
//package test.classes;
//
//
//import java.util.List;
//
//
//import com.google.code.geocoder.Geocoder;
//import com.google.code.geocoder.GeocoderRequestBuilder;
//import com.google.code.geocoder.model.GeocodeResponse;
//import com.google.code.geocoder.model.GeocoderRequest;
//import com.google.code.geocoder.model.GeocoderResult;
//
//public class GeocodingPlace 
//{
//	private static String Key = "AIzaSyBEgeQ6rR7AHxEazyvtuJUhkKaxZu5efWU";
//	private static String URL = "https://maps.googleapis.com/maps/api/geocode/json?address=business+bay+park,+Pune&key=" + Key;
//	private static double Latitude;
//	private static double Longitude;
//	
//	public static void main(String args[])
//	{
//		final Geocoder geocoder = new Geocoder();
//		String data;
//		GeocoderRequest geocoderRequest1 = new GeocoderRequestBuilder().setAddress("India").getGeocoderRequest();
//		GeocodeResponse geocoderResponse1 = geocoder.geocode(geocoderRequest1);
//		List<GeocoderResult> results1 = geocoderResponse1.getResults();
//		
////		data = results1.get(0).getGeometry().getLocationType().toString();
//		data = results1.get(0).getAddressComponents().get(0).toString();
//		System.out.println(data);
//		data = results1.get(0).getAddressComponents().get(0).getTypes().toString();
//		System.out.println(data);
//		data = results1.get(0).toString();
//		System.out.println(data);
//	}
//}
