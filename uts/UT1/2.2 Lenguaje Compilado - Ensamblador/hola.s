.section .data 
	mensaje: .ascii "hola mundo \n"
	longitud = . - mensaje 
 
.section .text 
	.globl _start  #definimos el punto de entrada 
_start: 
	movl $longitud,%edx #EDX=long. de la cadena 
	movl $mensaje,%ecx #ECX=cadena a imprimir 
	movl $1,%ebx  #EBX=manejador de fichero (STDOUT) 
	movl $4,%eax  #EAX=función sys_write() del kernel 
	int $0x80   #interrupc. 80 (llamada al kernel) 
 
	movl $0,%ebx  #EBX=código de salida al SO 
	movl $1,%eax  #EAX=función sys_exit() del kernel 
	int $0x80   #interrupc. 80 (llamada al kernel) 
