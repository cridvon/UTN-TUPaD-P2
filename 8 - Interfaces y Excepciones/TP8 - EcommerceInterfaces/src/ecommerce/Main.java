package ecommerce;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cristian", "cristian@mail.com");

        Producto p1 = new Producto("Mouse", 1500);
        Producto p2 = new Producto("Teclado", 2500);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Pago con tarjeta (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito();
        double montoConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(montoConDescuento);

        // Cambiar estado del pedido
        pedido.cambiarEstado("Enviado");
    }
}
