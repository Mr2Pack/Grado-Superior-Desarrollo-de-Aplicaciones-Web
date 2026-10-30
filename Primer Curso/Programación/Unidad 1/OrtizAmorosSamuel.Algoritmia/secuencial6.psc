Algoritmo secuencial6
	Definir precio_original, precio_venta, operacion, operacion2 Como Real
	
	Escribir "Introduce el precio de venta del artículo: "
	Leer precio_venta
	Escribir "Introduce el precio del artículo: "
	Leer precio_original
	
	operacion <- precio_venta - precio_original
	operacion2 <- operacion/100*100
	
	Escribir "El porcentaje de descuento aplicado es: ", operacion2, "%"
FinAlgoritmo
