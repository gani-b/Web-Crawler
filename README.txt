In this Assignment I created two java files to achieve the desired result.

First is Result.java which is a file that contains the Result object that is created for every result.
This object responds to:
getname() which will return a String object of name of the product
getVendor() which will return a String object of the vendor of the product
getPrice() which will return a String object of the price of the product

I also have a Parser.java which is a file that contains a Parser object whose job is to parse a html page based on a user input
the method getProductDetails(String search,String page) is a method that will print a number of products' details and return an ArrayList of all the results in a series of Result objects.
the method retrievePage(String search) is a method that will get the page of sears.com based on the search term
the method getNumProducts(String search) is a method that will return a String object of the total number of products
the method retrieveUrlFragment(String url) is a method that will return a String object based on the given url fragment

The parsing in this project is done by using Jsoup which is an API to parse html.

The Result class is located inside the Web.jar and the Jsoup is located inside the jsoup-1.7.2.jar

Both of them are located inside the lib folder.

The generated jar file is called Assignment.jar

To do the first query do java -jar Assignment.jar <search term>
i.e
java -jar Assignment.jar "baby stroller"

To do the second query do java -jar Assignment.jar <search-term> <page-number>
i.e
java -jar Assignment.jar "baby stroller" 3

The first query will return a String of the total number of product

The second query will print out the products' details in the specified page while returning an ArrayList of Result objects


