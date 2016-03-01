package com.bazlur.tips.json;


import org.codehaus.jettison.json.JSONException;

/**
 * @author Bazlur Rahman Rokon
 * @since 2/6/16.
 */
public class JsonDemo {
    public static void main(String[] args) throws JSONException {

//        String json = "[{\"serialNo\":\"AU5109AF0206\",\"model\":\"SRX100H\",\"feature\":\"SRX-RAC-5-LTU: Dynamic VPN service 5 simultaneous Access Manager users\",\"authCode\":\"6PSu-peip-ueeN-eJit\",\"issueDate\":\"27-Jan-2016\",\"expiry\":\"\",\"actions\":\"View&nbsp;Details\",\"perpetual\":true,\"featureSku\":null,\"attachedToDevice\":true,\"license\":\"AU5109AF0206,SRX100H,SRX-RAC-5-LTU: Dynamic VPN service 5 simultaneous Access Manager users,6PSu-peip-ueeN-eJit,27-Jan-2016,,\\\"JUNOS648566 aeaqca qmifkt kmjqhf aummbs ga3ama uqfads\            q2d4y4 er5kyb khmm2z rofjg4 evbswz 7honmn\            pib6dm p2vrdi pmikhy vdhd4w y5km47 wi\\\"\\"}]";
//        String trim = json.trim();
//
//        if (trim.charAt(0) == '[') {
//            String jonsStirng = (trim.substring(1, trim.length() - 1));
//
//            JSONObject jsonObject = new JSONObject(jonsStirng);
//
//            String serialNo = jsonObject.getString("serialNo");
//            String model = jsonObject.getString("model");
//            String feature = jsonObject.getString("feature");
//            String authCode = jsonObject.getString("authCode");
//            String issueDate = jsonObject.getString("issueDate");
//            String expiry = jsonObject.getString("expiry");
//            String actions = jsonObject.getString("actions");
//            boolean perpetual = jsonObject.getBoolean("perpetual");
//            String featureSku = jsonObject.getString("featureSku");
//            boolean attachedToDevice = jsonObject.getBoolean("attachedToDevice");
//            String license = jsonObject.getString("license");
//
//
//        }
//
//        String message = "<serial-number>AU5109AF0206</serial-number><serial-number>AT5109AF0206</serial-number>";
//        System.out.println(message.indexOf("<serial-number>"));
//
//        String substring = message.substring(message.indexOf("<serial-number>"), message.indexOf("</serial-number>"));
//        System.out.println(substring);


        // INFO [main] (SSHJClientImpl.java:218) - expected: root@.*[%]$
        // DEBUG [main] (SSHJClientImpl.java:223) - Out: show chassis hardware | display xml

        //INFO [main] (SSHJClientImpl.java:218) - expected: root@.*%$
        //INFO [main] (SSHJClientImpl.java:217) - output: --- JUNOS 12.1X47-D20.7 built 2015-03-03 21:53:50 UTC
        //root@vSRX-1%
        //

        int number = getNumber();
        System.out.println(number);

//        String pattern = "root@.*%$";
//        String value = "--- JUNOS 12.1X47-D20.7 built 2015-03-03 21:53:50 UTC" +
//                "root@vSRX-1%";
//
//        Pattern compile = Pattern.compile(pattern);
//        Matcher matcher = compile.matcher(value);
//
//        //rx.matcher(output).matches()
//        if (compile.matcher(value).matches()){
//            System.out.println("found");
//        }
    }

    public static int getNumber(){
        try {
            System.out.println("hello");
            return 3;
        }finally {
            System.out.println("in finally meeting .. ");
        }
    }
}
