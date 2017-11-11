.data
palabra1: .ascii "hola"
palabra2: .ascii "mundo"


.text
ldr r1,=palabra1
ldr r2,=palabra2
ldr r1,[r1]
ldr r2,[r2]
cmp r1,r2
beq return1
bl return0

return1:
mov r3,=1

return0:
mov r4,#0
bl stop

stop:wfi

.end