function search() {
   let listElements = document.querySelectorAll(`ul#towns li`);
   let resultElement = document.getElementById(`result`);
   let searchText = document.getElementById(`searchText`).value;
   let matches = 0;

   for (const iterator of listElements) {
      iterator.style.fontWeight = `normal`;
      iterator.style.textDecoration =- ``;
   }

   for (const iterator of listElements) {
      let text = iterator.textContent;

      if (text.match(searchText)) {
         matches ++;
         iterator.style.fontWeight = `bold`;
         iterator.style.textDecoration = `underline`;
      }
   }

   resultElement.textContent = `${matches} matches found`;
}
