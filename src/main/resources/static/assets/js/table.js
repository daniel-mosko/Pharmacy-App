$(function () {
    $('#tabVsetko').DataTable({
      "language": {
          "url": "https://cdn.datatables.net/plug-ins/1.10.25/i18n/Slovak.json"
      },
      "pageLength": 25,
      "paging": true,
      "lengthChange": false,
      "searching": true,
      "ordering": true,
      "info": true,
      "autoWidth": false,
      "columnDefs": [{ 'orderable': false, 'targets': 6 }],
      "order": [[0, 'asc']]
      });
  });

async function getData() {
  const api_url = "localhost:8080/products";
  const response = await fetch(api_url);
  const data = await response.json();
  return data;
}

console.log(getData());