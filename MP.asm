MVI C,05H
LXI H,3000H
LXI D,3007H
LOOP: MOV A,M
STAX D
INX H
INX D
DCR C
JNZ LOOP
HLT
