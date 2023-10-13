import java.util.HashMap;
import java.util.Map;

public class Countries {
        private static Map<String, String> countryCodes = new HashMap<>();


    public static String getCountryFromCode(String countryName) {
        countryCodes.put("Chile", "CHI");
        countryCodes.put("Australia", "AUS");
        countryCodes.put("Albania", "ALB");
        countryCodes.put("Armenia", "ARM");
        countryCodes.put("Angola", "ANG");
        countryCodes.put("Argentina", "ARG");
        countryCodes.put("Austria", "AUT");
        countryCodes.put("Bosnia-Herzegovina", "BIH");
        countryCodes.put("Belgium", "BEL");
        countryCodes.put("Burkina Faso", "BFA");
        countryCodes.put("Bulgaria", "BUL");
        countryCodes.put("Burundi", "BDI");
        countryCodes.put("Indonesia", "INA");
        countryCodes.put("Benin", "BEN");
        countryCodes.put("Brazil", "BRA");
        countryCodes.put("Canada", "CAN");
        countryCodes.put("Central African Republic", "CTA");
        countryCodes.put("Congo", "COD");
        countryCodes.put("Switzerland", "SUI");
        countryCodes.put("Ivory Coast (Cote D'Ivoire)", "CIV");
        countryCodes.put("Cameroon", "CMR");
        countryCodes.put("China", "CHI");
        countryCodes.put("Costa Rica", "CR");
        countryCodes.put("Greece", "GRE");
        countryCodes.put("Cape Verde", "CPV");
        countryCodes.put("Croatia", "CRO");
        countryCodes.put("Cyprus", "CYP");
        countryCodes.put("Czech Republic", "CZE");
        countryCodes.put("Germany", "GER");
        countryCodes.put("Dominica", "DM");
        countryCodes.put("Dominican Republic", "DOM");
        countryCodes.put("Algeria", "ALG");
        countryCodes.put("England", "ENG");
        countryCodes.put("Ecuador", "ECU");
        countryCodes.put("Egypt", "EGY");
        countryCodes.put("Spain", "ESP");
        countryCodes.put("Ethiopia", "ET");
        countryCodes.put("Finland", "FIN");
        countryCodes.put("France", "FRA");
        countryCodes.put("Gabon", "GAB");
        countryCodes.put("Grenada", "GRN");
        countryCodes.put("Ghana", "GHA");
        countryCodes.put("Gambia", "GAM");
        countryCodes.put("Guinea", "GUI");
        countryCodes.put("Equatorial Guinea", "EQG");
        countryCodes.put("Guinea Bissau", "GNB");
        countryCodes.put("South Korea", "KOR");
        countryCodes.put("Kosovo", "KVX");
        countryCodes.put("Honduras", "HON");
        countryCodes.put("Haiti", "HAI");
        countryCodes.put("Denmark", "DEN");
        countryCodes.put("Hungary", "HUN");
        countryCodes.put("Peru", "PER");
        countryCodes.put("Israel", "ISR");
        countryCodes.put("India", "IND");
        countryCodes.put("Iraq", "IQ");
        countryCodes.put("Iran", "IRA");
        countryCodes.put("Iceland", "ISL");
        countryCodes.put("Italy", "ITA");
        countryCodes.put("Jamaica", "JAM");
        countryCodes.put("Jordan", "JO");
        countryCodes.put("Japan", "JPN");
        countryCodes.put("Kenya", "KEN");
        countryCodes.put("Comoros", "COM");
        countryCodes.put("North Macedonia", "MKD");
        countryCodes.put("Lithuania", "LTU");
        countryCodes.put("Luxembourg", "LUX");
        countryCodes.put("Morocco", "MAR");
        countryCodes.put("Northern Ireland", "NIR");
        countryCodes.put("Martinique", "MTQ");
        countryCodes.put("Montenegro", "MNE");
        countryCodes.put("Serbia", "SRB");
        countryCodes.put("Malta", "MLT");
        countryCodes.put("Mexico", "MEX");
        countryCodes.put("Niger", "NGA");
        countryCodes.put("Nigeria", "NGA");
        countryCodes.put("Netherlands", "NED");
        countryCodes.put("Norway", "NOR");
        countryCodes.put("New Zealand", "NZL");
        countryCodes.put("Panama", "PAN");
        countryCodes.put("Scotland", "SCO");
        countryCodes.put("Wales", "WAL");
        countryCodes.put("Poland", "POL");
        countryCodes.put("South Africa", "RSA");
        countryCodes.put("Portugal", "POR");
        countryCodes.put("Paraguay", "PAR");
        countryCodes.put("Romania", "ROU");
        countryCodes.put("Russian Federation", "RUS");
        countryCodes.put("Saudi Arabia", "SAU");
        countryCodes.put("Sudan", "SUD");
        countryCodes.put("Sweden", "SWE");
        countryCodes.put("Singapore", "SGA");
        countryCodes.put("Saint Helena", "SH");
        countryCodes.put("Slovenia", "SVK");
        countryCodes.put("Senegal", "SEN");
        countryCodes.put("Mali", "MLI");
        countryCodes.put("Suriname", "SUR");
        countryCodes.put("Chad", "CHA");
        countryCodes.put("Togo", "TOG");
        countryCodes.put("Thailand", "TH");
        countryCodes.put("Tunisia", "TUN");
        countryCodes.put("Turkey", "TUR");
        countryCodes.put("Ukraine", "UKR");
        countryCodes.put("Uzbekistan", "UZB");
        countryCodes.put("Uganda", "UGA");
        countryCodes.put("United States", "USA");
        countryCodes.put("Uruguay", "URU");
        countryCodes.put("Venezuela", "VEN");
        countryCodes.put("Yemen", "YEM");
        countryCodes.put("Ireland", "IRL");
        countryCodes.put("Zimbabwe", "ZIM");
        countryCodes.put("Zambia", "ZAM");

        String countrySearch = countryName.toLowerCase();
            if (countryCodes.containsKey(countrySearch)) {
                return countryCodes.get(countrySearch);
            } else {
                return "Could not find this country.";
            }
    }

}



