# inicio
s = False
while not s:
    x = int(input("X par: "))
    if x % 2 == 0:  # ver si n es par
        s = True
i = 0
aux = 0
while x > 0:
    dig = x % 10
    x = x // 10
    aux = (aux * 10) + dig
x = aux
while x > 0:
    dig = x % 10
    x = x // 10
    if i > 0:
        # print(aux, dig)
        p = aux * dig
        print(p, ", ", end="")
        aux = dig
    else:
        i = i + 1
        aux = dig
# fin
