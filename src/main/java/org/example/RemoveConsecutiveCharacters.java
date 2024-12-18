package org.example;

public class RemoveConsecutiveCharacters {
    public static void main(String args[]) {
        String a = "lfoajnippckfilmebjffjdacopakmhfbfagnoekojnaieolalehfdonhlpomflkcjhbkmknnciaehfbgliklmjhfmpmjpgcghcnkjfgcmbhcinljcncbmmhedboffhnnogmhfehdcfhlidohlffppmjccafimiigngfbmcdphcdgghcalijlnhmhpkoaogodmpoofpfdbdnakhkdkmekioemmbnaifbjddcgeheoehfefcjjnjmhdpfapgeifgdelgnghkhcjlfbajbldlnnpciofpplkididngalglikambfgpbojioamkaflmecccbpffchepgahbfhnfmnhlkhkfllniacehdmpfdklokdphjgmcgpfaajlkieojhffipeegjodcmfcbnmgfpenhfembheleahdgfiplbobifeimamepfeclbokjpklanpaanaiidmnaiploieogbpdfnokpjflknhjfcbgcfojiokjfohmkjdbmcceanjanhbcdocglbkgjaefejaejimpkidejkihjiedhghmoilofcijfoabnkcbjjbbahlpnigppkoniccjlclhgnpfaobmkfclijllafie";
        int b = 1;
        StringBuilder sbr = new StringBuilder(a);
        int start = 0;
        while (start < sbr.length()) {
            char c = sbr.charAt(start);
            int cnt = 0;
            int i = start;
            while (i < sbr.length() && c == sbr.charAt(i)) {
                cnt++;
                i++;
            }
            if (cnt == b) {
                sbr.replace(start, start + b, "");
            }
            else if(cnt>b)
            {
                start=i;
            }
            else {
                start++;
            }
        }
        System.out.println(sbr.toString());

    }


}
