package Complements;

import Models.ClientDao;

public class Messages {

    public static void welcomeMessage() {
        System.out.println("Bienvenido al sistema de compras"); }

    public static void farewellMessage() {
        System.out.println("Tenga un buen dia hasta la proxima");}

    public static void invalidPrice() {
        System.out.println("==============================");
        System.out.println("Precio invalido"); }

    public static void clientList() {
        System.out.print(ClientDao.printlist());}

    public static void updateProductClient() {
        System.out.println("==============================");
        System.out.print("1.Registar Cliente \n 2.Modificar Cliente \n4.Borrar Cliente \nIngresa tu opcion: "); }

    public static void updateClientOptions() {
        System.out.println("==============================");
        System.out.print(
                "Qué desea modificar:\n1.Nombres \n2.Apellidos \n3.Dirección \n4.Correo Electrónico \n5.Telefono \nIngresa tu opcion: ");}

    // sirve para pedir el nombre
    public static void requestName() {
        System.out.println("==============================");
        System.out.print("Ingrese nombre cliente:  ");}

    public static void requestSurname() {
        System.out.println("==============================");
        System.out.print("Ingrese apellido cliente:  ");}

    // sirve para pedir el id
    public static void requestId() {
        System.out.println("==============================");
        System.out.print("Ingrese Id cliente: ");}

    // Un por si acaso se uso el tipo e Id
    public static void requestTypeId() {
        System.out.println("==============================");
        System.out.print("Eliga tipo de documento.\n1.Cedula\n2.RUC\nIngresa tu opcion:");}

    public static void confirmationTypeId() {
        System.out.print("Ha elegido"); }

    // sirve para pedir el telefono
    public static void requestPhone() {
        System.out.println("==============================");
        System.out.print("Ingrese numero de telefono del cliente: ");}

    // sirve pa pedir la direccion
    public static void requestAddress() {
        System.out.println("==============================");
        System.out.print("Ingrese direccion cliente : ");}

    // sirve para pedir el correo
    public static void requestEmail() {
        System.out.println("==============================");
        System.out.print("Ingrese correo cliente : ");}

    public static void registerCliente() {
        System.out.println("==============================");
        System.out.print("Ha registrado al cliente\n"); }

    public static void eliminateCliente() {
        System.out.println("==============================");
        System.out.print("Ha eliminado al cliente\n"); }

    public static void eliminateService() {
        System.out.println("==============================");
        System.out.print("Ha eliminado al servicio\n");}

    public static void eliminateProduct() {
        System.out.println("==============================");
        System.out.print("Ha eliminado al producto\n"); }

    public static void modificateCliente() {
        System.out.println("==============================");
        System.out.print("Ha modificado al cliente\n"); }

    ///////////////////////////////////////////////////////////
    // Errores
    // mensaje general de error
    public static void errorMessage() {
        System.out.println("Ups algo ha salido mal!");}

    // Eligir alguna opcion que no es dentro de un switch
    public static void switchDefaultMessage() {
        System.out.println("==============================");
        System.out.println("La opcion ingresada no es valida"); }

    // Nombre
    public static void wrongName() {
        System.out.println("==============================");
        System.out.println("El nombre del cliente no es valido");}

    // Apellido
    public static void wrongLastName() {
        System.out.println("==============================");
        System.out.println("El apellido del cliente no es valido"); }

    // Direccion
    public static void wrongAddress() {
        System.out.println("==============================");
        System.out.println("La dirección del clienteno es valido");}

    // Correo
    public static void wrongEmail() {
        System.out.println("==============================");
        System.out.println("El correo electrónico del cliente no es valido"); }

    // Telefono
    public static void wrongPhoneNumber() {
        System.out.println("==============================");
        System.out.println("El numero de contacto del cliente no es valido");}

    // Cedula
    public static void wrongID() {
        System.out.println("==============================");
        System.out.println("Cedula o RUC del cliente no es valido");}

    public static void wrongRangeID() {
        System.out.println("==============================");
        System.out.println("Cedula o RUC del cliente esta fuera rango");}

    public static void noNumbersID() {
        System.out.println("==============================");
        System.out.println("El campo Cedula o RUC solo acepta numeros");}

    public static void wrongTypeID() {
        System.out.println("==============================");
        System.out.println("El tipo de Id no es valido"); }

    public static void messageEmptyID() {
        System.out.println("==============================");
        System.out.println("Mensaje Cedula o RUC vacio"); }

    // Medida
    public static void wrongExtent() {
        System.out.println("==============================");
        System.out.println("Magnitud no valida"); }

    // producto
    public static void wrongNameProduct() {
        System.out.println("==============================");
        System.out.println("Nombre del producto no valido"); }

    public static void wrongPriceProduct() {
        System.out.println("==============================");
        System.out.println("Precio del producto no valido");}

    public static void wrongIDProduct() {
        System.out.println("==============================");
        System.out.println("ID del producto no valido"); }

    public static void wrongIVA() {
        System.out.println("==============================");
        System.out.println("IVA no valido");}

