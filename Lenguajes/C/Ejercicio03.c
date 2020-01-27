#include    "stdio.h"
#define MAYORIA_DE_EDAD 18 

int main(int argc, char const *argv[])
{
    /*int edad;       // Declaración
    edad = 0;       // Asignación */
    int edad = 0;   // Declaración y Asignación
    
    printf("Introduce tu edad: ");
    scanf("%d",&edad);

    if (edad>=MAYORIA_DE_EDAD) {
        printf("Eres mayor de edad");
    } else {
        printf("Eres menor de edad");

    }

    return 0;
}
