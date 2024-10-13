package Oct.ex_111024.Encapsulation;

public class Lab93 {

    // Encapsulation

    /*
    Encapsulation is one of the four fundamental OOP (Object-Oriented Programming) concepts.

    Definition:
    It refers to the bundling of data (variables) and the methods (functions) that operate on the data into a single unit or class.
    It restricts direct access to some of an object's components and can prevent the accidental modification of data.

    Key Points:

    1. **Data Hiding**:
       - Encapsulation allows hiding the internal state of the object from the outside world.
       - It protects an object’s internal state by keeping fields private and allowing controlled access via public methods (getters and setters).

    2. **Private Access Modifiers**:
       - In encapsulation, we typically declare variables as `private` to prevent direct access.
       - The variables are only accessible and modifiable through methods (getters and setters) that are public.
       - Example: `private int age;`

    3. **Getter and Setter Methods**:
       - `getters` are used to read the value of private variables, and `setters` are used to modify the value of private variables.
       - The setters can include validation logic to control the way values are set.
       - Example:
         ```java
         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             if (age > 0) {
                 this.age = age;
             }
         }
         ```

    4. **Advantages**:
       - **Security**: By hiding the internal state, encapsulation protects the integrity of an object's data.
       - **Flexibility**: The internal implementation can be changed without affecting outside code that relies on the class.
       - **Control**: It allows for better control over data by adding logic to getters/setters (e.g., validation).

    5. **Real-World Example**:
       - A real-world example of encapsulation is a bank account. You can deposit or withdraw money, but the actual balance is hidden from direct access. You can only interact with the balance through predefined methods like `deposit` or `withdraw`.

    Summary:
    - To achieve encapsulation, declare class variables as `private` and provide public methods (`getters` and `setters`) for controlled access and modification.
    */

}

