if __name__ == '__main__':
    x = int(input("input x: "))
    y = int(input("input y: "))
    z = int(input("input z: "))
    n = int(input("input n: "))


print('[', end = "")

for i in range(x+1):
    for j in range(y+1):
        for k in range (z+1):
            if (i+j+k!=n):
                print([i,j,k], end = ", ")

print("\b", end  = '')         
print('\b]')            




    

