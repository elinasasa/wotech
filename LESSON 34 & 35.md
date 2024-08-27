#LESSON 34
#14.08

<img width="1387" alt="Screenshot 2024-08-26 at 20 34 28" src="https://github.com/user-attachments/assets/f1b5d14d-75cd-4d88-a4a3-076fd186c206">

```Java
package com.datorium.Datorium.API.DTOs.Services;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Repo.UserRepo;

public class UserService {
    private UserRepo userRepo;
    public UserService(){
        userRepo = new UserRepo();
    }
    public int add (User user){
        return userRepo.add(user); // calls a user service, user service created a new repo.
    }
}

```

TEAMWORK

1.Create UserController endpoint to get all users
2.Create a UserService method to get all users
3.Create a UserRepository method to get all users
4.Add user with a postman
5.Try to get all the users with GET method
6.Repeat step 4 and 5
