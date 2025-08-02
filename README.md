
ITS63304 Object-Oriented Programming

Group Assignment (30%)

September 2024



Student declaration:
I declare that:
• I understand what is meant by plagiarism
• The implication of plagiarism has been explained to us by our lecturer This project is all our work, and I have acknowledged any use of the published or
unpublished works of other people.


Names of Group Members
No 
Student ID 
Student Name
1
0374235
Zhang JunYi
2
0375679
Jovin Maurelio
3
0376399
FuNina
4
0378444
Huang SiHan
5
0375678
Jovan Maurelio
6
0377269
Fan LinXiang




Table of contents
Table of contents	2
Marking Rubic	3
Role and Responsibility	4
1.Introduction	5
1.1 Rationale	5
1.2 Existing Solutions	5
1.3 Our Solution	6
2. Source code and Result	7
2.1 Public Class	7
2.2 Quiz class	7
2.3 Main Class	9
2.4 Alert Class	11
2.5 Climate_information Class	13
2.6 Government Class	16
3. User Interface	17
3.1 Choosing type of User	17
3.2 Government	17
3.2.1 Government Login and Password Page	17
3.2.2 Government behavior in Climate Alert	18
3.2.3 View Information of Climate Alert	18
3.2.4 Update Information of Climate Alert	19
3.3 Public	19
3.3.1 Enter a name to start	19
3.3.2 User Behavior Page	20
3.4 Climate Change Information Page	20
3.5 Quiz Page	21
3.6 Climate Information Page	21
3.7 Continue or Leave?	22
4. User Manual	23
4.1 Government	23
4.1.1 Login	23
4.1.2 Climate change information checking and taking quiz	23
4.1.3 Update the information of Climate Alert	25
4.2 Public	27
4.2.1 Login	27
4.2.2 View the information of Alerts	27
4.2.3 Climate change information checking and taking quiz	28
5. Lesson learned	29
5.1 Conclusion on Results	29
5.2 Recommendations	30
5.3 Future Work	30
References page	30
In the code	30
In the report	31

Marking Rubic
Criteria
Excellent
(8-10)
Good
(6-7)
Average
(4-5)
Poor
(0-3)
Your Score
Description
and rationale


A detailed
description and
outstanding
support for the
SDG13 aim


Sufficient
explanation
and backing
SDG13 target


Average
description
and average
support
SDG13 target


Poor
description
and poor
support
SDG13 target




User
Interface


Extremely
attractive and
user-friendly


Moderate in
terms of both
aesthetics
and ease of
use


Average
visual appeal
and user
friendliness


Not appealing
or user-
friendly




Source code


Extremely
rational,
organized,
and satisfying
every criterion


Acceptable in
that it is
logically
sound, well-
structured,
and generally
satisfying.


The average
logical
organization
that meets
given criteria


Not logical,
poor
organization
and meet few
criteria




Report 


Extensive and
thorough
coverage


Detailed and
well-written.


There is little
detail and the
material is
average.


Not detailed
and not
complete




Lesson
learned


The acquired
knowledge is
extensive and
exhaustive in
every respect.


The lesson is
good and
covers most
of what you
need to know


The lesson
learned is
adequate
and covers
some
ground.


The lesson
learned is poor
and
incomplete




Overall 


Comprehensive
and complete in
all aspects


Good and
comprehensive.


Average and
cover some
ground


Poor and
incomplete






Total:                /70

Role and Responsibility

 
Zhang JunYi
Jovin Maurelio
Fu Nina
Huang SiHan
Jovan Maurelio
Fan LinXiang
Responsibility


Develop the alert class, government class, public class and write the main class of the project
Write the informations of climate change class and help in the report
Write coding for main class
and
Write the report of the class in our project 
Write coding for main class and
Write the report of the class in our project 
Write the informations of climate change class and help in the report
Write the quiz class and help in the report.
Signature
















