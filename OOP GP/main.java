import javax.swing.JOptionPane;


public class main{
    public static void main(String[] args) {
        //import class
        Government gvn = new Government();
        Public pub = new Public();
        Alert alt = gvn.alt;
        Climate_information ci = new Climate_information();

        //choices
        String[] Type_user = {"Government","Public"};
        String[] Public_behavior = {"View Information","Show Information"};
        String[] Government_behavior = {"View Information","Update Information"};
        String[] ContinueOrBreak = {"Continue","Break"};
        String[] UserBehavior = {"Climate change information","Alert System","Leave"};
        
       //User type
       while(true){
            String usertype = (String)JOptionPane.showInputDialog(null,"Which type of user are u","Climate change App",2,null,Type_user,Type_user[0]);
      
       
            //Government Type
            if(usertype == "Government"){
                //identify the information
                gvn.identify_information();
                if(gvn.typewrong == "TypeWrong"){
                    continue;
                }
            
            //choose the behavior
                else{
                    String governmentbehavior1 = (String)JOptionPane.showInputDialog(null,"Which information you want to check out.","Welcome! ",2,null,UserBehavior,UserBehavior[0]);
                    if (governmentbehavior1 == "Climate change information"){
                       ci.showing_climate_informaton();
                    }
                    else if(governmentbehavior1 == "Alert System"){
                        String governmentbehavior2 = (String)JOptionPane.showInputDialog(null,"What behavior you want to choose.","Welcome! ",2,null,Government_behavior,Government_behavior[0]);
                        if(governmentbehavior2 =="View Information" ){
                            alt.choosing_country();
                            alt.showing_information();
                        }
                        else if (governmentbehavior2 =="Update Information" )
                        gvn.update_alert_information();
                        
                    }
                    else if(governmentbehavior1 == "Leave"){
                        break;
                    }
            
            
                //continue or break
                    String continueorbreak = (String)JOptionPane.showInputDialog(null,"You want to cotinue or break?","Climate change App ",2,null,ContinueOrBreak,ContinueOrBreak[0]);
                    if(continueorbreak == "Continue"){
                        continue;
                    }
                    else{
                        break;
                    }
                }
            
            
            }
        //Public type
            else{
                //Input a name
                pub.name = JOptionPane.showInputDialog("Welcome! What is your name?");
                while(true){
                //choose the behavior
                    String publicbehavior1 = (String)JOptionPane.showInputDialog(null,"What you want to do?","Welcome! "+pub.name,2,null,UserBehavior,UserBehavior[0]);
                    if(publicbehavior1 == "Climate change information"){
                        ci.showing_climate_informaton();
                    }
                    else if(publicbehavior1 == "Alert System"){
                        alt.choosing_country();
                        alt.showing_information();
                    }
                    else if(publicbehavior1 == "Leave"){
                        break;
                    }
            
            
                //continue or break
                String continueorbreak = (String)JOptionPane.showInputDialog(null,"You want to cotinue or break?","Climate change App ",2,null,ContinueOrBreak,ContinueOrBreak[0]);
                    if(continueorbreak == "Continue"){
                        continue;
                    }
                    else{
                        break;
                    }
                }break;
            }
        }
    }
}
