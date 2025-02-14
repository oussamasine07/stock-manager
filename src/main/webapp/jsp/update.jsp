<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://unpkg.com/@tailwindcss/browser@4"></script>
    <title>Create</title>
</head>

<body>
    <div class="container flex justify-between items-center mb-5 py-3 mx-auto">
        <h1 class="text-3xl">Update product</h1>
        <a href="/stock-system" class="btn bg-red-700 block py-3 px-6 font-bold text-white rounded">Go back</a>
    </div>

   <div class="container mx-auto flex justify-center items-center">
           <form class="w-4/5" action="/stock-system/update?id=<c:out value='${product.id}'/>" method="POST">
               <div class="grid grid-cols-10 gap-3">
                   <div class="w-full col-span-4">
                       <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-product-name">
                       Product Name
                       </label>
                       <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-300 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white" id="grid-product-name" type="text" placeholder="Product Name" name="name" value="<c:out value='${product.name}'/>">
                       <p class="text-red-500 text-xs italic">Please fill out this field.</p>
                   </div>
                   <div class="w-full col-span-2">
                       <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-product-qty">
                       Quantity
                       </label>
                       <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-300 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white" id="grid-product-qty" type="text" placeholder="Product Quantity" name="qty" value="<c:out value='${product.qty}'/>">
                       <p class="text-red-500 text-xs italic">Please fill out this field.</p>
                   </div>
                   <div class="w-full col-span-2">
                       <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-product-price">
                       Unit Price
                       </label>
                       <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-300 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white" id="grid-product-price" type="text" placeholder="Price" name="unitPrice" value="<c:out value='${product.unitPrice}'/>">
                       <p class="text-red-500 text-xs italic">Please fill out this field.</p>
                   </div>
                   <div class="w-full col-span-2">
                       <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-product-category">
                           Product Category
                       </label>
                       <select class="block appearance-none w-full bg-gray-200 border border-gray-200 text-gray-700 py-3 px-4 pr-8 rounded leading-tight focus:outline-none focus:bg-white focus:border-gray-500" name="category">
                           <option value="tech" <c:if test="${product.category == 'tech'}"> selected </c:if>>Technology</option>
                           <option value="clothing" <c:if test="${product.category == 'clothing'}"> selected </c:if>>Clothing</option>
                           <option value="kitchen" <c:if test="${product.category == 'kitchen'}"> selected </c:if>>Kitchen</option>
                       </select>
                   </div>
                   <div class="w-full col-span-10">
                       <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-product-name">
                       Product Discription
                       </label>
                       <textarea class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-300 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white" id="grid-product-name" type="text" placeholder="Product Description" name="description"><c:out value='${product.description}'/></textarea>
                   </div>
                   <div class="w-full col-span-10">
                        <input class="appearance-none block w-full bg-blue-700 text-white border border-gray-300 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white" id="grid-product-price" type="submit" placeholder="Price" name="unitPrice" value="Update Product">
                   </div>
               </div>
           </form>
       </div>
</body>

</html>