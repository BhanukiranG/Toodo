# TooDo App

# Overview

Introducing TooDo, an effective and user-friendly Android application that makes task management easier. Users may simply arrange their activities, set due dates, assign priority levels, categorize tasks, and track their progress thanks to a clear and simple interface. The application makes use of SQLite-powered local storage to guarantee that tasks are always accessible and safely kept. Users can record and monitor important information by giving each task a label and a thorough description.

# Key Features

-**Due Date And Time:** Establish due dates for assignments to maintain organization and timeliness.
-**Priority Levels:** To effectively prioritize tasks, assign the following priority levels: Low, Medium, and High.
-**Category:** Sort duties according to various facets of life or work.
-**Status of Task:** To keep track of tasks' progress, mark them as New, In Progress, or Completed.
-**Title and Description:** Give each task a thorough explanation.


# Technical Specifications

- **Platform:** Android
- **Language:** Java
- **Local Storage Solution:** SQLite
- **User Interface:** Clean and responsive design using XML.

# Project Structure

![Screenshot 2024-01-10 121332](https://github.com/BhanukiranG/Toodo/assets/96532063/587364d3-a6d4-4c9e-b3cc-599293902b86)

The project follows a modular structure with key components:
### Activities:

- **AllTagsActivity.java:** Manages the display of all tags in the app.
- **AppSettingsActivity.java:** Handles application settings and configurations.
- **CompletedTodosActivity.java:** Displays completed tasks.
- **MainActivity.java:** Core functionality for displaying and managing tasks.

### Adapters:

- **CompletedTodoAdapter.java:** Adapts completed tasks for display in a RecyclerView.
- **PendingTodoAdapter.java:** Adapts pending tasks for display in a RecyclerView.
- **TagAdapter.java:** Adapts tags for display in a RecyclerView.

### Helpers:

- **DatabaseHelper.java:** Manages SQLite database operations for the app.
- **SettingsHelper.java:** Assists with handling and managing app settings.
- **TagDBHelper.java:** Provides database operations related to tags.
- **TodoDBHelper.java:** Handles database operations related to tasks.

### Models:

- **CompletedTodoModel.java:** Represents the model for completed tasks.
- **PendingTodoModel.java:** Represents the model for pending tasks.
- **TagsModel.java:** Represents the model for tags.

# Instructions for Running the Application

### Prerequisites:

1. **Android Studio:** Ensure that you have Android Studio installed on your development machine.

2. **SDK Platforms and Tools:** Make sure you have the necessary Android SDK Platforms and Tools installed via the SDK Manager in Android Studio.

### Steps to Run the TooDo Application:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/BhanukiranG/Toodo.git

### Build the Project:

1. Once the project is open, wait for Android Studio to sync and build the project.
2. Resolve any dependencies or issues reported by Android Studio.

### Configure Emulator or Connect a Physical Device:

1. Set up an Android Emulator using the AVD Manager or connect a physical Android device to your computer.

### Run the Application:

1. Click on the "Run" button (green play button) in the toolbar.
2. Choose the target device (emulator or connected device) where you want to run the application.

## Screenshots