1.Introduction
1.1 Rationale
[7] Climate change is a long-term change in the average weather patterns that have come to define Earth’s local, regional and global climates. Climate change is one of the biggest challenges in the world today. It has a bad effect on people, animals, and the environment, causing harm in various ways.[6]The climate crisis continues unabated as the global community shies away from the full commitment required for its reversal. 2010 – 2019 was the warmest decade ever recorded. From spreading diseases, rising temperature,and rising sea level. To address this urgent issue, we develop Goal 13 (SDG 13) as part of its 2030 Agenda for Sustainable Development. SDG 13 focuses on taking immediate and effective action to combat climate change and its impacts.
Our project is designed to contribute to this global effort by developing a computer program or app that enables collaboration between governments and regular people. This program will serve as a platform for sharing knowledge, awareness, cause, and solutions. By having features that directly support the goals of SDG 13, our program will make it easier for users to learn about climate issues and take meaningful steps to build a better and more green future. Through this project, our goal is to create a safer and more secure world for everyone.
Despite the increasing awareness of climate change, many tools designed to combat it remain inaccessible to a broad audience. Most existing platforms are highly specialized, targeting experts, researchers, or specific organizations. This exclusivity often leaves out the general public, who are crucial in driving change through collective action. Without the involvement of individuals and local communities, efforts to fight climate change can fall short of their potential.
[10]Elinor Ostrom (1933–2012) was a renowned political economist and the first woman to win the Nobel Prize in Economic Sciences in 2009. The old idea, called the "Tragedy of the Commons", claimed that shared resources would always be overused and destroyed. Ostrom showed that local communities can manage these resources well if they have the freedom and tools to set their own rules. She introduced the idea of "polycentric governance," where different groups at local, regional, and global levels work together to solve problems. Her ideas are now important for tackling big challenges like climate change, protecting nature, and sustainable development, and they support goals like the UN’s SDG 13.





1.2 Existing Solutions
Governments around the world are trying to find the best method to reduce climate change. There are some countries which have already applied several methods to reduce climate change.For example, [5]China aims to peak carbon emissions by 2030 and achieve carbon neutrality by 2060. They expand wind and solar power capacity and have committed to phasing out overseas coal-fired power projects. They also work with the European Union, US and other countries on climate initiatives, showing its key role in reaching the global goal of net-zero carbon emissions.
Social media sometimes gives education about climate solutions. Short videos, infographics, and posts highlight topics such as reducing waste, switching to renewable energy, and supporting ethical brands. For example, [8]National Geographic tells us that climate activists use social media for campaigns, connecting with global audiences, and organizing movements like climate strikes from many platforms such as youtube and TV series. 
Education also plays a significant role in climate change by integrating environmental science and sustainability topics into their curricula. This not only raises awareness among the younger generation but also empowers them to take action in their daily lives. [9]Programs like UNESCO aim to help people understand the impact of global warming today and increase climate literacy among young people. This programme and other innovative educational initiatives, including the Global Action Programme (GAP), Action for Climate Empowerment and the ZOOM campaign, were presented and discussed at the COP 22.
1.3 Our Solution
Our main goal is to create a platform that helps and also teaches people about climate change. With the SDG that focuses on making the world peaceful and safe for people in it, this will create a tight connection between humans and nature. There are also 5 main targets of SDG 13 which cover a wide range of issues surrounding climate action. The core of the 5 targets is to take urgent action to combat climate change and its impacts by strengthening resilience, adaptive capacity, and integrating climate measures into policies and planning.
It would also help mobilize financial resources, raise awareness, and empower vulnerable communities for effective climate management. Therefore, we create this feature to help people find out information about climate change and also the causes, effects, and ways to overcome the problems that will be faced from climate change such as the solutions example is reduce water waste, reduce electricity consumption and more.For the cause of the climate change such as  deforestation. This feature also helps to facilitate collaboration among individuals, governments and organizations. This feature provides us with information about the causes and effects and ways to overcome which will educate us all and this feature also has a quiz that can make us more curious about climate change.

2. Source code and Result
2.1 Public Class

Here the package plays the role of a definition, which defines the name of the climatechange_groupassignment.
The role of import is to introduce the appropriate package so that the code can use the introduced javax.swing.JOptionPane. The javax.swing.JOptionPane is a pop-up box that informs the user about the status of the application.

