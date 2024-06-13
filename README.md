# EcoSystem

## Overview
EcoSystem is a dynamic simulation project that models interactions between various animal species across diverse habitats.

## Goals
My goals for this project were to:
- Learn and implement **design patterns** in Java, such as **Factory** and **Observer**.
- Refresh my knowledge of writing **automated tests**.
- Gain experience in developing a complex **OOP** simulation project in **Java**.

## Description
The EcoSystem project is a detailed simulation of interactions between different animal species in various habitats. The simulation runs for an unpredictable number of days, showcasing how different animals interact with each other and their environment.

### Animal Categories
The animals in the simulation are divided into three categories:
- **Herbivores**
- **Carnivores**
- **Omnivores**

Each animal has a set of attributes that determine its behavior and interactions with other animals.

### Habitats
The simulation includes nine distinct habitats where different animals can be found:
1. Desert
2. Forest
3. Grassland
4. Tundra
5. Wetland
6. Marine
7. Freshwater
8. Mountain
9. Rainforest

### Simulation Process
- **Habitat Creation:** Various habitats are created.
- **Population:** These habitats are populated with animals from the three dietary categories.
- **Simulation:** The simulation runs for an indeterminate number of days, during which animals interact with each other and their environment.

## Key Features
- **Animal Interactions:** Animals engage in various interactions based on their attributes and habitats.
- **Behavioral Simulation:** Each animal's behavior is determined by its specific set of attributes.
- **Dynamic Environment:** The simulation environment changes and evolves over time, reflecting the interactions and behaviors of the animals.

# Getting Started
To get started with the EcoSystem project, follow these steps:

#### Clone the Repository
```bash
git clone https://github.com/your-repo/EcoSystem.git
```

#### Change Directory
```bash
cd EcoSystem
```

#### Run the Simulation
```bash
mvn clean install
mvn exec:java
```

## Running Tests
To run the tests for the EcoSystem project, use the following command:
```bash
mvn test
```