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

package org.opentripplanner.routing.core;

import java.util.Currency;
import java.util.Locale;

import lombok.Getter;
import lombok.Setter;

public class WrappedCurrency {
    @Getter @Setter private Currency currency;
    
    @Getter @Setter private String currencyCode;
    
    @Getter @Setter String symbol;
    
    @Getter @Setter int defaultFractionDigits;
    
    public WrappedCurrency() {
        currency = null;
    }
    
    public WrappedCurrency(Currency value) {
        this.currency = value;
    }
    
    public WrappedCurrency(String name) {
        currency = Currency.getInstance(name);
    }

//    public int getDefaultFractionDigits() {
//        return currency.getDefaultFractionDigits();
//    }
    
//    public String getCurrencyCode() {
//        return currency.getCurrencyCode();
//    }
    
//    public String getSymbol() {
//        return value.getSymbol();
//    }
    
    public String getSymbol(Locale l) {
        return currency.getSymbol(l);
    }

    public String toString() {
        return currency.toString();
    }
    
    public boolean equals(Object o) {
        if (o instanceof Currency) {
            return currency.equals(o);
        }
        WrappedCurrency c = (WrappedCurrency) o;
        return currency.equals(c.currency);
    }
}
