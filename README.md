## TooDo App

## Overview

Introducing TooDo, an effective and user-friendly Android application that makes task management easier. Users may simply arrange their activities, set due dates, assign priority levels, categorize tasks, and track their progress thanks to a clear and simple interface. The application makes use of SQLite-powered local storage to guarantee that tasks are always accessible and safely kept. Users can record and monitor important information by giving each task a label and a thorough description.

## Key Features

-**Due Date And Time:** Establish due dates for assignments to maintain organization and timeliness.
-**Priority Levels:** To effectively prioritize tasks, assign the following priority levels: Low, Medium, and High.
-**Category:** Sort duties according to various facets of life or work.
-**Status of Task:** To keep track of tasks' progress, mark them as New, In Progress, or Completed.
-**Title and Description:** Give each task a thorough explanation.


## Technical Specifications

- **Platform:** Android
- **Language:** Java
- **Local Storage Solution:** SQLite
- **User Interface:** Clean and responsive design using XML.

## Project Structure

com
|-- example
    |-- TooDo
        |-- activities
        |   |-- AllTagsActivity.java
        |   |-- AppSettingsActivity.java
        |   |-- CompletedTodosActivity.java
        |   |-- MainActivity.java
        |
        |-- adapters
        |   |-- CompletedTodoAdapter.java
        |   |-- PendingTodoAdapter.java
        |   |-- TagAdapter.java
        |
        |-- helpers
        |   |-- DatabaseHelper.java
        |   |-- SettingsHelper.java
        |   |-- TagDBHelper.java
        |   |-- TodoDBHelper.java
        |
        |-- models
            |-- CompletedTodoModel.java
            |-- PendingTodoModel.java
            |-- TagsModel.java


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
   git clone https://github.com/BhanukiranG/Toodo.git
