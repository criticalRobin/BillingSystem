package Complements;

public class Validations {

    public static boolean validateIDType(String idType) {
        if (!idType.matches("^[12]$")) {
            // mensaje de ID no es valido
            Messages.switchDefaultMessage();
            return false;
        }
        return true;
    }

    public static boolean validateID(String cedula) {
        if (cedula.equals(null) || cedula.equals("")) {
            // mensaje de vacio
            Messages.messageEmptyID();
            return false;
        }
        if (!cedula.matches("\\d+")) {
            // mensaje de no son numeros
            Messages.noNumbersID();
            return false;
        }
        if (cedula.length() < 10 || cedula.length() > 10) {
            // mensaje de cedula no valida por rango
            Messages.wrongRangeID();
            return false;
        }

        int[] coefficients = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
        int total = 0;

        try {
            int verifier = Integer.parseInt(cedula.substring(9));
            for (int i = 0; i < 9; i++) {
                int digito = Integer.parseInt(cedula.substring(i, i + 1));
                int producto = digito * coefficients[i];
                if (producto >= 10) {
                    producto -= 9;
                }
                total += producto;
            }

            int residuo = total % 10;
            if ((residuo == 0 && verifier == 0) || (residuo == 10 - verifier)) {

                return true;
            }
        } catch (NumberFormatException e) {
            // mensaje de error
            Messages.errorMessage();
            return false;
        }
        // cedula no valida
        Messages.wrongID();
        return false;
    }

    public static boolean validateRUC(String ruc) {
        if (ruc.equals(null) || ruc.equals("")) {
            // ruc vacio
            Messages.messageEmptyID();
            return false;
        }
        if (!ruc.matches("\\d+")) {
            // mensaje de no son numeros
            Messages.noNumbersID();
            System.out.println("solo numeros");
            return false;
        }
        if ((ruc.length() != 10 && ruc.length() != 13)) {
            // ruc no valido
            Messages.wrongID();
            return false;
        }

        // Validación para personas naturales
        if (ruc.length() == 10) {
            try {
                int verificador = Integer.parseInt(ruc.substring(9));
                int suma = 0;
                for (int i = 0; i < 9; i++) {
                    int digito = Integer.parseInt(ruc.substring(i, i + 1));
                    suma += digito * (2 + (i % 7));
                }
                int residuo = suma % 11;
                int digitoVerificador = residuo == 0 ? 0 : 11 - residuo;

                return digitoVerificador == verificador;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            try {
                Long.parseLong(ruc);
                return true;
            } catch (NumberFormatException e) {
                // mensaje de error
                Messages.errorMessage();
                return false;
            }
        }

    }

    public static boolean validateName(String name) {
        if (name.matches("^[A-Za-záéíóúÁÉÍÓÚñÑ]+(\\s[A-Za-záéíóúÁÉÍÓÚñÑ]+)?$")) {
            return true;
        } else {
            // mensaje nombre no valido
            Messages.wrongName();
        }
        return false;
    }

    public static boolean validateLastName(String lastName) {
        if (lastName.matches("^[A-Za-záéíóúÁÉÍÓÚñÑ]+(\\s[A-Za-záéíóúÁÉÍÓÚñÑ]+)?$")) {
            return true;
        } else {
            // mensaje apellido no valido
            Messages.wrongLastName();
        }
        return false;
    }

    public static boolean validateAddress(String address) {
        if (address.matches("^[A-Za-z0-9áéíóúÁÉÍÓÚñÑ\\s.,-]{2,}$")) {

            return true;
        } else {
            // mensaje dirreccion no valido
            Messages.wrongAddress();
        }
        return false;
    }

    public static boolean validatePhoneNumber(String number) {
        if (number.matches("^09\\d{8}$")) {
            return true;
        } else {
            // mensaje celular no no valido
            Messages.wrongPhoneNumber();
        }
        return false;
    }

    public static boolean validateEmail(String email) {
        if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            return true;
        } else {
            // mensaje correo no no valido
            Messages.wrongEmail();
        }
        return false;
    }

    ////////////////////////// validaciones productos
    // permitir números, letras o una combinación de ambos en el identificador
    public static boolean validateIdentifier(String identifier) {
        if (identifier.matches("^[A-Za-z0-9]{4}$")) {
            return true;
        } else {
            // mensaje identificador prodcuto no no valido
            Messages.wrongIDProduct();
        }
        return false;
    }

    public static boolean validateProductName(String name) {
        if (name.matches("^[A-Za-z\\s-]+$")) {
            return true;
        } else {
            // mensaje nombre producto no no valido
            Messages.wrongNameProduct();
        }
        return false;
    }

    public static boolean validatePrice(String price) {
        if (price.matches("^(\\d+(\\.\\d{1,2})?)$")) {
            return true;
        } else {
            // mensaje price no valido
            Messages.wrongPriceProduct();
        }
        return false;
    }

    public static boolean validateIVA(String iva) {
        if (iva.matches("^[0-9]+$")) {
            return true;
        } else {
            // mensaje price no valido
            Messages.wrongIVA();
        }
        return false;
    }

    /////////////////////////// Validacion continuar
    // continuar con la modificacion
    public static boolean continueUpdate(String data) {
        boolean result = true;
        do {
            String confirm = ScannerReader.continueUpdate(data).toUpperCase();
            if (confirm.equals("Y")) {
                return true;
            } else if (confirm.equals("N")) {
                return false;

            } else {
                Messages.switchDefaultMessage();
                result = false;
            }
        } while (!result);
        return result;
    }

    public static boolean continueAdd(String data) {
        boolean result = true;
        do {
            String confirm = ScannerReader.continueAdd(data).toUpperCase();
            if (confirm.equals("Y")) {
                return true;
            } else if (confirm.equals("N")) {
                return false;

            } else {
                Messages.switchDefaultMessage();
                result = false;
            }
        } while (!result);
        return result;
    }

    public static boolean continueDelete(String data) {
        boolean result = true;
        do {
            String confirm = ScannerReader.continueDelete(data).toUpperCase();
            if (confirm.equals("Y")) {
                return true;
            } else if (confirm.equals("N")) {
                return false;

            } else {
                Messages.switchDefaultMessage();
                result = false;
            }
        } while (!result);
        return result;
    }

    public static boolean endProgram() {
        boolean result = true;

        do {
            String confirm = ScannerReader.endProgram().toUpperCase();
            if (confirm.equals("Y")) {
                return true;
            } else if (confirm.equals("N")) {
                return false;

            } else {
                Messages.switchDefaultMessage();
                result = false;
            }
        } while (!result);
        return result;
    }

    ////////////////////////////////
    public static boolean validatePriceWhole(String price) {
        if (price.matches("^\\d+$")) {
            return true;
        } else {
            Messages.invalidPrice();
            ;
        }
        return false;
    }

    // Validar magnitudes
    public static boolean validateExtent(String extent) {
        if (extent.matches("^[a-zA-Z]{2}$")) {
            return true;
        } else {
            Messages.wrongExtent();
        }
        return false;
    }

    public static boolean validateNumbers(String extent) {
        if (extent.matches("^[1-9]|10$")) {
            return true;
        } else {
            Messages.limitNumbers();
        }
        return false;
    }

    public static boolean compareIDOrRUC(String extent) {
        if (extent.matches("^\\d{10}$")) {
            if (Validations.validateID(extent))
                return true;
        } else if (extent.matches("^\\d{13}$")) {
            if (Validations.validateRUC(extent))
                return true;
        } else {
            Messages.wrongRangeID();
        }
        return false;
    }
}
