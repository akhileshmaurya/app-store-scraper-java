
package net.akhilesh.service;

import org.apache.commons.lang3.StringUtils;

import net.akhilesh.constant.CountryMarket;

public class CommonService {

    public static int marketCode(String country) {
        CountryMarket cm = CountryMarket.US;
        if (StringUtils.isNoneBlank(country) && CountryMarket.map.containsKey(country)) {
            cm = CountryMarket.map.get(country);
        }
        return cm.getMarketCode();
    }
    
    
}