Defines a field called name.


2.2 Quiz class
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
2.3 Main Class

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

2.4 Alert Class

This code is designed to show the early warning system for different weather conditions.It shows extreme weather as shown by five different weather bureaus on the same date.Different colors were used to indicate the danger level of extreme weather. Green means general danger, yellow means serious danger, and red means particularly serious danger. On 10th December 2024, the China Meteorological Administration issued a yellow high temperature alert, which means high weather on that day. The Malaysian Meteorological Department has issued a green flood warning, which means there will be flooding but no serious consequences, and the National Weather Service in the United States has issued a green hurricane warning, but also no serious consequences. The National Weather Service in Antarctica is forecasting a red blizzard warning, meaning a super severe snowstorm.The Met Office has issued a yellow storm warning, which means severe storms are expected on that day.

The code is convenient for visitors to choose the country they want to view.


This code means that when visitors enter the country they wants to know, which can get the weather and weather level for that country.



The code allows the government to update weather information to ensure that the public receives updated weather warnings.

2.5 Climate_information Class

The code represents the greenhouse effect part, so that visitors can better understand the greenhouse effect. First of all, when visitors enter the program, there will be a basic filter to facilitate visitors to better enter the part they want to understand. First they can choose the quiz, or they can know the information. If they want to know about the greenhouse effect, they can continue to choose to learn about the principle of the greenhouse effect, the causes, the solutions. If they want to know more about the effects, they can look at human effects and environmental effects.

	

This code represents the run of the popup. If the visitors choose to leave, the pop-up window will be closed. If visitors choose to access the alert system, they need to enter the country they want to know to get the alert information. If the visitors select Climate Change information, three options appear to finish, Information and quiz.Back to the code loop above.

2.6 Government Class


The code indicates that if the town staff enters the town, the corresponding id and password are required, so that different country information can be updated. If you enter the wrong id, you will be informed that non-town officials will deny access, and if you enter the wrong password, you will be denied access. Both id and password can be tried 3 times.


This code means that if the town staff update the information they need to select the country they want to update, the new weather information, the level of severe weather warning, the source of the information and the weather, and then save it, so that they can get a reminder of the success of the change. The purpose of updating has been achieved.

3. User Interface
3.1 Choosing type of User
At the page of choosing type of user,We allow users to choose whether he is a Government or he is a Public.Different type of user will have different types of pages.


3.2 Government
3.2.1 Government Login and Password Page
We need to ensure that only one government person is right,so we need the person to type the Government ID and Password to Log in the Government platform.


3.2.2 Government behavior in Climate Alert
If the Government chooses to behave according to Climate Alert, he can either view the current information of climate alerts in the whole world, or he can update the current information of the whole world.


3.2.3 View Information of Climate Alert
If the Government wants to check out the current information, we provide a search bar for them to search the current climate alert of that country.



3.2.4 Update Information of Climate Alert
If the Government chooses to update the information, we provide a page for them to choose the country they want to update.









3.3 Public
3.3.1 Enter a name to start
For Public users, we will need to enter their name and let them choose their next behavior.

3.3.2 User Behavior Page
After the Public user types their name, they will find out that their name will appear at the top of the ui, and then they will need to choose their next behavior.

3.4 Climate Change Information Page
If the user chooses the Climate Change Information Page, they will enter the pages that need them to choose whether they want to see the information, quizzes or leave the information page.

3.5 Quiz Page
If users choose to answer the quiz , they will go to the quiz page and answer the question that we set. It can help them to improve and check if they can learn something on our platform.


3.6 Climate Information Page
If users choose to see the information about climate change, we provide the information page for them to choose the information that they want to see.

3.7 Continue or Leave?
In the end of the User using platform, we can set a continuation of leave for users to choose whether they want to continue their behavior in our educational platform or they want to leave.

4. User Manual
4.1 Government
4.1.1 Login
For Government, they need to enter their username and password to login



They have 3 chances to enter id and password, if they enter wrong id or password more than 3 times, the system will make a caution that they have entered too many times and run back to the choosing user page.


