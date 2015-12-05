package tn.smartdev.api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tn.smartdev.api.types.CardsType;

/**
 *
 * @author HP
 */
public class CtrlSaisi {

    private static Pattern pattern; //représentation compilée d'un motif
    private static Matcher matcher; //moteur de recherche d'un motif dans une chaîne de caractères
    private static final String cin_Pattern = "[0-9]{8}";
    private static final String date_Pattern = "((19|20)\\d\\d)-(0?[1-9]|1[012])--(0?[1-9]|[12][0-9]|3[01])";
    private static final String name_Patern = "[a-zA-Z]*";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String Visa_Pattern = "^4[0-9]{12}(?:[0-9]{3})?$";
    private static final String MasterCard_Pattern = "5[1-5][0-9]{14}";
    private static final String AmericainExpress_Pattern = "^3[47][0-9]{13}$";
    private static final String JCB_Pattern = " ^(?:2131|1800|35\\d{3})\\d{11}$";
    private static final String Discover_Pattern = "^6(?:011|5[0-9]{2})[0-9]{12}$";
    private static final String IP_Pattern = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
    private static final String Host_Pattern = "^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$";

    public static boolean IsIPValid(String ip) {
        pattern = Pattern.compile(IP_Pattern);
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static boolean IsHOSTValid(String host) {
        pattern = Pattern.compile(Host_Pattern);
        matcher = pattern.matcher(host);
        return matcher.matches();
    }

    public static boolean IsCARDVAlid(CardsType type, String card) {

        switch (type) {
            case VISA:
                pattern = Pattern.compile(Visa_Pattern);
                break;
            case MASTER_CARD:
                pattern = Pattern.compile(MasterCard_Pattern);
                break;
            case Discover:
                pattern = Pattern.compile(Discover_Pattern);
                break;
            case AmericainExpress:
                pattern = Pattern.compile(AmericainExpress_Pattern);
                break;
            case JCB:
                pattern = Pattern.compile(JCB_Pattern);
                break;
        }
     matcher = pattern.matcher(card);
        return matcher.matches();
    }

    public static boolean IsCinValid(String cin) {
        pattern = Pattern.compile(cin_Pattern);
        matcher = pattern.matcher(cin);
        return matcher.matches();
    }

    public static boolean IsEmailValid(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean IsChaineValid(String name) {
        pattern = Pattern.compile(name_Patern);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean IsdateValid(String date) {
        pattern = Pattern.compile(date_Pattern);
        matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
