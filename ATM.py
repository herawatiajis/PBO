saldo = 1000000

while True:
    print("="*23)
    print("Selamat Datang Di ATM")
    print("="*23)
    print("Pilih Menu:")
    print('''1. Check saldo
2. Tarik tunai
3. Setor Tunai''')
    print("="*23)
    
    menu = int(input("Masukkan menu :"))
    pin = int(input("Masukkan pin anda:"))

    if menu == 1:
        print("Jumlah saldo anda ",saldo)
    
    elif menu == 2:
        print("Pilih jumlah uang:")
        print("1. Rp. 100.000")
        print("2. Rp. 200.000")
        print("3. Jumlah penarikan lain")
    
        pilih = int(input("Masukkan pilihan:"))

        if pilih == 1:
            tarik1 = 100000
            admin = 3000
            sisa_saldo1 = saldo - (tarik1 + admin)
            print("="*23)
            print("Silahkan ambil uang anda")
            print("Sisa saldo anda adalah", sisa_saldo1)
            print("="*23)

        elif pilih == 2:
            tarik2 = 200000
            admin = 3000
            print("="*23)
            sisa_saldo2 = saldo - (tarik2 + admin)
            print("Silahkan ambil uang anda")
            print("Sisa saldo anda adalah", sisa_saldo2)
            print("="*23)

        elif pilih == 3:
            tarik3 = int(input("Masukkan jumlah uang yang ingin tarik :"))
            if tarik3 > saldo:
                print("saldo anda tidak cukup")
            else:
                admin = 3000
                sisa_saldo3 = saldo - (tarik3 + admin)
                print("="*23)
                print("Silahkan ambil uang anda")
                print("Saldo anda adalah ",sisa_saldo3)
                print("="*23)
        else:
            print("Silahkan oba lagi!")

    elif menu == 3:
        saldo = 1000000
        setor = int(input("Masukkan jumlah uang yang ingin di setor :"))
        print("Silahkan masukkan uang anda!")
        print("="*23)
        
        saldo_sekarang = saldo + setor
        print("Saldo anda adalah", saldo_sekarang)
        print("="*23)

    else:
        print("Tidak valid")

    lanjut = input("Masih butuh transaksi lain? [y/n]:")
    if lanjut == "y":
        print()
    else:
        print("\n")
        print("<=== TERIMAKASIH ===>".center(30))
        print("Silahkan ambil kartu anda".center(30))
        break
        
        
    





