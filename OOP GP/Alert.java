import javax.swing.JOptionPane;

public class Alert {

    // Independent fields for each country
    public String chinaalerttype = "High temperature warming";
    public String chinaLevel = "Yellow";
    public String chinaReleaseUnit = "China Meteorological Administration";
    public String chinaDate = "10th December 2024";

    public String malaysiaalerttype = "Flood warning";
    public String malaysiaLevel = "Green";
    public String malaysiaReleaseUnit = "Jabatan Meteorologi Malaysia";
    public String malaysiaDate = "10th December 2024";

    public String americaalerttype = "Hurricane Warning";
    public String americaLevel = "Green";
    public String americaReleaseUnit = "National Weather Service";
    public String americaDate = "10th December 2024";

    public String southPolealerttype = "Blizzard Warning ";
    public String southPoleLevel = "Red";
    public String southPoleReleaseUnit = "National Weather Service";
    public String southPoleDate = "10th December 2024";

    public String englandalerttype = "Storm Warning ";
    public String englandLevel = "Yellow";
    public String englandReleaseUnit = "Met Office";
    public String englandDate = "10th December 2024";

    public String Country;
	
	//This is the function for user to choose the country
    public String choosing_country() {
        Country = JOptionPane.showInputDialog("Please select the country you want to check out");
        return Country;
    }

//This is the function for showing the information of climate alerts for the selected country)
    public void showing_information() {
        switch (Country) {
            case "China":
                JOptionPane.showMessageDialog(null,"Alert Type: "+ chinaalerttype + "\n" +"Level: " + chinaLevel + "\n" +
                        "Release Unit: " + chinaReleaseUnit + "\n" +
                        "Date: " + chinaDate);
                break;
            case "Malaysia":
                JOptionPane.showMessageDialog(null, "Alert Type: "+ malaysiaalerttype + "\n" +"Level: " + malaysiaLevel + "\n" +
                        "Release Unit: " + malaysiaReleaseUnit + "\n" +
                        "Date: " + malaysiaDate);
                break;
            case "America":
                JOptionPane.showMessageDialog(null, "Alert Type: "+ americaalerttype + "\n" +"Level: " + americaLevel + "\n" +
                        "Release Unit: " + americaReleaseUnit + "\n" +
                        "Date: " + americaDate);
                break;
            case "South Pole":
                JOptionPane.showMessageDialog(null, "Alert Type: "+ southPolealerttype + "\n" +"Level: " + southPoleLevel + "\n" +
                        "Release Unit: " + southPoleReleaseUnit + "\n" +
                        "Date: " + southPoleDate);
                break;
            case "England":
                JOptionPane.showMessageDialog(null, "Alert Type: "+ englandalerttype + "\n" +"Level: " + englandLevel + "\n" +
                        "Release Unit: " + englandReleaseUnit + "\n" +
                        "Date: " + englandDate);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Input");
        }
    }

    // Update information for any country
    public void updateCountry(String country, String alert_type, String level, String releaseUnit, String date) {
        switch (country) {
            case "China":
                chinaalerttype = alert_type;
                chinaLevel = level;
                chinaReleaseUnit = releaseUnit;
                chinaDate = date;
                break;
            case "Malaysia":
                malaysiaalerttype = alert_type;
                malaysiaLevel = level;
                malaysiaReleaseUnit = releaseUnit;
                malaysiaDate = date;
                break;
            case "America":
                americaalerttype = alert_type;
                americaLevel = level;
                americaReleaseUnit = releaseUnit;
                americaDate = date;
                break;
            case "South Pole":
                southPolealerttype = alert_type;
                southPoleLevel = level;
                southPoleReleaseUnit = releaseUnit;
                southPoleDate = date;
                break;
            case "England":
                englandalerttype = alert_type;
                englandLevel = level;
                englandReleaseUnit = releaseUnit;
                englandDate = date;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Country!");
        }
    }
}



