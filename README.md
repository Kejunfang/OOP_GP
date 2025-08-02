# 1.0 Introduction

Climate change is a long-term change in the average weather patterns that have come to define Earth’s local, regional and global climates. Climate change is one of the biggest challenges in the world today. It has a bad effect on people, animals, and the environment, causing harm in various ways.[6]The climate crisis continues unabated as the global community shies away from the full commitment required for its reversal. 2010 – 2019 was the warmest decade ever recorded. From spreading diseases, rising temperature,and rising sea level. To address this urgent issue, we develop Goal 13 (SDG 13) as part of its 2030 Agenda for Sustainable Development. SDG 13 focuses on taking immediate and effective action to combat climate change and its impacts.
Our project is designed to contribute to this global effort by developing a computer program or app that enables collaboration between governments and regular people. This program will serve as a platform for sharing knowledge, awareness, cause, and solutions. By having features that directly support the goals of SDG 13, our program will make it easier for users to learn about climate issues and take meaningful steps to build a better and more green future. Through this project, our goal is to create a safer and more secure world for everyone.
Despite the increasing awareness of climate change, many tools designed to combat it remain inaccessible to a broad audience. Most existing platforms are highly specialized, targeting experts, researchers, or specific organizations. This exclusivity often leaves out the general public, who are crucial in driving change through collective action. Without the involvement of individuals and local communities, efforts to fight climate change can fall short of their potential.
[10]Elinor Ostrom (1933–2012) was a renowned political economist and the first woman to win the Nobel Prize in Economic Sciences in 2009. The old idea, called the "Tragedy of the Commons", claimed that shared resources would always be overused and destroyed. Ostrom showed that local communities can manage these resources well if they have the freedom and tools to set their own rules. She introduced the idea of "polycentric governance," where different groups at local, regional, and global levels work together to solve problems. Her ideas are now important for tackling big challenges like climate change, protecting nature, and sustainable development, and they support goals like the UN’s SDG 13.

## 1.1 Existing Solution
Governments around the world are trying to find the best method to reduce climate change. There are some countries which have already applied several methods to reduce climate change.For example, [5]China aims to peak carbon emissions by 2030 and achieve carbon neutrality by 2060. They expand wind and solar power capacity and have committed to phasing out overseas coal-fired power projects. They also work with the European Union, US and other countries on climate initiatives, showing its key role in reaching the global goal of net-zero carbon emissions.
Social media sometimes gives education about climate solutions. Short videos, infographics, and posts highlight topics such as reducing waste, switching to renewable energy, and supporting ethical brands. For example, [8]National Geographic tells us that climate activists use social media for campaigns, connecting with global audiences, and organizing movements like climate strikes from many platforms such as youtube and TV series. 
Education also plays a significant role in climate change by integrating environmental science and sustainability topics into their curricula. This not only raises awareness among the younger generation but also empowers them to take action in their daily lives. [9]Programs like UNESCO aim to help people understand the impact of global warming today and increase climate literacy among young people. This programme and other innovative educational initiatives, including the Global Action Programme (GAP), Action for Climate Empowerment and the ZOOM campaign, were presented and discussed at the COP 22.

## 1.2 Our Solution
Our main goal is to create a platform that helps and also teaches people about climate change. With the SDG that focuses on making the world peaceful and safe for people in it, this will create a tight connection between humans and nature. There are also 5 main targets of SDG 13 which cover a wide range of issues surrounding climate action. The core of the 5 targets is to take urgent action to combat climate change and its impacts by strengthening resilience, adaptive capacity, and integrating climate measures into policies and planning.
It would also help mobilize financial resources, raise awareness, and empower vulnerable communities for effective climate management. Therefore, we create this feature to help people find out information about climate change and also the causes, effects, and ways to overcome the problems that will be faced from climate change such as the solutions example is reduce water waste, reduce electricity consumption and more.For the cause of the climate change such as  deforestation. This feature also helps to facilitate collaboration among individuals, governments and organizations. This feature provides us with information about the causes and effects and ways to overcome which will educate us all and this feature also has a quiz that can make us more curious about climate change.

# 2.0 Source Code and result

## 2.1 Public Class
Here the package plays the role of a definition, which defines the name of the climatechange_groupassignment.
The role of import is to introduce the appropriate package so that the code can use the introduced javax.swing.JOptionPane. The javax.swing.JOptionPane is a pop-up box that informs the user about the status of the application.

## 2.2 Quiz Class
Here the package plays the role of a definition, which defines the name of the climatechange_groupassignment.
The role of import is to introduce the appropriate package so that the code can use the introduced javax.swing.*. The javax.swing.* is a pop-up box that informs the user about the status of the application.

