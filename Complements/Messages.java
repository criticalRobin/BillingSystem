package Complements;

import Models.ClientDao;

public class Messages {

    /////////////////////////////////////////////////
    // Principales
    // Bienvenido al sistema
    public static void welcomeMessage() {
        System.out.println("Bienvenido al sistema de compras");
    }

    // Despedida el sistema
    public static void farewellMessage() {
        System.out.println("Tenga un buen dia hasta la proxima");
    }

    /////////////////////////////////////////////////
    // Client
    public static void clientList() {
        System.out.print(ClientDao.clients.toString());
    }


    public static void updateProductClient() {
        System.out.print("1.Registar Cliente \n 2.Modificar Cliente \n4.Borrar Cliente \nIngresa tu opcion: ");
    }

    public static void updateClientOptions() {
        System.out.print(
                "1.Nombres \n2.Apellidos \n3.Dirección \n4.Correo Electrónico \n5.Telefono \nIngresa tu opcion: ");
    }

    // sirve para pedir el nombre
    public static void requestName() {
        System.out.print("Ingrese nombre cliente:  ");
    }

    public static void requestSurname() {
        System.out.print("Ingrese apellido cliente:  ");
    }

    // sirve para pedir el id
    public static void requestId() {
        System.out.print("Ingrese Id cliente: ");
    }

    // Un por si acaso se uso el tipo e Id
    public static void requestTypeId() {
        System.out.print("Eliga tipo de documento.\n1.Cedula\n2.RUC\nIngresa tu opcion:");
    }

    public static void confirmationTypeId() {
        System.out.print("Ha elegido");
    }

    // sirve para pedir el telefono
    public static void requestPhone() {
        System.out.print("Ingrese numero de telefono del cliente: ");
    }

    // sirve pa pedir la direccion
    public static void requestAddress() {
        System.out.print("Ingrese direccion cliente : ");
    }

    // sirve para pedir el correo
    public static void requestEmail() {
        System.out.print("Ingrese correo cliente : ");
    }

    public static void registerCliente() {
        System.out.print("Ha registrado al cliente");
    }

    public static void eliminateCliente() {
        System.out.print("Ha eliminado al cliente");
    }

    public static void modificateCliente() {
        System.out.print("Ha modificado al cliente");
    }

    public static void continueUpdate() {
        System.out.println("Desea continuar con la modificación Y/N");
    }

    ///////////////////////////////////////////////////////////
    // Errores
    // mensaje general de error
    public static void errorMessage() {
        System.out.println("Ups algo ha salido mal!");
    }

    // Eligir alguna opcion que no es dentro de un switch
    public static void switchDefaultMessage() {
        System.out.println("La opcion ingresada no es valida");
    }

    // Nombre
    public static void wrongName() {
        System.out.println("El nombre del cliente no es valido");
    }

    // Apellido
    public static void wrongLastName() {
        System.out.println("El apellido del cliente no es valido");
    }

    // Direccion
    public static void wrongAddress() {
        System.out.println("La dirección del clienteno es valido");
    }

    // Correo
    public static void wrongEmail() {
        System.out.println("El correo electrónico del cliente no es valido");
    }

    // Telefono
    public static void wrongPhoneNumber() {
        System.out.println("El numero de contacto del cliente no es valido");
    }

    // Cedula
    public static void wrongID() {
        System.out.println("Cedula del cliente no es valido");
    }

    public static void wrongRangeID() {
        System.out.println("Cedula del cliente esta fuera rango");
    }

    public static void noNumbersID() {
        System.out.println("El campo cedula solo acepta numeros");
    }

    public static void wrongTypeID() {
        System.out.println("El tipo de Id no es valido");
    }

    public static void messageEmptyID() {
        System.out.println("Mensaje Cedula vacio");
    }

    // RUC
    public static void wrongRUC() {
        System.out.println("RUC del cliente no es valido");
    }

    public static void noNumbersRUC() {
        System.out.println("RUC solo acepta numeros");
    }

    public static void messageEmptyRUC() {
        System.out.println("Campo RUC vacio");
    }

    // producto
    public static void wrongNameProduct() {
        System.out.println("Nombre del producto no valido");
    }

    public static void wrongPriceProduct() {
        System.out.println("Precio del producto no valido");
    }

    public static void wrongIDProduct() {
        System.out.println("ID del producto no valido");
    }

    public static void wrongIVA() {
        System.out.println("IVA no valido");
    }

    // Servicio
    public static void wrongNameService() {
        System.out.println("Nombre del servicio no valido");
    }

    public static void wrongPriceService() {
        System.out.println("Precio del servicio no valido");
    }

    public static void wrongIDService() {
        System.out.println("ID del servicio no valido");
    }

    /////////////////////////////////////////////////
    // Productos
    // Producto agregado
    public static void productAdded() {
        System.out.println("Producto agregado");
    }

    // Opciones de productos
    public static void updateProductOptions() {
        System.out.print("1.Nombre \n2.Precio Unitario \nIngresa tu opcion: ");
    }

    // Nombre producto
    public static void requestProductServiceName() {
        System.out.print("Ingrese el nombre: ");
    }

    // Id producto
    public static void requestProductServiceId() {
        System.out.print("Ingrese el Id: ");
    }

    // Precio producto
    public static void requestProductServicePriceByUnit() {
        System.out.print("Ingrese el precio: ");
    }

    // Unidad de medida
    public static void requestProductUnit() {
        System.out.print("Ingrese la unidad de medida: ");
    }

    // IVA
    public static void requestProductServiceIva() {
        System.out.print("ingrese el IVA: ");
    }

    public static void requestProductUmeasure() {
        System.out.print("Ingrese la unidad de media: ");
    }

    /////////////////////////////////////////////////
    // Servicios
    // Opciones de servicios

    public static void registerService() {
        System.out.print("Ha registrado un servicio: ");
    }

    public static void eliminateService() {
        System.out.print("Ha eliminado un servicio: ");
    }

    public static void modificateService() {
        System.out.print("Ha modificado un servicio: ");
    }

    /////////////////////////////////////////////////
    // Menu messages
    public static void menuOptions() {
        System.out.println("==============================");
        System.out.println("BIENVENIDO");
        System.out.println("1.Agregar \n2.Modificar \n3.Eliminar \n4.Facturar \n5.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: ");
    }

    public static void addMenu() {
        System.out.println("==============================");
        System.out.println("AGREGAR");
        System.out.println("1.Clientes \n2.Productos \n3.Servicios \n4.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: ");
    }

    public static void updateMenu() {
        System.out.println("==============================");
        System.out.println("MODIFICAR");
        System.out.println("1.Clientes \n2.Productos \n3.Servicios \n4.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: ");
    }

    public static void deleteMenu() {
        System.out.println("==============================");
        System.out.println("ELIMINAR");
        System.out.println("1.Clientes \n2.Productos \n3.Servicios \n4.Salir");
        System.out.println("==============================");
        System.out.print("Ingrese la opcion que desee: ");
    }
    /////////////////////////////////////////////////
}
