
package net.akhilesh.constant;

public class UrlUtils {

  public static String APP_STORE_URL = "https://itunes.apple.com/lookup?";

  public static String getAppStoreUrl(String id, String country) {
    StringBuffer url = new StringBuffer(APP_STORE_URL);
    url.append("id=" + id);
    url.append("&country=" + country);
    return url.toString();
  }
}
