# Stock Portfolio Manager with Unity Visualization 🐠📈

A full-stack web application that combines traditional stock portfolio management with an innovative Unity-based aquarium visualization. Watch your investments come to life as fish swimming in a virtual aquarium, where each fish represents a stock in your portfolio!

## 🌟 Overview

This project is a comprehensive stock portfolio management system built with Spring Boot, AWS DynamoDB, and Redis caching. The standout feature is a Unity game application that visualizes your stock portfolio as an interactive aquarium—each stock becomes a fish, creating an engaging and intuitive way to understand your investments at a glance.

## ✨ Key Features

### Portfolio Management
- **Real-time Stock Data**: View current stock prices and historical data
- **Buy & Sell Stocks**: Execute trades directly through the web interface
- **Portfolio Dashboard**: Track all your purchased stocks in one place
- **Price Visualization**: Interactive graphs showing stock price trends
- **Transaction History**: Complete record of all buy/sell activities

### Unity Aquarium Visualization 🎮
- **Fish Representation**: Each stock in your portfolio appears as a fish in an aquarium
- **Interactive Trading**: Click on a fish to buy more shares of that stock
- **Batch Operations**: Sell multiple stocks at once by selecting multiple fish
- **Visual Feedback**: Fish characteristics may reflect stock performance
- **Engaging UX**: Gamified approach to portfolio management

### Technical Features
- **High Performance**: Redis caching for optimized data retrieval
- **Scalable Storage**: AWS DynamoDB for robust data persistence
- **Lambda Services**: Serverless architecture for specific operations
- **CI/CD Pipeline**: Automated deployment pipeline included
- **RESTful API**: Well-structured API for all operations

## 🏗️ Architecture

### Backend
- **Framework**: Spring Boot
- **Database**: AWS DynamoDB
- **Caching**: Redis
- **Serverless**: AWS Lambda
- **Build Tool**: Gradle

### Frontend
- **Web Framework**: Vanilla JavaScript with Webpack
- **HTTP Client**: Axios
- **Notifications**: Toastify.js
- **Game Engine**: Unity (for aquarium visualization)

### Infrastructure
- **Cloud Provider**: AWS
- **CI/CD**: AWS CloudFormation
- **Local Development**: DynamoDB Local, Redis Local

## 📋 Prerequisites

- Java 11 or higher
- Node.js and npm/yarn
- AWS Account with configured credentials
- Docker (for local DynamoDB and Redis)
- Unity (for developing/running the visualization)
- Gradle

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/zchalmers/ATA-Capstone-VisualizedStockTrading.git
cd ATA-Capstone-VisualizedStockTrading
```

### 2. Set Up Environment Variables

Edit `setupEnvironment.sh` with your configuration:
```bash
# GitHub repository URL
GITHUB_REPO_URL="https://github.com/yourusername/yourrepo"

# GitHub username
GITHUB_USERNAME="your-username"

# AWS credentials (ensure these are set in your environment)
# AWS_ACCESS_KEY_ID
# AWS_SECRET_ACCESS_KEY
# AWS_REGION
```

Run the setup:
```bash
./setupEnvironment.sh
```

### 3. Start Local Development Services

#### Start Local DynamoDB
```bash
./local-dynamodb.sh
```

#### Start Local Redis
```bash
./runLocalRedis.sh
```

### 4. Deploy Development Environment

```bash
./deployDev.sh
```

This will:
- Build the application
- Deploy to local environment
- Start the backend server
- Build and serve the frontend

### 5. Access the Application

Navigate to: `https://localhost:5001/index.html`

## 🎮 Usage

### Managing Your Portfolio

1. **Search for Stocks**
   - Enter a stock symbol (e.g., AAPL, GOOGL) in the search bar
   - Click "View Stock" to see detailed information and price history

2. **Purchase Stocks**
   - View the stock's price graph
   - Enter the number of shares you want to buy
   - Click "Buy" to complete the purchase
   - Stocks are added to your portfolio

3. **View Portfolio**
   - Navigate to the Portfolio page
   - See all your purchased stocks
   - View current values and gains/losses

4. **Sell Stocks**
   - From the portfolio view, select stocks to sell
   - Enter the number of shares
   - Confirm the sale

### Unity Aquarium Visualization

1. **Launch the Unity Application**
   - Open the Unity project from the repository
   - Build and run the aquarium visualization

2. **Interact with Your Portfolio**
   - Each fish represents a stock you own
   - Click on a fish to view stock details
   - Click "Buy More" to purchase additional shares
   - Select multiple fish and click "Sell" for batch selling

3. **Visual Cues**
   - Fish size, color, or behavior may indicate stock performance
   - Swim patterns could represent volatility
   - Aquarium health reflects overall portfolio status

## 🔌 API Endpoints

### Stock Management
```http
GET /stocks/{symbol}
```
Get stock information by symbol

```http
POST /stocks
Content-Type: application/json

{
  "userId": "user-123",
  "symbol": "AAPL",
  "shares": 10,
  "purchasePrice": 150.00,
  "purchaseDate": "2024-01-15"
}
```
Purchase a stock

```http
DELETE /stocks/{userId}/{symbol}
```
Sell a stock

