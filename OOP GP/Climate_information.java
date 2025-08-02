import javax.swing.JOptionPane;

//This is the function to let users check the information of climate and decide whether they want to take a quiz.
public class Climate_information{
    Quiz quiz = new Quiz();
    // Options for picking quiz or information or go back
    public String[] options = {"Finish", "Information", "Quiz"}; //Back is 0, Information is 1, Quiz is 2.
    
    // Main options for information details (Reason, Effect, Solution)
    public String[] mainOptions ={"Cause", "Effect", "Solution"};
    
    // Options for when we pick "Effect"
    public String[] effectOptions = {"Human", "Environment"};
    
//this is the function to show what information they want to see
    public void showing_climate_informaton(){
        while (true) {
            // Show the options dialog (Back, Information, Quiz)
            int choice = JOptionPane.showOptionDialog(
                null,                           // Parent component
                "Options:",                     // Message
                "Climate Change",               // Title
                JOptionPane.DEFAULT_OPTION,     // Option type
                JOptionPane.INFORMATION_MESSAGE,// Message type
                null,                           // Icon (can be null)
                options,                        // Options
                options[0]                      // Default option
            );
            
            // If Cancel or Back is pressed, break the loop and exit
            if (choice == 0) {
                JOptionPane.showMessageDialog(null,"\nBye.");
                break;
            }
            
            // If Information is selected go to the main selection options
            if (choice == 1) { //1 = Information
                while (true) {
                    // Show the main information options (Reason, Effect, Solution)
                    String mainSelection = (String) JOptionPane.showInputDialog(
                        null,
                        "Climate information:",
                        "Climate Change App",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        mainOptions,
                        mainOptions[0]
                    );

                    // If the user presses Cancel, return to the main options (Back, Information, Quiz)
                    if (mainSelection == null) {
                        JOptionPane.showMessageDialog(null,"\nReturning to main options.");
                        break;
                    }
                    
                    if ("Cause".equals(mainSelection)) {
                        JOptionPane.showMessageDialog(null,"Causes:\n1.Manifacturing goods = Manufacturing and industry produce emissions, mostly from burning fossil fuels to produce energy for making things like cement, iron, steel, electronics, plastics, clothes, and other goods.\n2.Powering buildings = Globally, residential and commercial buildings consume over half of all electricity. As they continue to draw on coal, oil, and natural gas for heating and cooling, they emit significant quantities of greenhouse gas emissions.\n3.Consuming too much = Your home and use of power, how you move around, what you eat and how much you throw away all contribute to greenhouse gas emissions.\nSo does the consumption of goods such as clothing, electronics, and plastics.\n A large chunk of global greenhouse gas emissions are linked to private households.");
                        break;
                    }

                    // If the user chooses Effect, show another dialog for sub-options (Human, Environment)
                    if ("Effect".equals(mainSelection)) {
                        String effectSelection = (String) JOptionPane.showInputDialog(
                            null,
                            "Effect towards:",
                            "Climate Change",
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            effectOptions,
                            effectOptions[0]
                        );

                        // If the user presses Cancel, return to the main selection
                        if (effectSelection == null) {
                            JOptionPane.showMessageDialog(null,"\nReturning to main selection.");
                            break;
                        }

                        // Process the effect selection
                        if ("Human".equals(effectSelection)) {   //null = Cancel
                            JOptionPane.showMessageDialog(null,"Health risk:\n1.Vector borne diseas/n2.Respiratory diseases caused by bad pollution\n3.Diarrhea");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Environment change:\n1.Effect warmer temperatures will have on Earth's polar regions and mountain glaciers\n2.Trees are increasingly dying from drought, and this mass mortality is reshaping forest ecosystems.\n3.Hurricanes are growing more destructive and dumping more rain, an effect that will result in more damage. ");
                            break;
                        }
                    }
                    if ("Solution".equals(mainSelection)) {
                        JOptionPane.showMessageDialog(null,"\n1.Keep fossil fuels in the ground: Fossil fuels include coal, oil and gas – and the more that are extracted and burned, the worse climate change will get. All countries need to move their economies away from fossil fuels as soon as possible.\n2.Changing our main energy sources to clean and renewable energy is the best way to stop using fossil fuels. These include technologies like solar, wind, wave, tidal and geothermal power.\n3.Petrol and diesel vehicles, planes and ships use fossil fuels.\n Reducing car use, switching to electric vehicles and minimising plane travel will not only help stop climate change, it will reduce air pollution too.\n4.Reduce plastic because, Plastic is made from oil, and the process of extracting, refining and turning oil into plastic (or even polyester, for clothing) is surprisingly carbon-intense.");
                        break;
                    }
                }
            }
            // If Quiz is selected,...
            if (choice == 2) {
                quiz. taking_question();
    }
    
}
}
}
