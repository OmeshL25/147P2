QuickOrder
Our project streamlines the entire restaurant experience by transforming slow, error-prone order-taking into a few simple keystrokes. Instead of flipping through a paper menu or manually jotting down each price, the server (or customer) selects items directly from on-screen “Drinks” and “Main Course” menus, instantly adding their costs to a running subtotal. When the meal is finished, you’re immediately prompted for the tip, and with one final calculation the system outputs the exact total—including tax and tip—eliminating any guesswork or mental math. By automating these steps, the program not only speeds up the ordering process but also ensures the checkout is fast, accurate, and stress-free for both guests and staff alike.

Omesh- Project Manager 
Goodluck- Programmer 
Sonia- Programmer
Muhammed- Software Engineer




JavaDocs are used in the project to create professional, easy-to-read documentation directly from Java source code comments. By adding structured JavaDoc comments, developers can generate HTML documentation that explains classes, methods, and parameters. Once generated, the documentation can be viewed locally through index.html or published online using GitHub Pages by setting the source folder to /docs in the repository’s settings. This makes the documentation accessible via a live URL, improving collaboration, transparency, and understanding of the project.





This program streamlines the entire restaurant experience by transforming slow, error-prone order-taking into a few simple keystrokes. Instead of flipping through a paper menu or manually jotting down each price, the server (or customer) selects items directly from on-screen “Drinks” and “Main Course” menus, instantly adding their costs to a running subtotal. When the meal is finished, you’re immediately prompted for the tip, and with one final calculation the system outputs the exact total—including tax and tip—eliminating any guesswork or mental math. By automating these steps, the program not only speeds up the ordering process but also ensures the checkout is fast, accurate, and stress-free for both guests and staff alike.

UML
Explanation:
Main: The central class that drives the program. It interacts with both the calculation class (for price calculation) and the menu classes (DrinksMenu and MainMenu).

calculation: Handles the logic for calculating the total price with taxes and tips using double.

Menu (abstract): The base class for menus. It defines an abstract method displayMenu() that is implemented by both DrinksMenu and MainMenu.

DrinksMenu and MainMenu: Concrete classes that extend Menu and implement the displayMenu() method to show their respective menus.



