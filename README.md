# Virtuo Read  Application REST API
   
    This application perform CRUD operations (Create,Read,Update,Delete) operations is a software application designed to efficiently manage the operations and data associated with a library. 

## Technology Stack

The application is built using the following technologies:

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* MySQL
  
## Application Modules

The application consists of the following modules:

* Login
* Registration
* Category to view books or donate books.
## Key Features
 This application provides several features for reader and staff:
 * **Staff Features:**
    * Access to reader data.
    * They can create unique id for each books to differentiate from other systems.
  * **Reader Features:**
    * Access to different books using unique id.
    * Access their profile that provide them to update details on profile.
  
## Usage
### Login
- `GET localhost:8080/reg`: Displays the registration form.
- `POST localhost:8080/home`: Handles registration requests and redirects to the home page.

### Login


- Endpoint: `/reg`
  - Description: Displays the registration form.
  - Method: GET

- Endpoint: `/home`
  - Description: Handles registration requests and redirects to the home page.
  - Method: POST 
 
