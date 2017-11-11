.data

variableN: .word 5
variableK: .word 10

.text
	ldr r0,=variableN
	ldr r0,[r0]
	ldr r1,=variableK
	ldr r1,[r1]
	cmp r1,r0
	bgt salir
	beq comparador
	bl else

comparador: 
mov r1,#1
else:   sub r2,r0,#1
	sub r3,r1,#1
	add r5,r2,r3
salir: wfi
