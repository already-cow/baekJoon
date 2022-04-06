a = input()
a = int(a)

if 90 <= a <= 100:
    print("A")
else:
    if 80 <= a < 90:
        print("B")
    else:
        if 70 <= a < 80:
            print("C")
        else:
            if 60 <= a < 70:
                print("D")
            else:
                print("F")