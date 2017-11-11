         .data
fila1:   .word 5, 8, 3, 4
fila2:   .word 4,5,6,8
fila3:   .word 8,2,4,6


.text

main:  bl subr1
	push {r3,r4,r5,r6}
	bl sub2
	push {r3,r4,r5,r6}
	bl sub3
	push {r3,r4,r5,r6}
	bl subsalida
subr1:	
	ldr r0,=fila1
	ldr r3,[r0]
	ldr r4,[r0,#4] 
	ldr r5,[r0,#8]
	ldr r6,[r0,#12]
	mov pc, lr

sub2:	ldr r1,=fila2
	ldr r3,[r1]
	ldr r4,[r1,#4] 
	ldr r5,[r1,#8]
	ldr r6,[r1,#12]
	mov pc, lr	

sub3:	ldr r2,=fila3
	ldr r3,[r2]
	ldr r4,[r2,#4] 
	ldr r5,[r2,#8]
	ldr r6,[r2,#12]
	mov pc, lr

subsalida: pop {r3,r4,r5,r6}
	




wfi
	.end   