package com.vote;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static com.kursk.Util.println;

public class Vote {
    public static void main(String[] args) {
        String ipPrex = "222.222.222.";

        for(int i=0 ; i < 20 ; i++){
            votework(ipPrex + i +"0");
        }


        //assertEquals("status code incorrect", status, 200);
    }

    public static  void votework(String ip){
        URL url = null;
        HttpURLConnection con = null;

        try {
            url = new URL("http://zsjh7l.v.vote8.cn/m");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        con.setRequestProperty("Host", "zsjh7l.v.vote8.cn");
        con.setRequestProperty("Content-Length", "925");
        con.setRequestProperty("Cookie", "__cfduid=d666053a3866a3e3d65b94600903d94bf1545295548; ASP.NET_SessionId=ooubwoge2hdi0udaufqfmigr; UM_distinctid=167cac7ac5422c-0b27821b628475-182e1503-15f900-167cac7ac562e1; yjs_id=fd99dac1778e6c45f682fb92a7016b67; Vote.VoteHistory.2902452=2018/12/20,1;  CNZZDATA5855278=cnzz_eid%3D683721456-1545290198-%26ntime%3D1545295598; ctrl_time=1");
        con.setRequestProperty("x-forwarded-for", ip);

        Map<String, String> parameters = new HashMap<>();
        parameters.put("from", "timeline");
        parameters.put("isappinstalled", "0");
        con.setDoOutput(true);
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int status = 0;
        StringBuilder content = null;
        try {
            status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //println(content);
    }
}

class ParameterStringBuilder {
    public static String getParamsString(Map<String, String> params)
            throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();
        return resultString.length() > 0
                ? resultString.substring(0, resultString.length() - 1)
                : resultString;
    }
}
