
package net.akhilesh.main;

import java.io.*;
import java.net.*;
import java.net.URL;

import net.akhilesh.constant.UrlUtils;

public class Application {

    public static void main(String[] args) {
        // id907394059

        try {

            URL url = new URL(UrlUtils.getAppStoreUrl("907394059", "IN"));
            System.out.println("url :" + url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        }
        catch (MalformedURLException e) {

            e.printStackTrace();

        }
        catch (IOException e) {

            e.printStackTrace();

        }

    }

}
