# ATA-Capstone-Project

### Stock Portfolio Manager with Unity Visualization

### Overview

This project is a web-based stock portfolio management system built using Spring Boot and AWS DynamoDB for storage, with Redis caching implemented for performance optimization. The main purpose of the project is to provide users with a platform to buy and sell stocks, view their portfolio, and visualize their investments using a Unity game application that simulates your portfolio as fish in an aquarium.

### Features

User authentication and authorization
Stock price data visualization in a graph format
Ability to buy and sell stocks
Portfolio page to view all purchased stocks
Unity game application to visualize the stocks in the form of fish in an aquarium
Clicking on a fish in the game allows users to buy more shares of the corresponding stock
Ability to sell the fish that corresponds to the stock
Technologies Used
Spring Boot
AWS DynamoDB
Redis caching
Unity

### Installation

Clone the repository
Install the required dependencies
Set up the AWS DynamoDB credentials and configure the database
Set up Redis caching
Run the application

### Usage

Navigate to the homepage of the web application
Enter the name of the stock you wish to view and click the "View Stock" button
Use the graph to analyze the stock data and make a decision to buy or not
If you decide to buy, enter the amount of shares you wish to buy and click "Buy"
Navigate to the portfolio page to view your purchased stocks
Launch the Unity game application to visualize your investments
Click on the fish corresponding to a stock to buy more shares
Sell a fish to sell the corresponding stock

### Conclusion

This project provides users with a comprehensive platform to manage their stock investments. With its easy-to-use interface, users can quickly analyze stock data, make investment decisions, and visualize their portfolio in a fun and interactive way. By utilizing AWS DynamoDB and Redis caching, the application can handle large amounts of data while maintaining high performance.








### To deploy the Development Environment
Run `./deployDev.sh`

Navigate to https://localhost:5001/index.html

### To deploy the CI/CD Pipeline
Fill out `setupEnvironment.sh` with the url of the github repo and the username.

Run `./createPipeline.sh`

To teardown the pipeline, run `./cleanupPipeline.sh`


