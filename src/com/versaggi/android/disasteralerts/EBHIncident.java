package com.versaggi.android.disasteralerts;

import java.util.Date;

/** ********************** BEGIN LEGAL STUFF ****************************
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*     http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
********************** END LEGAL STUFF ******************************
*/

/** EBHIncident:
 * 
 * This class is a effectively just a data structure for the object EBHIncident.
 * It contains simple getters and a toString Override for Date formatting
 * purposes. 
 *
 * THIS DOES NOT REPRESENT THE UNDERLYING DATABASE STRUCTURE, JUST A QUAKE OBJECT.
 */
public class EBHIncident {

	// Used to get the Log.D TAG from the strings.XML file so its flexible
	private static final String TAG = EBHIncident.class.getSimpleName();
	
	// Debug Flags ....
	// Boolean debug = Boolean.FALSE;
	   Boolean debug = Boolean.TRUE;
	   
	   
	// Column Constants 
	public static final String EBHIncident_ID 	   		 = "_id";
	public static final String EBHIncident_DATE 	   	 = "date";      
	public static final String EBHIncident_DETAILS   	 = "details";	// (aka) Title
	public static final String EBHIncident_DESCRIPTION 	 = "description";	
	public static final String EBHIncident_GEOPOINT_LAT  = "geopoint_lat";
	public static final String EBHIncident_GEOPOINT_LNG  = "geopoint_lng";
	public static final String EBHIncident_CDATA 		 = "cdata";
	public static final String EBHIncident_LINK 	  	 = "link";
	
	  // Local variable instantiations ...
	  public int ebhid; 
	  public Date date;				
	  public String details;	// (aka) Title
	  public String description;
	  public float geopoint_lat;
	  public float geopoint_lng;
	  public String cdata;
	  public String link;
	  
	  // GETTER Functions 
	  public int getId() 			 { return ebhid; }
	  public Date getDate() 		 { return date; }
	  public String getDetails() 	 { return details; }		// (aka) Title
	  public String getDescription() { return description; }
	  public float getGeoPointLat()  { return geopoint_lat; }
	  public float getGeoPointLng()  { return geopoint_lng; }
	  public String getCData() 		 { return cdata; }
	  public String getLink() 		 { return link; }
	  
	  
	  //Constructor Function for the EBHIncident Object ...
	  public EBHIncident(int _ebhid, Date _date, String _details, String _descr, float _geopt_lat, float _geopt_lng, String _cdata, String _link) {
		ebhid 		 = _ebhid;
	    date 		 = _date;
	    details 	 = _details;		// (aka) Title
	    description	 = _descr;
	    geopoint_lat = _geopt_lat;
	    geopoint_lng = _geopt_lng;
	    cdata	 	 = _cdata;
	    link 		 = _link;
	  }
	  
	
}// END Class EBHIncident