    // Servicio
    public static void wrongNameService() {
        System.out.println("==============================");
        System.out.println("Nombre del servicio no valido");}

    public static void wrongPriceService() {
        System.out.println("==============================");
        System.out.println("Precio del servicio no valido");}

    public static void wrongIDService() {
        System.out.println("==============================");
        System.out.println("ID del servicio no valido");}

    public static void clientNotExist() {
        System.out.println("==============================");
        System.out.println("El cliente con esa ID no existe");}

    /////////////////////////////////////////////////
    // Productos - Producto agregado
    public static void productAdded() {
        System.out.println("==============================");
        System.out.println("Producto agregado");}

    // Opciones de productos
    public static void updateProductOptions() {
        System.out.println("==============================");
        System.out.print("1.Nombre \n2.Precio Unitario \nIngresa tu opcion: ");}

    // Nombre producto
    public static void requestProductServiceName() {
        System.out.println("==============================");
        System.out.print("Ingrese el nombre: ");}

    // Id producto
    public static void requestProductServiceId() {
        System.out.println("==============================");
        System.out.print("Ingrese el Id: ");}

    // Precio producto
    public static void requestProductServicePriceByUnit() {
        System.out.println("==============================");
        System.out.print("Ingrese el precio: "); }

    // Unidad de medida
    public static void requestProductQuantity() {
        System.out.println("==============================");
        System.out.print("Ingrese la cantidad que desea: "); }

    // IVA
    public static void requestProductServiceIva() {
        System.out.println("==============================");
        System.out.print("Ingrese el IVA: "); }

    public static void requestIvaOption() {
        System.out.println("==============================");
        System.out.print("1.Iva del 0% \n2.Iva del 12% \nIva: ");}

    public static void requestProductUmeasure() {
        System.out.println("==============================");
        System.out.print("1.Lt \n2.Kg \n3.Gr \n4.Lb \nUnidad de Medida: ");}

    public static void wrongUmeasure() {
        System.out.println("No es una unidad de medida valida"); }

    /////////////////////////////////////////////////
    // Servicios - Opciones de servicios
    public static void registerService() {
        System.out.println("==============================");
        System.out.print("Ha registrado un servicio: ");}

    public static void modificateService() {
        System.out.println("==============================");
        System.out.print("Ha modificado un servicio: ");}

    public static void deletedService() {
        System.out.println("==============================");
        System.out.print("Ha eliminado un servicio: "); }

    /////////////////////////////////////////////////
    // Menu messages
    public static void menuOptions() {
        System.out.println("==============================");
        System.out.println("BIENVENIDO");
        System.out.println("1.Agregar \n2.Modificar \n3.Eliminar \n4.Facturar \n5.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: "); }

    public static void addMenu() {
        System.out.println("==============================");
        System.out.println("AGREGAR");
        System.out.println("1.Clientes \n2.Productos \n3.Servicios \n4.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: "); }

    public static void updateMenu() {
        System.out.println("==============================");
        System.out.println("MODIFICAR");
        System.out.println("1.Clientes \n2.Productos \n3.Servicios \n4.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: ");}

    public static void deleteMenu() {
        System.out.println("==============================");
        System.out.println("ELIMINAR");
        System.out.println("1.Clientes \n2.Productos \n3.Servicios \n4.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: "); }

    public static void shopMenu() {
        System.out.println("==============================");
        System.out.println("COMPRAR");
        System.out.println("1.Productos \n2.Servicios");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: ");}
    /////////////////////////////////////////////////
    // Para bill
    public static void noProductsAndServices() {
        System.out.println("==============================");
        System.out.print("No hay productos o servicios preparados para ser facturados"); }

    /////////////////////////////////////////////////
    // Continuaciones
    public static void continueUpdate(String data) {
        System.out.println("==============================");
        System.out.println("Desea continuar modificando " + data + "? Y/N"); }

    public static void continueAdd(String data) {
        System.out.println("==============================");
        System.out.println("Desea continuar agregando " + data + "? Y/N"); }

    public static void continueDelete(String data) {
        System.out.println("==============================");
        System.out.println("Desea continuar eliminando " + data + "? Y/N");}

    public static void endProgram() {
        System.out.println("==============================");
        System.out.println("Desea salir del programa? Y/N");}

    public static void limitNumbers() {
        System.out.println("=============================="); 
        System.out.println("Solo se aceptan 10 numeros"); }

    public static void limitIDOrRUC() {
        System.out.println("=============================="); 
        System.out.println("Solo se aceptan 10 numeros"); }

    public static void errorId() {
        System.out.println("=============================="); 
        System.out.println("La ID ya esta registrada"); }

    public static void emptyProduct() {
        System.out.println("=============================="); 
        System.out.println("La lista de productos esta vacia"); }

    public static void emptyService() {
        System.out.println("=============================="); 
        System.out.println("La lista de servicios esta vacia"); }

    public static void emptyClients() {
        System.out.println("=============================="); 
        System.out.println("La lista de clientes esta vacia"); }

    public static void invalidatedPrice() {
        System.out.println("=============================="); 
        System.out.println("El precio solo acepta numeros"); }

}
