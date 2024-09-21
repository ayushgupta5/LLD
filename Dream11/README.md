# Dream11 Fantasy Sports Platform

## Introduction

This project is a simplified low-level design of a fantasy sports platform similar to Dream11. It allows users to create their fantasy teams, join contests, and compete for prizes based on real-world player performances.

## Key Features
- User registration and login.
- Admin and normal user functionality.
- Team creation and management by users.
- Contests managed by admins.
- Dynamic score calculation for players.
- Contest results based on player performance.

## Class Breakdown

### 1. User (Abstract Class)
**Attributes:**
- `userId`: Unique identifier for the user.
- `username`: Name of the user.
- `email`: Email of the user.
- `walletBalance`: Balance available in the user’s account.

**Methods:**
- `joinContest(Contest contest)`: Allows a user to join a contest.
- `createTeam(Game game, List<Player> players)`: Allows a user to create a fantasy team for a specific game.

### 2. NormalUser (Subclass of User)
**Attributes:**
- `teams`: A list of fantasy teams created by the user.

**Methods:**
- `createTeam()`: Allows a normal user to create a team.
- `joinContest()`: Allows a normal user to join a contest.

### 3. AdminUser (Subclass of User)
**Methods:**
- `createContest(Game game, double entryFee, double prizePool)`: Allows the admin to create a contest for a specific game.
- `manageUsers()`: Admin can manage user accounts.

### 4. Team
**Attributes:**
- `teamId`: Unique identifier for the fantasy team.
- `userId`: The user who created the team.
- `playerList`: List of players selected for the team.

**Methods:**
- `addPlayer(Player player)`: Add a player to the fantasy team.
- `removePlayer(Player player)`: Remove a player from the fantasy team.

### 5. Player
**Attributes:**
- `playerId`: Unique identifier for the real-world player.
- `playerName`: Name of the player.
- `teamName`: Team to which the player belongs in the real world.
- `points`: Points earned by the player in real-time.

### 6. Game
**Attributes:**
- `gameId`: Unique identifier for the real-world game.
- `gameName`: Name of the real-world game (e.g., "IND vs AUS").
- `startTime`: Start time of the game.
- `endTime`: End time of the game.

### 7. Contest
**Attributes:**
- `contestId`: Unique identifier for the contest.
- `entryFee`: Fee required to enter the contest.
- `prizePool`: Total prize pool of the contest.
- `game`: The real-world game associated with the contest.

**Methods:**
- `calculateWinners()`: Calculates and declares winners of the contest.

### 8. ScoringStrategy (Interface)
**Methods:**
- `calculateScore(Player player)`: Calculates the score of a player based on performance.

### 9. ContestManager
Handles the logic related to contests such as creation, updates, and calculating results.

## Key Relationships

- **Inheritance**:
    - `NormalUser` and `AdminUser` inherit from the abstract `User` class.

- **Associations**:
    - **User and Contest**: A user can join multiple contests.
    - **User and Team**: A user can create multiple teams for different games.
    - **Team and Player**: A team consists of a list of players.
    - **Contest and Game**: Each contest is associated with one game.

## Design Principles Applied

1. **Single Responsibility Principle**:
    - Each class has a specific responsibility (e.g., `User` manages user data, `Contest` handles contest-related logic).

2. **Open-Closed Principle**:
    - Classes like `User` and `Contest` can be extended (e.g., for admin or different types of contests) without modifying existing code.

3. **Interface Segregation Principle**:
    - `ScoringStrategy` is an interface, allowing different scoring systems to be used without affecting the main classes.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/dream11-fantasy-sports.git
   cd dream11-fantasy-sports