A public class called Quiz is defined.
There is a public integer variable chance.
Defines a private, static array of constant strings, quizQuestions, containing three questions related to climate change. 1, 2 and 3 are questions and answers to questions.

Defines a private static constant string array quizAnswers.
The quizAnswers are used to store the answers corresponding to the questions in the previously defined quizQuestions array. For "Greenhouse gases", "Water vapor", "Sea level rise".

The taking_question method is of type public. contains the method for the infinite loop while (true), where the takeQuiz method is called first in the loop body.
Then, by determining the value of the chance variable, if chance is equal to 3, use the break statement to jump out of the loop.

public means the method can be accessed from any class. void means the method has no return value. takeQuiz is the method name.
Initialise a score integer variable to record the user's score, with an initial value of 0.
int i = 0: initialises the loop variable i to 0. i < quizQuestions.length: the loop condition continues as long as i is less than the length of the quizQuestions array. i++: the value of i is increased by 1 at the end of each loop.
Use the JOptionPane.showInputDialog method to show an input dialog that displays questions to the user. null is given as the first argument, indicating that the dialog has no parent window. quizQuestions[i] is the question to be displayed. "Quiz Question " + (i + 1) is the title of the dialog, showing which question is currently the first. 3 is the type of the dialog (which in this case may be an input dialog). The user's answer is stored in the answers variable.
If the user enters an answer and the answer is the same as the correct answer in the quizAnswers array then the score variable is increased by 1. If the answer is incorrect then the code in the else block is executed.
If the answer is correct, a message dialogue is displayed with the text "Correct!" and the title "Quiz Result". If the answer is incorrect, a message dialogue is displayed with the text "Incorrect! The correct answer is:" plus the correct answer with the title "Quiz Result".
Final Score Display, which displays a message dialogue box with the user's score and the total number of questions, titled "Quiz Result".
The chance variable is updated by setting the chance variable to 3, which can be used to control the chance to answer questions.

## 2.3 Main Class

package climatechange_groupassignment; This line of code declares that the class belongs to a package called climatechange_groupassignment.
import javax.swing.JOptionPane This line of code imports the javax.swing. JOptionPane class, which is used to display dialog boxes in a graphical user interface .

