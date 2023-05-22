package Complements;

public class Messages {

/////////////////////////////////////////////////
    //Principales
    // Bienvenido al sistema
    public static void welcomeMessage(){
        System.out.println("Bienvenido al sistema de compras");
    }
    
    // Despedida el sistema
    public static void farewellMessage(){
        System.out.println("Tenga un buen dia hasta la proxima");
    }

/////////////////////////////////////////////////
// Persona
    public static void updateProductClient() {
    System.out.print("1.Registar Cliente \n 2.Modificar Cliente \n4.Borrar Cliente \nIngresa tu opcion: ");
    }

    public static void updateClientOptions() {
        System.out.print("1.Nombres \n2.Apellidos \n3.Dirección \n4.Correo Electrónico \n5.Telefono \nIngresa tu opcion: ");
    }
    //sirve para pedir el nombre
    public static void requestName() {
        System.out.print("Ingresa tu nombre por favor:  ");
    }

    public static void requestSurname() {
        System.out.print("Ingresa tu apellido por favor:  ");
    }
    //sirve para pedir el id
    public static void requestId() {
        System.out.print("Ingresa su Id: ");
    }

    //Un por si acaso se uso el tipo e Id
    public static void typeId(int i) {
        System.out.print("Eliga que documento desea ingresar los datos.\n1.Cedula\n2.RUC\nIngresa tu opcion:");
    }

    public static void confirmationTypeId(int i) {
        System.out.print("Ha elegido");
    }

    //sirve para pedir el telefono
    public static void requestPhone() {
        System.out.print("Ingresa su numero de telefono: ");
    }

    //sirve pa pedir la direccion
    public static void requestAddress() {
        System.out.print("Ingresa su direccion: ");
    }

    //sirve para pedir el correo
    public static void requestEmail() {
        System.out.print("Ingresa su correo: ");
    }

    public static void registerCliente() {
        System.out.print("Ha registrado al cliente");
    }

    public static void eliminateCliente() {
        System.out.print("Ha eliminado al cliente");
    }

    public static void modificateCliente() {
        System.out.print("Ha eliminado al cliente");
    }

    public static void continueUpdate() {
        System.out.println("Desea continuar con la modificación S/N");
    }

/////////////////////////////////////////////////
//Errores
    //mensaje general de error
    public static void errorMessage() {
        System.out.println("Ups algo ha salido mal!");
    }

    public static void switchDefaultMessage() {
        System.out.println("La opcion ingresada no es valida");
    }


/////////////////////////////////////////////////
//Productos 
//Producto agregado 
public static void productAdded() {
    System.out.println("Producto agregado");
}

//Opciones de productos
    public static void updateProductOptions() {
        System.out.print("1.Nombre \n2.Precio Unitario \nIngresa tu opcion: ");
    }
//Nombre producto
    public static void requestProductName() {
        System.out.print("Ingresa el nombre del producto: ");
    }
//Id producto
    public static void prodcutId() {
        System.out.print("Ingresa su Id: ");
    }
//Precio producto
    public static void requestProductPriceByUnit() {
        System.out.print("Ingresa el precio del producto: ");
    }
//Unidad de medida
    public static void requestProductUnit() {
        System.out.print("Ingresa la unidad de medida: ");
    }
 //IVA
    public static void IVAproduct() {
    System.out.print("ingrese el IVA del product: ");
    }
/////////////////////////////////////////////////
//Extras



/////////////////////////////////////////////////
// Servicios
//Opciones de servicios
public static void updateServiceOptions() {
    System.out.print("1.Nombre \n2.Precio Unitario \nIngresa tu opcion: ");
}

//Nombre servicio
public static void nameService() {
    System.out.print("Escriba el nombre servicio: ");
}

//Precio servicio 
public static void priceService() {
    System.out.print("Escriba el valor del servicio: ");
}

public static void registerService() {
    System.out.print("Ha registrado un servicio: ");
}

public static void eliminateService() {
    System.out.print("Ha eliminado un servicio: ");
}

public static void modificateService() {
    System.out.print("Ha eliminado un servicio: ");
}

/////////////////////////////////////////////////
}
