	.data
datos:	.word 5, 8, 3, 4
res:	.space 8
	.text

main:	ldr r0, =datos	@ Parámetros para sumas
	ldr r1, =res
salto1:	bl sub1	@ Llama a la subrutina sumas
stop:	wfi		@ Finaliza la ejecucion

sub1:	mov r7, #2
	mov r5, r0
	mov r6, r1
sub2:	cmp r7, #0
	beq salto4   
	  ldr r0, [r5]	        @ Parámetros para suma
	  ldr r1, [r5,#4]
subr3:	  bl suma	        @ Llama a la subrutina suma
	  str r0, [r6]
	  add r5, r5, #8
	  add r6, r6, #4
	  sub r7, r7, #1
	b sub2
salto4:	mov pc, lr

suma:	add r0, r0, r1
salto3:	mov pc, lr
	.end