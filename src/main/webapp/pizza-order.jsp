<%--
  Created by IntelliJ IDEA.
  User: justinhollmer
  Date: 11/2/22
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

    <form method="post" action="http://localhost:8080/pizza-order">
        <label for="crust-type">Crust: </label>
        <input name="crust-type" id="crust-type">
        <label for="sauce-type">Sauce: </label>
        <input name="sauce-type" id="sauce-type">
        <label for="size">Size: </label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <label>Toppings: </label>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="pepperoni" name="topping" value="pepperoni">
        <label for="sausage">Sausage</label>
        <input type="checkbox" id="sausage" name="topping" value="sausage">
        <label for="bacon">Bacon</label>
        <input type="checkbox" id="bacon" name="topping" value="bacon">
        <label for="address">Address: </label>
        <input type="text" name="address" id="address">
        <button type="submit">Submit</button>
    </form>

</body>
</html>
