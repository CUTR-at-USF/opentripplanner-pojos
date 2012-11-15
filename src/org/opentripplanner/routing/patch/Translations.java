/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.routing.patch;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Translations implements Serializable {
    //private static final long serialVersionUID = 2163930399727941628L;
        
    @Getter @Setter private ArrayList<Entry> entry;
    
    @Getter @Setter protected String value;
    
    
    //    public TranslatedString(String language, String note) {
//        translations.add(new Entry(language.intern(), note));
//    }

    public Translations() {
    }
        
    public Translations(String value){
    	this.value = value;
    }
    
    //Need the two following getter/setters to handle English language in JSON:
    //TODO - find a better way to handle this that works for all languages
//    "alertHeaderText":{
//        "translations":{
//           "en":"south end of crossing is to a curb abutting grass, no sidewalk on south side of street"
//        },
//        "someTranslation":"south end of crossing is to a curb abutting grass, no sidewalk on south side of street"
//     },
    
    
    public String getEn(){
    	return value;
    }
    
    public void setEn(String en){
    	value = en;
    }
    
//    public TranslatedString(String v) {
//        this(Alerts.defaultLanguage, v);
//    }
//
//    public boolean equals(Object o) {
//        if (!(o instanceof TranslatedString)) {
//            return false;
//        }
//        TranslatedString tso = (TranslatedString) o;
//        return tso.translations.equals(translations);
//    }
//
//    public int hashCode() {
//        return translations.hashCode() + 1;
//    }
//
//    public void addTranslation(String language, String note) {
//    	translations.add(new Entry(language.intern(), note));
//    }

    // fixme: need to get en-US when requested language is "en"
//    public String getTranslation(String language) {
//    	for(int i=0; i<translations.size(); i++){
//    		Entry en = translations.get(i);
//    		if(en.getKey().equals(language)){
//    			return en.getValue();
//    		}
//    	}
//        return null;
//    }
//
//    public String getSomeTranslation() {
//        if (translations.isEmpty()) {
//            return null;
//        }
//        return translations.get(0).getValue();
////        return translations.values().iterator().next();
//    }
//
//	public String toString() {
//		return "TranslateString(" + getSomeTranslation() + ")";
//	}

}