### Visualization
```http
GET /visualize/{userId}
```
Get portfolio data formatted for Unity visualization

```http
GET /visualize/{userId}/fish
```
Get fish representation of all stocks

## 📦 Project Structure

```
ATA-Capstone-VisualizedStockTrading/
├── Application/                    # Spring Boot backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/              # Java source code
│   │   │   │   └── com/kenzie/appserver/
│   │   │   │       ├── controller/ # REST controllers
│   │   │   │       ├── service/    # Business logic
│   │   │   │       └── repositories/ # Data access
│   │   │   └── resources/          # Configuration files
│   │   └── test/                   # Unit tests
│   └── build.gradle
├── Frontend/                       # Web frontend
│   ├── src/
│   │   ├── css/                   # Stylesheets
│   │   ├── pages/                 # HTML pages
│   │   └── js/                    # JavaScript modules
│   ├── package.json
│   └── webpack.config.js
├── ServiceLambda/                  # AWS Lambda functions
├── ServiceLambdaJavaClient/        # Lambda client
├── ServiceLambdaModel/             # Lambda models
├── IntegrationTests/               # Integration test suite
├── Utilities/                      # Shared utilities
├── buildScripts/                   # Build automation
├── .github/                        # GitHub Actions
├── Application-template.yml        # CloudFormation template
├── LambdaService-template.yml     # Lambda CF template
├── deployDev.sh                   # Local deployment script
├── createPipeline.sh              # CI/CD pipeline creation
└── cleanupPipeline.sh             # Pipeline teardown
```

## 🛠️ Technologies Used

**Backend:**
- Spring Boot
- AWS DynamoDB
- Redis (Caching)
- AWS Lambda
- Spring Cache
- Gradle

**Frontend:**
- JavaScript (ES6+)
- Webpack 4
- Axios
- Toastify.js
- HTML5/CSS3

**Game/Visualization:**
- Unity Engine
- C# (Unity scripts)

**Infrastructure & DevOps:**
- AWS CloudFormation
- AWS API Gateway
- Docker
- GitHub Actions
- Bash scripting

**Development Tools:**
- DynamoDB Local
- Redis Local
- Gradle
- JUnit (Testing)

## 🚀 Deployment

### Deploy to Development

```bash
./deployDev.sh
```

### Deploy CI/CD Pipeline

1. Configure `setupEnvironment.sh` with your GitHub repository details
2. Create the pipeline:
```bash
./createPipeline.sh
```

3. The pipeline will automatically:
   - Build the application on code push
   - Run tests
   - Deploy to staging
   - Deploy to production (with approval)

### Teardown Pipeline

```bash
./cleanupPipeline.sh
```

### Teardown Development

```bash
./cleanupDev.sh
```

## 🧪 Testing

### Run Unit Tests
```bash
./gradlew test
```

### Run Integration Tests
```bash
./gradlew integrationTest
```

## 🔧 Configuration

### Application Properties
Located in `Application/src/main/resources/application.properties`

Key configurations:
- DynamoDB endpoint and credentials
- Redis connection details
- Stock API configuration
- Server port settings

### CloudFormation Templates
- `Application-template.yml`: Main application infrastructure
- `LambdaService-template.yml`: Lambda function configuration
- `LambdaExampleTable.yml`: DynamoDB table definitions

## 💡 Development Tips

### Local Development
- Use `deployDev.sh` for quick local testing
- DynamoDB Local runs on port 8000
- Redis runs on default port 6379
- Backend API runs on port 5001
- Frontend dev server runs on port 8080

### Adding New Features
1. Backend: Add controllers in `Application/src/main/java/*/controller/`
2. Frontend: Add pages in `Frontend/src/pages/`
3. Unity: Modify visualization in the Unity project folder

### Debugging
- Check application logs in `Application/logs/`
- Use DynamoDB Local Admin UI at `http://localhost:8000/shell`
- Redis CLI: `redis-cli` for cache inspection

## 🎨 Unity Visualization Details

The Unity aquarium provides an innovative way to visualize your portfolio:

- **Fish Types**: Different stocks may be represented by different fish species
- **Fish Size**: Could represent the value of your holdings
- **Color**: May indicate profit (green) or loss (red)
- **Movement**: Swimming patterns could show volatility
- **Aquarium Theme**: Overall theme reflects portfolio health

## 🔐 Security Notes

- Never commit AWS credentials to version control
- Use environment variables for sensitive configuration
- Implement proper authentication for production deployment
- Follow AWS IAM best practices for service permissions
- Use HTTPS in production environments

## 🤝 Contributing

This is a capstone project for educational purposes. If you're working on a similar project, please maintain academic integrity.

## 📄 License

UNLICENSED - This is an educational project.

## 👤 Author

**Zach Chalmers**

## 🙏 Acknowledgments

- Amazon Technical Academy
- Kenzie Academy
- AWS for cloud infrastructure
- Unity Technologies

## 📝 Notes

This project demonstrates:
- Full-stack development (Spring Boot + JavaScript)
- Cloud-native architecture (AWS services)
- Caching strategies (Redis)
- Serverless computing (Lambda)
- Game development integration (Unity)
- CI/CD pipeline implementation
- RESTful API design

---

**Combine finance with fun! Watch your investments swim! 🐠💰**
