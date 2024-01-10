# TooDo App

## Overview

Welcome to TooDo, a user-friendly and efficient Android application designed to simplify task management. With a clean and intuitive interface, users can organize their tasks, set due dates, assign priority levels, categorize tasks, and monitor their progress easily. The app leverages local storage powered by SQLite, ensuring that tasks are securely stored and accessible at all times. Each task includes a title and a detailed description, allowing users to capture and track essential information.

## Key Features

- **Due Date:** Set deadlines for tasks to stay organized and time-conscious.
- **Priority Levels:** Assign priority levels (Low, Medium, High) for effective task prioritization.
- **Category:** Categorize tasks based on different aspects of life or work.
- **Task Status:** Mark tasks as New, In Progress, or Completed to monitor their progress.
- **Title and Description:** Provide detailed information for each task.

## Technical Specifications

- **Platform:** Android
- **Language:** Java
- **Local Storage Solution:** SQLite
- **User Interface:** Clean and responsive design.

## Project Structure

The project follows a modular structure with key components:
- **MainActivity.java:** Core functionality, displaying and managing tasks.
- **TaskModel.java:** Model class representing task attributes.
- **TaskDbHelper.java:** SQLite database helper for task data management.
- **TaskAdapter.java:** Adapter for displaying tasks in a RecyclerView.
- **TaskActivity.java:** Activity for adding or editing tasks.
- **DatePickerFragment.java:** Fragment for selecting due dates.

## Instructions for Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/toodo-app.git
