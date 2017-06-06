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
//import com.google.maps.GeoApiContext;
//import com.google.maps.GeocodingApi;
//
//public class Geocodingkey 
//{
//	private static String Key = "AIzaSyBEgeQ6rR7AHxEazyvtuJUhkKaxZu5efWU";
//	private static String URL = "https://maps.googleapis.com/maps/api/geocode/json?address=business+bay+park,+Pune&key=" + Key;
//	private static String results[] = new String[500];
//	
//	public static void main(String args[])
//	{
//		GeoApiContext context = new GeoApiContext().setApiKey(Key);
//
//
//		results = GeocodingApi.geocode(context,getAddress().getDetailAddress()).await();
//
//		s.setShopLatitude(results[0].geometry.location.lat);
//		s.setShopLongitude(results[0].geometry.location.lng);
//
//	}
//}
