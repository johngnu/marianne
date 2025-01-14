# Ejercicio 11
# inicio

x = int(input("Ingresa n: "))
for j in range(1, x + 1):
    n = int(input())
    c = 0
    k = 1
    t = 1
    for i in range(1, n + 1):
        print(t, ",", end="")
        if i == 1:
            t = t + k
            k = k + 1
        else:
            t = t + k
            c = c + 1
            if c == 2:
                k = k + 1;
                c = 0
    print()
# fin
