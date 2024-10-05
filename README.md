# LeetCode Solutions - Python & Java

![Image Description](leetcode.png)

## Table of Contents

- [What You'll Find](#what-youll-find)
- [How to Use](#how-to-use)
- [Why Collaborate](#why-collaborate)
- [Looking Ahead](#looking-ahead)
- [Contributing to LeetCode Solutions Repository](#contributing-to-leetcode-solutions-repository)
- [Authors](#authors)
- [Getting Started](#getting-started)
    - [Fork the Repository](#fork-the-repository)
    - [Set Up Your Local Environment](#set-up-your-local-environment)
- [How to Contribute](#how-to-contribute)
    - [Adding a New Solution](#adding-a-new-solution)
    - [Updating an Existing Solution](#updating-an-existing-solution)
- [Code Style](#code-style)
- [Pull Request Process](#pull-request-process)
- [Issue Reporting](#issue-reporting)
- [Code of Conduct](#code-of-conduct)
- [Questions](#questions)


## What You'll Find:

This repository serves as a collaborative platform for our daily LeetCode problem-solving adventures!

* [Java](https://github.com/jizzel/algo-dsa/tree/main/java)
* [Python](https://github.com/jizzel/algo-dsa/tree/main/python)

### What You'll Find:

<ul>
    <li>Python Solutions: Jupyter Notebooks containing your (username) solutions implemented in Python.</li>
    <li>Java Solutions: Separate Java files, each containing a solution to a specific LeetCode problem.</li>
    <li>Main File: A Java main file that can be used to run any of the Java solution files.</li>
    <li>Clear and concise explanations of problem statements, approaches, and code logic.</li>
    <li>Commented and well-formatted code adhering to best practices for readability and maintainability.</li>
    <li>Time and space complexity analysis of solutions using Big O notation.</li>
    <li>Test cases to validate code correctness under various input scenarios.</li>
    <li>Additional notes, insights, or alternative solutions discovered during the problem-solving process.</li>
</ul>


### How to Use:

Run Java Solutions:
* Open the Main Java file.
* Uncomment or modify the main method to specify a target solution
* Run the main file to execute the target solution.
* Or run maven tests to execute test cases.

### Why Collaborate?

- **Shared Learning:** By sharing our solutions, we can learn from each other's approaches, strengthen problem-solving skills, and gain valuable insights.
- **Structured Review:** Jupyter Notebooks and separate Java files provide a structured format for documenting solutions, promoting efficient review and knowledge retention.
- **Diverse Perspectives:** Working in different languages allows us to explore various coding techniques and gain a more comprehensive understanding of problem-solving.

[Wanna `contribute`](#contributing-to-leetcode-solutions-repository)?

### Looking Ahead:

- **Visualizations:** Consider incorporating data visualizations in the Jupyter Notebooks to illustrate complex algorithms or data structures.
- **Time Tracking:** Implement a system to record time spent on each problem for performance analysis.
- **Code Optimization:** We can continuously investigate ways to optimize code for efficiency and readability.
- **Problem Categorization:** Organizing problems by topic or difficulty level can facilitate targeted review and practice.

Feel free to contribute your solutions, insights, and improvements to this collaborative learning space!

<br>
<br>

# Contributing to LeetCode Solutions Repository

Thank you for your interest in contributing to our LeetCode solutions repository! We appreciate your help in making this project more comprehensive and useful for everyone.

## Authors
This project is currently maintained and contributed to by:

[- Joseph Afriyie Attakorah (Java solutions)](https://github.com/jizzel)<br>
[- Abigail Woolley (Python solutions)](https://github.com/ABIGAILDEBBY)

## Table of Contents

- [Getting Started](#getting-started)
- [How to Contribute](#how-to-contribute)
- [Code Style](#code-style)
- [Pull Request Process](#pull-request-process)
- [Issue Reporting](#issue-reporting)
- [Code of Conduct](#code-of-conduct)

## Getting Started

### Fork the Repository

1. Fork this repository to your GitHub account by clicking the "Fork" button at the top right of this page.
2. Clone the forked repository to your local machine using:
   ```bash
   git clone https://github.com/your-username/repo-name.git
   ```
3. Navigate to the project directory:
   ```bash
   cd repo-name
   ```

### Set Up Your Local Environment

Ensure that you have the necessary tools installed to run the LeetCode solutions in your language of choice.

- **Python:** Set up a virtual environment and install required dependencies:
  ```bash
  python -m venv venv
  source venv/bin/activate  # On Windows: venv\Scripts\activate
  pip install -r requirements.txt
  ```

- **Java:** Make sure you have JDK installed and set up on your system. You may use an IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extensions.

## How to Contribute

### Adding a New Solution

1. **Create a new branch**:
   ```bash
   git checkout -b feature/new-solution
   ```

2. **Write the code**:
    - Follow the existing directory structure:
        - Place Python solutions in the `python/` directory.
        - Place Java solutions in the `java/` directory.

3. **Add test cases**:
    - Include test cases in the same file (for simplicity) or in a dedicated `tests/` directory.

4. **Commit your changes**:
    - Write clear and concise commit messages:
   ```bash
   git add .
   git commit -m "feat: Add solution for LeetCode 0020: Valid Parentheses"
   ```

5. **Push your branch**:
   ```bash
   git push origin feature/new-solution
   ```

6. **Create a Pull Request**:
    - Go to the repository on GitHub, and you’ll see an option to create a Pull Request (PR).
    - Fill in the PR template, including details about the problem solved, the approach used, and any other relevant information.

### Updating an Existing Solution

1. Follow the same steps as adding a new solution, but instead of creating a new file, modify the existing one.
2. Clearly describe what changes you made and why in the commit message and PR description.

## Code Style

- **Python:**
    - Use descriptive variable names.
    - Add comments to explain the logic and steps in your code.
    - Ensure your code is PEP8 compliant.
    - Maintain consistency with existing Python code in the repository.

- **Java:**
    - Follow Java naming conventions (e.g., `camelCase` for variables, `PascalCase` for classes).
    - Add comments to explain the logic and steps in your code.
    - Ensure your code is formatted properly and follows the standard Java coding conventions.

## Pull Request Process

1. Ensure that your code passes all tests before submitting the PR.
2. Fill out the PR template completely and accurately.
3. Await review from project maintainers. They might request changes or provide feedback.
4. Once your PR is approved, it will be merged into the main branch.

## Issue Reporting

If you encounter any issues or bugs while using the repository, please feel free to open an issue on GitHub. Provide a detailed description of the issue, steps to reproduce it, and any relevant screenshots or logs.

## Code of Conduct

This project adheres to the [Contributor Covenant Code of Conduct](https://www.contributor-covenant.org/). By participating, you are expected to uphold this code. Please report unacceptable behavior to the repository maintainers.

---

## Questions?

If you have any questions about contributing or need help, feel free to reach out by opening an issue or contacting the maintainers directly.
