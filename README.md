# note-taking
Note taking application for One Team Anywhere

This is a simple RESTful API for a note-taking application built with Spring Boot and Java 11. The application allows users to create, retrieve, update, and delete notes, which consist of a title and a body.

## Features

- **Create a Note**: Add a new note with a title and body.
- **Retrieve All Notes**: Get a list of all notes.
- **Retrieve a Note by ID**: Fetch a specific note by its ID.
- **Update a Note**: Modify the title and/or body of an existing note.
- **Delete a Note**: Remove a specific note by its ID.

## Endpoints

## This Endpoints will give you all notes 
- **Get : http://localhost:8080/notes

## This Endpoints will give you result per ID
- **Get : http://localhost:8080/notes/{id}

## This Endpoints create a new note
- **Post: http://localhost:8080/notes
Request body
			{
				"title": "Title",
				"body" : "Body"
			}
			
## This Endpoints will update notes per ID
- **Put : http://localhost:8080/notes/{id}
Request body
			{
				"id": 1,
				"title": "Update title",
				"body": "Update body"
			}
## This Endpoints delete a note based on ID
- **Delete: http://localhost:8080/notes/{id}

## Response
201 Created: The note was successfully created.
400 Bad Request: Invalid input data.

## Retrieve All Notes
GET /notes
Response:
200 OK: Returns a list of all notes.

## Retrieve a Note by ID
- **GET /notes/{id}
Response:
200 OK: Returns the note with the specified ID.
404 Not Found: The note with the specified ID does not exist.

## Update a Note
- **PUT /notes/{id}
Response:
200 OK: The note was successfully updated.
404 Not Found: The note with the specified ID does not exist.

## Delete a Note
- **DELETE /notes/{id}
Response:
204 No Content: The note was successfully deleted.
404 Not Found: The note with the specified ID does not exist.

## Data Storage
The application uses an in-memory array to store notes. This means that the notes will be lost when the application stops. 
This setup is ideal for development and testing purposes.

## Error Handling
Note Not Found: Returns a 404 Not Found response if the requested note does not exist.
Invalid Input Data: Returns a 400 Bad Request response if the input data is invalid.

## How to Run the Application
- **Prerequisites
Java 11
Maven

Steps
1. Clone the Repository:
- **git clone https://github.com/yourusername/note-taking-app.git
cd note-taking-app

2. Build the Application:
- **mvn clean install

3. Run the Application:
- **mvn spring-boot:run