public class main { This line of code defines a public class called main.
Government gvn = new Government(); This line of code creates an instance of the Government class named gvn. Public pub = new Public();This line of code creates an instance of the Public class called pub. Alert alt = gvn.alt;This line of code takes the alt attribute from the gvn instance and assigns it to the alt variable. It is assumed here that the Government class has an alt attribute. Climate_Information ci = new Climate_Information(); This line of code creates an instance of the Climate_Information class named ci.

This code defines multiple arrays of strings to store different types of options that can be used for user interaction or system operation selection.

This code uses the JOptionPane.showInputDialog method to bring up a dialogue box that allows the user to select their type (Government or Public). while (true) loops to ensure that the user must select a type before continuing. If the user selects "Government", then the government user's action logic is entered; otherwise, the public user's action logic is entered. Call the gvn.identify_information() method to identify the information. If there is an error in the identification (gvn.typewrong == "Typewrong"), restart the loop.

The first step in this code is to pop up a dialogue box asking the government user what information they would like to see. The user's choice is then based on the user's selection: if "climate change information" is selected, the ci.show_climate_information() method is called to display climate change information. If "Alert System" is selected, a dialogue box pops up asking the user which actions they would like to select. If you select "View Information", the alt.choosing_country() and alt.showing_information() methods are used to select and display information. If you select "Update Information", the gvn.update_alert_information() method is called to update the alert information. If you select "Leave", the loop is skipped.

This code pops up a dialogue box asking the user if they want to continue or interrupt the operation. Depending on the user's choice: if "Continue" is selected, the loop continues. If "Break" is selected, the loop is broken.

For public users, a dialogue box is first popped up asking for a username.Then, using a while (true) loop, the dialogue box is continuously popped up, allowing the user to choose an action (view climate change information, use the alarm system, or leave). The action is performed according to the user's choice: if "Climate change information" is selected, the ci.show_climate_information() method is called to display climate change information. If "Alert System" is selected, the alt.choosing_country() and alt.showing_information() methods are called to select and show information. If "Leave" is selected, the loop is skipped.

This code pops up a dialogue box, allowing the user to choose whether to continue or interrupt the operation. If "Continue" is selected, the loop continues; otherwise, the loop is broken.
 Overall, the code interacts with the user through a dialogue box and performs the appropriate action based on the user's type and choice.

## 2.4 Alert Class

This code is designed to show the early warning system for different weather conditions.It shows extreme weather as shown by five different weather bureaus on the same date.Different colors were used to indicate the danger level of extreme weather. Green means general danger, yellow means serious danger, and red means particularly serious danger. On 10th December 2024, the China Meteorological Administration issued a yellow high temperature alert, which means high weather on that day. The Malaysian Meteorological Department has issued a green flood warning, which means there will be flooding but no serious consequences, and the National Weather Service in the United States has issued a green hurricane warning, but also no serious consequences. The National Weather Service in Antarctica is forecasting a red blizzard warning, meaning a super severe snowstorm.The Met Office has issued a yellow storm warning, which means severe storms are expected on that day.

## 2.5 Climate Change Class
The code represents the greenhouse effect part, so that visitors can better understand the greenhouse effect. First of all, when visitors enter the program, there will be a basic filter to facilitate visitors to better enter the part they want to understand. First they can choose the quiz, or they can know the information. If they want to know about the greenhouse effect, they can continue to choose to learn about the principle of the greenhouse effect, the causes, the solutions. If they want to know more about the effects, they can look at human effects and environmental effects.

This code represents the run of the popup. If the visitors choose to leave, the pop-up window will be closed. If visitors choose to access the alert system, they need to enter the country they want to know to get the alert information. If the visitors select Climate Change information, three options appear to finish, Information and quiz.Back to the code loop above.

## 2.6 Government Class
The code indicates that if the town staff enters the town, the corresponding id and password are required, so that different country information can be updated. If you enter the wrong id, you will be informed that non-town officials will deny access, and if you enter the wrong password, you will be denied access. Both id and password can be tried 3 times.

This code means that if the town staff update the information they need to select the country they want to update, the new weather information, the level of severe weather warning, the source of the information and the weather, and then save it, so that they can get a reminder of the success of the change. The purpose of updating has been achieved.

# 3.0 Lesson learned
After we finish the project, we learn how to use the knowledge we have learned in our classes very well and design a useful Education Platform for all users to know more about climate change and know the climate alerts of each country.

## 3.1 Conclusion on Result
In this project, we are using JOptionPane as our UI graphic, because it provides a beautiful graphic for users to see the information and easily for them to understand too. Overall, We think that the project is nice but the number of operations in our project is repeated too many times

We hope that the user can learn basic climate change knowledge easily in our educational platform because we have a wonderful information page and quiz page to enhance their knowledge.And we will try to give the user more user-friendly functions after we have improved our programming skill.

## 3.2 Recommendation
For creating a more user friendly website / app, we will recommend that there be more selection in the UI graphic for users to choose the function they want to choose, and also can create a beautiful graphic to attract the user to stay and have interest to learn.

## 3.3 Future Work
In the future, the programmer should create some useful function for users to avoid any dangerous climate alerts and try to let the users learn more about climate change and save our lovely earth together.

# 4.0 Reference Page
[1]U. Nations, “Causes and Effects of Climate Change,” United Nations, 2024. https://www.un.org/en/climatechange/causes-and-effects-climate-change 

[2]World Health Organization, “Climate change,” World Health Organization, Oct. 12, 2023. https://www.who.int/news-room/fact-sheets/detail/climate-change-and-health 

[3]S. Gibbens, “Global Warming Effects,” National Geographic, Feb. 14, 2024. https://www.nationalgeographic.com/environment/article/global-warming-effects 
[4]Greenpeace, “What are the solutions to climate change?,” Greenpeace UK, Apr. 12, 2021. https://www.greenpeace.org.uk/challenges/climate-change/solutions-climate-change/ 

[5]G. Kyriacou, “How is China tackling climate change?,” Grantham Research Institute on climate change and the environment, Jul. 25, 2022. https://www.lse.ac.uk/granthaminstitute/explainers/how-is-china-tackling-climate-change/
[6]United Nations, “Goal 13: Take Urgent Action to Combat Climate Change and Its Impacts,” Sustainable Development Goals, 2023. https://www.un.org/sustainabledevelopment/climate-change/
[7]NASA, “What Is Climate Change?,” science.nasa.gov, 2018. https://science.nasa.gov/climate-change/what-is-climate-change/
[8]National Geographic, “National Geographic: Stories of Animals, Nature, and Culture,” Nationalgeographic.com, 2024. https://www.nationalgeographic.com/

[9]United Nations, “Education is key to addressing climate change,” United Nations, 2021. https://www.un.org/en/climatechange/climate-solutions/education-key-addressing-climate-change
[10]Wikipedia Contributors, “Elinor Ostrom,” Wikipedia, Sep. 29, 2019. https://en.wikipedia.org/wiki/Elinor_Ostrom


# 5.0 Original Report
[ITS63304 Object-Oriented Programming.pdf](https://github.com/user-attachments/files/21559201/ITS63304.Object-Oriented.Programming.pdf)

