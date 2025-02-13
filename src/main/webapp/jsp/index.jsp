<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://unpkg.com/@tailwindcss/browser@4"></script>
    <title>Home</title>
</head>

<body>
    <div class="container flex justify-between items-center mb-5 py-3 mx-auto">
        <h1 class="text-3xl">Welcome to product manager</h1>
        <a href="#" class="btn bg-blue-700 block py-3 px-6 font-bold text-white rounded">New product</a>
    </div>


    <div class="container mx-auto">
        <div class="relative overflow-x-auto">
            <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
                <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                    <tr>
                        <th scope="col" class="px-6 py-3">
                            Product name
                        </th>
                        <th scope="col" class="px-6 py-3">
                            Description
                        </th>
                        <th scope="col" class="px-6 py-3">
                            Quantity
                        </th>
                        <th scope="col" class="px-6 py-3">
                            Unit Price
                        </th>
                        <th scope="col" class="px-6 py-3">
                            Category
                        </th>
                        <th scope="col" class="px-6 py-3">
                            Actions
                        </th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="product" items="${ productList }">
                        <tr class="bg-white border-b dark:bg-gray-800 dark:border-gray-700 border-gray-200">
                            <th scope="row" class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                                <c:out value="${product.name}" />
                            </th>
                            <td class="px-6 py-4">
                                <c:out value="${product.description}" />
                            </td>
                            <td class="px-6 py-4">
                                <c:out value="${product.qty}" />
                            </td>
                            <td class="px-6 py-4">
                                <c:out value="${product.unitPrice}" />
                            </td>
                            <td class="px-6 py-4">
                                <c:out value="${product.category}" />
                            </td>
                            <td class="px-6 py-4">
                                crud icons
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>