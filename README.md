# S1.02-Exceptions-Nivel1-Ej1

#Summary: exercise description

Create a class called "Product" with the attributes name and price, and another class called "Sale". This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom exception "VendaBuidaException" and displays on the screen "To make a sale you must first add products" if the product collection is empty. If the collection has products, then it must traverse the collection and save the sum of all the prices of the products in the attribute total price of the sale.

The custom exception "VendaBuidaException" must be a child of the Exception class. We must pass the message "To make a sale you must first add products" to its constructor and when we capture the exception, we must display it on the screen with the exception's getMessage() method.

Write the code necessary to generate and capture an exception of type "IndexOutOfBoundsException".

#Technologies Used

java 22

#Requirements

Programming language: Java 22

Development environment: IntelliJ IDEA

#How to run it

Clone the repository or download the zip file and run it in your favorite IDE.

#Contribution

Contributions are welcome! Please follow these steps to contribute:

-Fork the repository 
-Create a new branch git checkout
-b feature/NewFeature
-Make your changes and commit them: git commit 
-m 'Add New Feature' 
-Upload the changes to your branch: git push origin feature/NewFeature 
-Make a pull request