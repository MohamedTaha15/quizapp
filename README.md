first commit was to establish the app structure and the postgres databse connection after creating the database and connecting to it.

App can save data predetermined in the config file to query on the data 
it also returns the list of saved data 


![adding data in config and return them all](https://github.com/MohamedTaha15/quizapp/assets/91467334/4188c709-ac42-41b5-9680-e5257316c304)
![2](https://github.com/MohamedTaha15/quizapp/assets/91467334/b4f4a639-04c0-496b-b782-8bc47269738b)



Added CRUD operations and a category operation which returns questions depending on the diffuculty level provided 

1- Create 


![addquestion 1](https://github.com/MohamedTaha15/quizapp/assets/91467334/c7a15a0a-4696-4732-81f4-c8168083bfc5)
![addquestion 2](https://github.com/MohamedTaha15/quizapp/assets/91467334/a50fec14-85e0-488a-bcc5-d4a74853f46c)
![addquestion 3](https://github.com/MohamedTaha15/quizapp/assets/91467334/d7595be3-8899-4f91-b7b2-127ceb2c7181)



2- Read 


![2](https://github.com/MohamedTaha15/quizapp/assets/91467334/318353c8-cb20-4172-a44f-42c84bde3c12)



3-Update 
  if update fails due to entering a non existant id 

  
  ![update failed](https://github.com/MohamedTaha15/quizapp/assets/91467334/d6248149-c845-4177-b265-bf353c38bcad)

  if update is successful 

  
  ![update succesful ](https://github.com/MohamedTaha15/quizapp/assets/91467334/055173cd-ae0a-49b1-84a5-ee070a398455)
  ![update succesful 2](https://github.com/MohamedTaha15/quizapp/assets/91467334/e775006b-58cd-4d59-b89a-a60f5bf24b73)

4-Delete 
  if delete fails due to entering a non exitant id 

  
  ![delete failed](https://github.com/MohamedTaha15/quizapp/assets/91467334/f361e399-1a17-4534-aaf0-86bf73409ed5)

  if delete is succesful 

  
  ![delete success 1](https://github.com/MohamedTaha15/quizapp/assets/91467334/0005b039-9945-4ee1-b0f2-8c3c3dad9e56)
  ![delete success 2](https://github.com/MohamedTaha15/quizapp/assets/91467334/3dfd1703-cf37-48b6-a376-da84202f402a)



Added Quiz entity and established all CRUD operations for it

1- Create 
  if creation is succesful 

  
  ![creating quiz success](https://github.com/MohamedTaha15/quizapp/assets/91467334/db9a6a9b-5b71-4d67-8602-1015d496254f)
  ![creating quiz success 2](https://github.com/MohamedTaha15/quizapp/assets/91467334/ac2041b3-4b12-4c9e-9755-44e70bed5a41)


  if creation failes


  ![creating quiz failed](https://github.com/MohamedTaha15/quizapp/assets/91467334/5cbc72e0-dcc6-430f-a8ea-99ad2e055dcc)



2- Read 


![get quizes success](https://github.com/MohamedTaha15/quizapp/assets/91467334/9bde8c0e-9c75-48dd-af3d-75686dfaf682)


3- Update
  if update successful


  ![update a quiz success](https://github.com/MohamedTaha15/quizapp/assets/91467334/0edc2e45-90c1-4b9d-b87f-3bf0359dd4b9)


  if update fails


  ![update a quiz failed](https://github.com/MohamedTaha15/quizapp/assets/91467334/c2e3c617-64e1-48c2-918f-7088d982969c)



4- Delete 
  if delete is successful 


  ![delete quiz success](https://github.com/MohamedTaha15/quizapp/assets/91467334/56dbba15-84fb-4f13-b3cd-e19a68395a94)


  if delete fails


  ![delete quiz failed](https://github.com/MohamedTaha15/quizapp/assets/91467334/fa9bf64c-bb96-409b-bfcd-99c1b6650f3b)



