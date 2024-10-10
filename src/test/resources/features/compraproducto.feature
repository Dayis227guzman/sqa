#language: es

  Característica: Comprar Producto

    Esquema del escenario: Compra de Productos
      Dado que el usuario se encuentra en la web
      Cuando realiza la compra de "<productos>" con "<cantidadP>"
      Entonces valida valor a pagar

      Ejemplos:
      |cantidadP|productos|
      |2|Évora – 24 rosas|
      |5|Baldado de amor|
