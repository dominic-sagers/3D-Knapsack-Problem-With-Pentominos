# 3D-Knapsack-Problem-With-Pentominos

This project seeks to explore the famed knapsack problem in a 3D context using "parcels" shaped as pentominoes (shapes only one size unit larger than those of the famed tetrominoes from Tetris) holding different values to maximise value while filling a theoretical cargo space with various algorithms.

## Motivation

The 3D knapsack problem asks: given a fixed cargo space and a set of 3D pieces with associated values, how do you pack the space to maximise total value? This project tackles it with two families of pentomino-shaped parcels — A/B/C and L/P/T — each with configurable quantities and per-unit values. Two algorithmic strategies are implemented: a heuristic best-value search with a time limit, and an exact cover solver based on Donald Knuth's Dancing Links (DLX) / Algorithm X. The result is displayed in an interactive 3D viewer built from scratch in Java Swing.

## GUI and Features

The application launches a menu ("Cargo-Space Optimizer") where you configure parcels and trigger a solve. The features supported are as follows:

- A Swing-based 3D renderer (`Swing3D` package) that displays the packed cargo space interactively.
- Two parcel families, each configurable with a count and a per-unit value:
  - **A, B, C** — three distinct pentomino-shaped parcel types.
  - **L, P, T** — three further pentomino-shaped parcel types.
- Three solving modes:
  - **Fill with A/B/C** — heuristic best-value search (time-limited to ~30 seconds) using a modified Algorithm X (`CargoXBest`), maximising total value without requiring a perfect fill.
  - **Fill with L/P/T** — same heuristic approach applied to the L/P/T parcel family.
  - **Exact fill with L/P/T** — exact cover via Dancing Links (`CargoX`), finding a solution that fills the 33×8×5 cargo space completely.
- All parcel rotations are enumerated and considered during solving.

## How to Run

### Prerequisites

- Java 8 or later (the project uses standard `javax.swing` and `java.awt` — no external dependencies).

### Running the Application

1. Compile all source files from the project root, preserving the package structure:
   ```
   javac -d out Run.java backend/*.java frontend/*.java Swing3D/*.java
   ```
2. Run the entry point:
   ```
   java -cp out Run
   ```
3. The **Cargo-Space Optimizer** menu will appear. Enter the number and value of each parcel type you want to use, then click one of the three solve buttons.
   - A dialog will warn you that processing may take up to 30 seconds — click OK to proceed.
4. The 3D viewer will open and display the packed cargo space once a solution is found.

### Navigating the 3D Viewer

| Input | Action |
|---|---|
| Arrow keys | Rotate the cargo space |
| Mouse drag | Rotate the cargo space |
| `R` key | Reset rotation |
| `X` / `Z` keys | Zoom in / zoom out |

### Notes

- If no solution is found (exact mode only), a message is printed to the console.
- The heuristic solver keeps track of the best solution found within the time limit, so it always returns *something* even for large inputs.
- Input validation ensures values are positive and counts are non-negative before a solve is triggered.
