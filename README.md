# Spring-Boot-Twitter
 Written a server by using SpringBoot Java and integrate open APIs of Twitter. On the basis of that integration, expose your RESTful APIs as follows with JSON response. Authentication Method: Header-based authentication with random client id and random client secret.

## How to Run Project
1. Import Project
2. Run as -> Spring Boot App
3. Server port is 8080
4. Use the URL in postman for all user  http://localhost:8080/api/users
   ## output
   step1: Use default issuer for access tocken {https://dev-64151434.okta.com/oauth2/default}
   ![Screenshot 2023-03-26 114637](https://user-images.githubusercontent.com/73180409/227787292-1197a508-fd9d-4b53-8007-30a1ac869c83.png)
   
   step2: For access tocke we need to set authorization header 
   a) type-> basic Auth
   b) username-> Client ID
   c) password-> CLIENT SECRETS
   
   ![Screenshot 2023-03-26 114822](https://user-images.githubusercontent.com/73180409/227787381-5ceaddff-2898-412c-8f5d-c8bba4d986c9.png)
   
   d) in body we need to enter key and value 
   ![image](https://user-images.githubusercontent.com/73180409/227787519-a2e4557a-c6e5-4566-bab5-d7d1bf767092.png)
   
   After authorization header will be automatically generated when you send the request.
  ## Access tocken
  ![Screenshot 2023-03-26 115257](https://user-images.githubusercontent.com/73180409/227787690-243802b3-432b-41cc-9995-17437a3fcc87.png)
  
  and final output
  ![image](https://user-images.githubusercontent.com/73180409/227787760-314c98b9-ae42-4b03-87f1-820657076e7e.png)

  

5. Use the URL in postman for one user  http://localhost:8080/api/{id}  {id use 1 to 30}
example of url -> http://localhost:8080/api/5, http://localhost:8080/api/1
![image](https://user-images.githubusercontent.com/73180409/227787838-d8190cf1-8a8d-4f50-959c-cca5ef852404.png)


# Extra Client ID & CLIENT SECRETS

client secreat ID -> ZQoblISCj2LUEhbpcVHmwEVgR1RW4520bit2EM33
Client ID -> 0oa8v275b7Q8zcvWe5d7


Client ID -> 0oa8v3fzcmm3Hn5El5d7
CLIENT SECRETS -> OUnfxA4V9_ccTdOpMeaZvu9N-A6VmQQf_rKXoorE

# Still waiting for approval
![image](https://user-images.githubusercontent.com/73180409/227788671-ee0132ac-5ee9-47b2-8c0e-9f3245bf5cea.png)


