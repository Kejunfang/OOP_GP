import javax.swing.JOptionPane;

public class Government {
    Alert alt = new Alert();

//This properties shows the private information for government and the option of country
    private int Government_id = 218318;
    private int Government_password = 666666;
    public String typewrong;
    String[] UpdateCountry = {"China", "Malaysia", "America", "South Pole", "England"};

//This is the function for government to identify their information
    public void identify_information() {
        int id_typewrong = 0;
        int pw_typewrong = 0;
        int g_id = Integer.parseInt(JOptionPane.showInputDialog("Please insert your Government ID (6 digits): "));
//when user typing the wrong id
        while (g_id != Government_id) {
            JOptionPane.showMessageDialog(null, "You are not the government! Try again", "Climate change App", 1);
            g_id = Integer.parseInt(JOptionPane.showInputDialog("Please insert your Government ID (6 digits): "));
            id_typewrong++;
//If the user is typing wrong 3 times.
            if (id_typewrong == 2) {
                JOptionPane.showMessageDialog(null, "You are typing too many times. Bye", "Climate change App", 2);
                typewrong = "TypeWrong";
                break;
            }
        }
        if (g_id == Government_id) {
            typewrong = "TypeNoWrong";
            int g_pw = Integer.parseInt(JOptionPane.showInputDialog("Please insert Password: "));
//if typing wrong password
            while (g_pw != Government_password) {
                JOptionPane.showMessageDialog(null, "Incorrect Password! Try again", "Climate change App", 1);
                g_pw = Integer.parseInt(JOptionPane.showInputDialog("Please insert Password: "));
                pw_typewrong++;
//if typing wrong password for 3 times
                if (pw_typewrong == 2) {
                    JOptionPane.showMessageDialog(null, "You are typing too many times. Bye", "Climate change App", 2);
                    typewrong = "TypeWrong";
                    break;
                }
            }
            if (g_pw == Government_password) {
                typewrong = "TypeNoWrong";
                JOptionPane.showMessageDialog(null, "Welcome, Department ID " + Government_id);
            }
        }
    }

//this is for government to update the information of alert
    public void update_alert_information() {
        String countrySelect = (String) JOptionPane.showInputDialog(null, "Which country do you want to update?",
                "Mr " + Government_id, 2, null, UpdateCountry, UpdateCountry[0]);

        if (countrySelect != null) {
            String alerttype = JOptionPane.showInputDialog("Enter new Alert Type for " + countrySelect + ": ");
            String newLevel = JOptionPane.showInputDialog("Enter new Level for " + countrySelect + ": ");
            String newReleaseUnit = JOptionPane.showInputDialog("Enter new Release Unit for " + countrySelect + ": ");
            String newDate = JOptionPane.showInputDialog("Enter new Date for " + countrySelect + ": ");

            alt.updateCountry(countrySelect,alerttype, newLevel, newReleaseUnit, newDate);
            JOptionPane.showMessageDialog(null, "Updated information for " + countrySelect + " successfully!");
        }
    }
}

