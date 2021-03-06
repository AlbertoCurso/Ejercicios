/* Tipos de variables */
#include "stdio.h"
/*constantes*/
#define NUMERO_PI 3.1415926 /* Las constantes siempre en mayúsuculas y separando las palabras con subrayado. */

int main(int argc, char const *argv[])
{

    /* VARIABLES NUMÉRICAS */
        /* Variables Cortas*/
        short   variableCorta       =   0; /*ocupa 1 byte */
        int     variableEntera      =   0;
        long    variableLarga       =   0;       

        /* Variables Largas*/
        float   variableFlotante    =   0;
        double  variableDoble       =   0;

    /* VARIABLES ALFANUMÉRICAS */
        char    variableCaracter    =   'a'; /* Si es un caracter se usa comilla simple */
        char    variableString[]      =   "El gato come peras"; /* Si es una cadena se usan comillas simples */

        printf("%d\n",variableCorta);
        printf("%d\n",variableEntera);
        printf("%d\n",variableLarga);
        printf("%f\n",variableFlotante);
        printf("%f\n",variableDoble);
        printf("%c\n",variableCaracter);

    return 0;
}
