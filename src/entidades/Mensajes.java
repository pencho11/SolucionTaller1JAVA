package entidades ;

public enum Mensajes {
    MENSAJE_INFORMANTE( "Igrese el numero para realizar la accion.\n" ) ,
    MENSAJE_MENU( "║             MENU                  ║ \n" ) ,
    MENSAJE_OPCION_UNO( "║ 1. Calcular promedio. ║\n" ) ,
    MENSAJE_OPCION_DOS( "║ 2. Salir.                           ║\n" ) ,
    MENSAJE_NOTA1( "Calcular promedio \n ingrese nota 1: " ) ,
    MENSAJE_NOTA2( "Calcular promedio \n ingrese nota 2: " ) ,
    MENSAJE_NOTA3( "Calcular promedio \n ingrese nota 3: " ) ,
    MENSAJE_PROMEDIO_ALTO( "Excelente, tu rendimiento ha sido el mejor. \n" ) ,
    MENSAJE_PROMEDIO_BUENO( "Tu rendimiento es aceptable, pero finalizaste bien.\n" ) ,
    MENSAJE_PROMEDIO_REGULAR( "Te sugerimos comprometerte más con tu estudio. \n" ) ,
    MENSAJE_PROMEDIO_MALO( "Malas noticias, no cumpliste con el mínimo para avanzar. \n" ) ,
    MENSAJE_PROMEDIO_PESIMO( "Nuevamente vuelve a iniciar tus estudios y dedícate. \n" ) ,
    MENSAJE_DESPEDIDA( "Gracias por su visita. \n Hasta luego." ) ,
    MENSAJE_DE_ERROR( "¡Atención por favor!\n Lea las instrucciones" ) ;

    private String mensaje ;

    Mensajes(String s) {
        this.mensaje = s ;
    }

    public String getMensajes() {
        return mensaje ;
    }
}
