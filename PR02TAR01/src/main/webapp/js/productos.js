window.onload = () => {
    document.getElementById('btnMostrar').onclick = mostrarProductos;
    document.getElementById('btnEliminar').onclick = eliminarProducto;
};

const listaProductos = document.getElementById('listaProductos');
const mensaje = document.getElementById('mensaje');

const mostrarProductos = () => {
    fetch('MostrarProductosServlet')
        .then(res => res.json())
        .then(data => {
            listaProductos.innerHTML = '';
            if (data.length === 0) {
                listaProductos.innerHTML = '<p>No hay productos.</p>';
                return;
            }
            data.forEach(producto => {
                listaProductos.innerHTML += `
                    <label>
                        <input type="radio" name="productoSeleccionado" value="${producto.id}">
                        ${producto.nombre} - ${producto.descripcion} - $${producto.precio}
                    </label>`;
            });
        })
        .catch(() => mensaje.innerText = 'Error al mostrar productos');
};

const eliminarProducto = () => {
    const seleccionado = document.querySelector('input[name="productoSeleccionado"]:checked');
    if (!seleccionado) {
        mensaje.innerText = 'Selecciona un producto para eliminar';
        return;
    }
    fetch('EliminarProductoServlet', {
        method: 'POST',
        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
        body: `id=${seleccionado.value}`
    })
    .then(res => res.json())
    .then(data => {
        mensaje.innerText = data.mensaje;
        mostrarProductos();
    })
    .catch(() => mensaje.innerText = 'Error al eliminar producto');
};