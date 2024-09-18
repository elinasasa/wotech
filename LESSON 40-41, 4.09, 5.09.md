# LESSON 41
5.09.

Data set: https://www.geeksforgeeks.org/introduction-to-set-data-structure/

can access just always the first data, so you can access it. its gets destroyed, then the ifrts next data is accessible and so on.
Other sets to look at FILO and FIFO datasets.

## Refactoring

if you re-write the fundament of the code.

main drive behind refactoring is cleaning up the code.


![Screenshot 2024-09-12 at 19 02 37](https://github.com/user-attachments/assets/341cffd0-493c-4882-b822-ed8c065d878f)
this is for the DatoriumAPI code in IntelIJ


You can create a html file and copy in the code there.

Read about hibernate / ORM

# LESSON 4smth

red dot is colled a breakpoint, the programme stops exactly there. thats where the code breaks. then you use debug button.
its useful bcs you are able to see what function receivs smth.
then we can see what kind of data we get. WHY its important - to understand if it works correctly, find edge cases. 

<img width="905" alt="Screenshot 2024-09-18 at 18 50 21" src="https://github.com/user-attachments/assets/068bf447-f9a9-4c7f-9198-e5ca69e1ce1b">


TDD - TestDrivenDevelopment

unit test naming convention java - usually each company have their own ways

<img width="908" alt="Screenshot 2024-09-18 at 19 15 52" src="https://github.com/user-attachments/assets/8f43aee3-53fb-47c6-a823-45ee28b6fab3">

```java
//TEST

package com.datorium.Datorium.API;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DatoriumApiApplicationTests {

	@Test
	void WHEN_nameIsOskarsAndSurnameIsKlamanis_THEN_Result_OskarsKlamanis() {
		//Arrange -> prepare data and services

		var userService = new UserService();

		//Act -> do some action, usually call a method
		var fullName = userService.getFullName("Oskars", "Klamanis");

		// Assert -> test wether or not the result is correct

		Assert.isTrue(fullName.equals("Oskars Klaumanis"), "Hey, the name should be with a space inbetween and should contain both name and surname");
	}
// WHEN_nameIsOskarsAndSurnameIsKlamanis_THEN_Result_OskarsKlamanis - this is the maning convention
}

```

UNITEST
