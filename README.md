# Self-reflect app

------------------------------
# Simba Team Backend Repository

This repository contains the backend code for the **SelfReflect** project, developed during HackYeah 2024. It is built primarily with Java.

## Features

- **RESTful API**: Serves data through a REST API for client-side applications.
- **Database Integration**: Supports connection to various databases for persistent storage.
- **Authentication**: Implements secure user authentication and authorization.
- **Docker Support**: Includes Docker configuration for easy deployment.
- **Scalability**: Designed to handle multiple requests and scale as needed.

## Getting Started

### Prerequisites

- Java 21 or higher
- Gradle
- Docker  and docker-compose

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/Simba-team-hackyeah2024/BackendRepository.git
   cd BackendRepository
   ```

2. Build and start the database:
```bash
docker-compose up --build

```

3. Build the project and run it:
```bash
./gradlew build
./gradlew bootRun

```
