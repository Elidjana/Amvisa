Amvisa — Homemakers Food Delivery & Recipe Sharing Platform

Amvisa is a community-driven platform that empowers homemakers to connect with one another, share their favorite homemade recipes, 
and manage food orders with delivery support. It’s designed to bridge the gap between talented home cooks and food lovers who want fresh, homemade meals delivered to their doorstep.

🌟 Features

🍲 Homemaker Profiles/ Home Restaurants — Create and manage personal restaurants profiles
🛍️ Order System — Customers place food orders directly from homemakers
🚚 Delivery Management — Track order status and delivery workflow
💬 Ratings & Reviews — Leave feedback for recipes and delivery quality
🔍 Search & Filters — Browse cooks, dishes, and cuisines easily.

🛠️ TECH STACK

Frontend  React 
Backend	  Java & Spring Boot
Database  MySQL
Hosting   AWS

DESIGN

<img width="2897" height="1653" alt="Final Design-01" src="https://github.com/user-attachments/assets/7a1fc510-63ae-427a-9bab-f60ae0f37b5d" />

DEPLOYMENT STEPS

Create a remote Database in AWS. //
Get your remote DB urls & credentials and connect it to your project.//
Create a server in aws (EC2)
Deploy your code to the server and run it there.
Link your frontend to your backend running on aws ec2
Package your frontend and deploy to aws s3

Remote Database: RDS CONFIG
Search RDS
Select Standard create
Select mysql
Toggle show versions on to auto select engine
Click your tier
Type your db instance name
Enter your db login username and password
Select public access
Click create-database.
Click vpc security group
click security group id
Click edit inbound rule add customTCP anywhere ip4
CONNECT TO THE DATABASE FROM YOUR WORKBENCH
Connect to database from your code


EC2 CONFIG
Search EC2
Enter instance name
Select os
Make sure it’s on free tire
Create new keypair(credentials for logging in) 
Click lunch-instance
Click on security, click security group
Click edit in bond-rule
Add a rule, select custom tcp add your port and anywhere ip4
Connect to your server
Cd to location of your pem file
Grant admin access
Log into the server
Update your server environment(sudo yum update)
Install java jdk LINK: https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/amazon-linux-install.html
Check java version: java -version
Build your jar file and move to the server: scp -i pem_location jarfile.jar  cloud_server_login_username:location


Start the app: java -jar tasks.jar
Test in postman and change the frontend url and url in application.properties .
ctr + c ⇒ stop app. Then run again
RUN IN BACKGROUND
Create new screen: screen -S taskapp
Run app: java -jar tasks.jar
Detach from screen: ctr + A + D
List all screens: screen -ls
Attach to screen: screen -r taskapp
Stop app: ctr+c
Run app and print logs on different file:java -jar TasksApp-0.0.1-SNAPSHOT.jar > tasks.txt 2>&1
View logs: tail -f tasks.txt


S3 CONFIG
Package your frontend: npm run build
Create bucket
Click permission and click edit policy
Set permission: https://gist.github.com/repo0
Click on properties and enable static website hosting
Click on object and upload files and folders

