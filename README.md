# Juego de ahorcado en JAVA

Este juego de "Ahorcado" combina conceptos fundamentales de la programación, como arreglos, declaraciones condicionales y bucles, para determinar la posición de cada letra que el usuario ingresa desde la consola. El objetivo es adivinar la palabra secreta dentro de un número limitado de intentos. Si el jugador logra completar la palabra antes de agotar los intentos, gana el juego; de lo contrario, pierde.
## ¿Qué que herramientas utilizamos?
1. Clase Scanner
2. Declaraciones y asignaciones
3. Arreglos
4. Estructura de control: iterativa (Bucle)
5. Clase String y sus métodos valueOf, charAt y length ()
6. Clase Character y su método toLowerCase
7. Estructura de control condicional

**En cuanto al código:**

 1. Se han utilizado estructuras básicas como arreglos para almacenar las letras adivinadas y bucles para verificar cada intento.
 2. El juego sigue pidiendo al usuario que ingrese letras mientras no se complete la palabra y los intentos no se hayan agotado.
 3. Si el jugador adivina una letra, esta se coloca en la posición correspondiente dentro del arreglo de letras adivinadas. Si no acierta, se le resta un intento.
 4. Al final, si el jugador adivina todas las letras, se declara como ganador; en caso contrario, el juego termina y se muestra un mensaje de "Game Over".