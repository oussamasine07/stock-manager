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
        <h1 class="text-3xl">New product</h1>
        <a href="/stock-system" class="btn bg-red-700 block py-3 px-6 font-bold text-white rounded">Go back</a>
    </div>

    <div class="container mx-auto">

        <form class="max-w-sm mx-auto">
              <div class="mb-5">
                    <label for="username-success" class="block mb-2 text-sm font-medium text-green-700 dark:text-green-500">Product name</label>
                    <input type="text" class="border border-gray-500" placeholder="Bonnie Green" name="name">
                    <p class="mt-2 text-sm text-green-600 dark:text-green-500"><span class="font-medium">Alright!</span> Username available!</p>
              </div>
              <div>
                    <label for="username-error" class="block mb-2 text-sm font-medium text-red-700 dark:text-red-500">Your name</label>
                    <input type="text" id="username-error" class="bg-red-50 border border-red-500 text-red-900 placeholder-red-700 text-sm rounded-lg focus:ring-red-500 dark:bg-gray-700 focus:border-red-500 block w-full p-2.5 dark:text-red-500 dark:placeholder-red-500 dark:border-red-500" placeholder="Bonnie Green">
                    <p class="mt-2 text-sm text-red-600 dark:text-red-500"><span class="font-medium">Oops!</span> Username already taken!</p>
              </div>
        </form>

    </div>
</body>

</html>