MVI C,00H
LHLD 8500H
XCHG
LHLD 8502H
MOV A,E
SUB L
JNC LOOP1
DCR D
LOOP1: STA 8504H
MOV A,D
SUB H
JNC LOOP2
INR C
LOOP2: STA 8505H
MOV A,C
STA 8507H
HLT
