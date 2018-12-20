package com.vote;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static com.kursk.Util.println;

public class Vote {
    public static void main(String[] args) {
        String ipPrex = "113.111.111.";
        String ValidateCode = null;

        /*try {
            ValidateCode = whenGetRequest_thenOk("http://zsjh7l.v.vote8.cn/Front/VerifyCodeImage/Vote8Click.ashx");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        for(int i=11 ; i < 250 ; i++){
            votework(ipPrex + i , "1545317380,e04e9db496e56f0c87d5f2004b53f906");
        }

        /*try {
            println("result: "+ whenGetRequest_thenOk("http://zsjh7l.v.vote8.cn/Front/VerifyCodeImage/Vote8Click.ashx"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        //assertEquals("status code incorrect", status, 200);
    }

    public static  void votework(String ip , String ValidateCode){
        URL url = null;
        HttpURLConnection con = null;

        try {
            url = new URL("http://zsjh7l.v.vote8.cn/");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
        con.setRequestProperty("Accept-Encoding", "gzip, deflate");
        con.setRequestProperty("Accept-Language", "en,zh-CN;q=0.9,zh;q=0.8,zh-TW;q=0.7");
        con.setRequestProperty("Cache-Control", "no-cache");
        con.setRequestProperty("Connection", "keep-alive");
        con.setRequestProperty("Content-Length", "1055");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Cookie", "__cfduid=d37f729839501f2e93655a14496088e0e1545307184; ASP.NET_SessionId=3yaixsnmuzqesvn01xcbfkrx; UM_distinctid=167cb7c4bcf578-0d7247a6edaf77-b781636-1fa400-167cb7c4bd063f; CNZZDATA4999742=cnzz_eid%3D1033803528-1545304753-null%26ntime%3D1545304753; yjs_id=89ec48ff45a5b8e6db00227ab292beb8; ctrl_time=1; Vote.VoteHistory.2902452=2018/12/20,1; Vote.CheckedOption.2878268=7546338");
        con.setRequestProperty("Host", "zsjh7l.v.vote8.cn");
        con.setRequestProperty("Origin", "http://zsjh7l.v.vote8.cn");
        con.setRequestProperty("Pragma", "no-cache");
        con.setRequestProperty("Referer", "http://zsjh7l.v.vote8.cn/");
        con.setRequestProperty("Upgrade-Insecure-Requests", "1");
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        con.setRequestProperty("x-forwarded-for", ip);
        con.setRequestProperty("Content-type", "application/json;charset=UTF-8");
        con.setRequestProperty("Accept-Charset", "utf-8");
        con.setRequestProperty("contentType", "utf-8");

        Map<String, String> parameters = new HashMap<>();
        parameters.put("__EVENTTARGET", "ctl00$cphMainContent$lbtnVote");
        parameters.put("__EVENTARGUMENT", "");
        parameters.put("__VIEWSTATE", "/wEPDwUKMTEwNzI3NjcxNGRk3//vqoFv0biNf+2vN8kGxV0WP5M=");
        parameters.put("__VIEWSTATEGENERATOR", "9A48AF2D");
        parameters.put("ctl00$cphMainContent$rptTopicList$ctl00$tbOptionSearchInput", "");
        parameters.put("VoteOption_2878268", "7546338");
        parameters.put("ctl00$cphMainContent$rptTopicList$ctl00$hiddenTopicID", "2878268");
        parameters.put("hiddenVote8ClickValidateCode", ValidateCode);  // 1545311698,252d11c21b0b0ae7e2a78cf6ea0a7ed6
        parameters.put("ctl00$cphMainContent$ucVerifyCode$hiddenVerifyCodeModeInfo", "8,2c118771c7960234b365e9b887558e17");
        parameters.put("ctl00$cphMainContent$ucComment$hiddenWeixinNickname", "");
        parameters.put("ctl00$cphMainContent$ucComment$hiddenWeixinHeadImgUrl", "");
        parameters.put("ctl00$cphMainContent$ucComment$hiddenWeixinHeadImgSmallUrl", "");
        parameters.put("ctl00$cphMainContent$ucComment$tbNickname", "");
        parameters.put("ctl00$cphMainContent$hiddenRefererUrl", "http://zsjh7l.v.vote8.cn/");
        parameters.put("ctl00$cphMainContent$hiddenTimeStampEncodeString", "1545311693,509be926f814076bdeef173609c98dcb");
        parameters.put("ctl00$cphMainContent$hiddenLatitude", "");
        parameters.put("ctl00$cphMainContent$hiddenLongitude", "");
        parameters.put("ctl00$cphMainContent$hiddenGeoLocationEncode", "");
        con.setDoOutput(true);
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(con.getOutputStream());
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out , "UTF-8"));
            writer.write(ParameterStringBuilder.getParamsString(parameters));
            writer.close();
            out.close();
            //out.write(ParameterStringBuilder.getParamsString(parameters).getBytes());
            //out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
            //out.flush();
            //out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int status = 0;
        StringBuilder content = null;
        try {
            status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream() , "utf-8"));
            String inputLine;
            content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

         println( content);

    }

    //@Test
    public static String whenGetRequest_thenOk(String urlIput) throws IOException {
        URL url = new URL(urlIput);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        con.setRequestProperty("Accept-Encoding", "gzip, deflate");
        con.setRequestProperty("X-Requested-With", "XMLHttpRequest");
        con.setRequestProperty("Referer", "http://zsjh7l.v.vote8.cn/");
        con.setRequestProperty("Host", "zsjh7l.v.vote8.cn");
        con.setRequestProperty("Cookie", "__cfduid=d37f729839501f2e93655a14496088e0e1545307184; ASP.NET_SessionId=3yaixsnmuzqesvn01xcbfkrx; UM_distinctid=167cb7c4bcf578-0d7247a6edaf77-b781636-1fa400-167cb7c4bd063f; yjs_id=89ec48ff45a5b8e6db00227ab292beb8; ctrl_time=1; Vote.HasVoteJustNow=1; Vote.VoteHistory.2902452=2018/12/20,2; Vote.HasVote.2902452=2018/12/20 21:22:37; CNZZDATA4999742=cnzz_eid%3D1033803528-1545304753-null%26ntime%3D1545312835");

        Map<String, String> parameters = new HashMap<>();
        parameters.put("param1", "val");
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();

        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        println("status:" + status );


        return content.toString();

        /*assertEquals("status code incorrect", status, 200);
        assertTrue("content incorrect", content.toString().contains("Example Domain"));*/
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