Until the government has typed the correct ID and password and see this page, it means that the government has logged in successfully. 

4.1.2 Climate change information checking and taking quiz
After the government login, it can choose the climate change information checking and take a quiz to check the features it can use or not.


if they want to know the information of the climate change, just press the Information button, and then they can check the information they want to check


If the user wants to take a quiz, they can press the quiz button and then taking quiz.After taking the quiz, they will receive a result.



4.1.3 Update the information of Climate Alert
If the government wants to update the information of climate alert, they will need to choose the country that they want to update, and then fill up the new information one by one.









After you update all the information and see this page, it means that you have updated the information successfully.

4.2 Public
4.2.1 Login
If you are a Public user, we would like you to enter your n`ame first to continue the next step.

4.2.2 View the information of Alerts
After the User has chosen to view the information of alerts.they will ask to choose what country they want to check.


After the user types the country they want to check out, they will see the full climate alert information of that country.


4.2.3 Climate change information checking and taking quiz
The public can choose the climate change information checking and take a quiz to learn something on our platform.


if they want to know the information of the climate change, just press the Information button, and then they can check the information they want to check


If the user wants to take a quiz, they can press the quiz button and then taking quiz.After taking the quiz, they will receive a result.


5. Lesson learned
After we finish the project, we learn how to use the knowledge we have learned in our classes very well and design a useful Education Platform for all users to know more about climate change and know the climate alerts of each country.

5.1 Conclusion on Results
In this project, we are using JOptionPane as our UI graphic, because it provides a beautiful graphic for users to see the information and easily for them to understand too. Overall, We think that the project is nice but the number of operations in our project is repeated too many times


We hope that the user can learn basic climate change knowledge easily in our educational platform because we have a wonderful information page and quiz page to enhance their knowledge.And we will try to give the user more user-friendly functions after we have improved our programming skill.

5.2 Recommendations
For creating a more user friendly website / app, we will recommend that there be more selection in the UI graphic for users to choose the function they want to choose, and also can create a beautiful graphic to attract the user to stay and have interest to learn.

5.3 Future Work
In the future, the programmer should create some useful function for users to avoid any dangerous climate alerts and try to let the users learn more about climate change and save our lovely earth together.
References page
In the code
[1]U. Nations, “Causes and Effects of Climate Change,” United Nations, 2024. https://www.un.org/en/climatechange/causes-and-effects-climate-change 

[2]World Health Organization, “Climate change,” World Health Organization, Oct. 12, 2023. https://www.who.int/news-room/fact-sheets/detail/climate-change-and-health 

[3]S. Gibbens, “Global Warming Effects,” National Geographic, Feb. 14, 2024. https://www.nationalgeographic.com/environment/article/global-warming-effects 
[4]Greenpeace, “What are the solutions to climate change?,” Greenpeace UK, Apr. 12, 2021. https://www.greenpeace.org.uk/challenges/climate-change/solutions-climate-change/ 

In the report
[5]G. Kyriacou, “How is China tackling climate change?,” Grantham Research Institute on climate change and the environment, Jul. 25, 2022. https://www.lse.ac.uk/granthaminstitute/explainers/how-is-china-tackling-climate-change/
[6]United Nations, “Goal 13: Take Urgent Action to Combat Climate Change and Its Impacts,” Sustainable Development Goals, 2023. https://www.un.org/sustainabledevelopment/climate-change/
[7]NASA, “What Is Climate Change?,” science.nasa.gov, 2018. https://science.nasa.gov/climate-change/what-is-climate-change/
[8]National Geographic, “National Geographic: Stories of Animals, Nature, and Culture,” Nationalgeographic.com, 2024. https://www.nationalgeographic.com/

[9]United Nations, “Education is key to addressing climate change,” United Nations, 2021. https://www.un.org/en/climatechange/climate-solutions/education-key-addressing-climate-change
[10]Wikipedia Contributors, “Elinor Ostrom,” Wikipedia, Sep. 29, 2019. https://en.wikipedia.org/wiki/Elinor_Ostrom
