"""
Exercício
Peça ao usuário para digitar seu nome
Peça ao usuário para digitar sua idade
Se nome e idade forem digitados:
    Exiba:
        Seu nome é {nome}
        Seu nome invertido é {nome invertido}
        Seu nome contém (ou não) espaços
        Seu nome tem {n} letras
        A primeira letra do seu nome é {letra}
        A última letra do seu nome é {letra}
Se nada for digitado em nome ou idade: 
    exiba "Desculpe, você deixou campos vazios."
"""
nome  = input("Insira seu nome: ")
idade = input("Insira sua idade: ")

print("1 - Seu nome é", nome)

print("2 - Seu nome invertido é",nome[::-1])

if ' ' in nome:
    print(f'3 - O nome {nome} tem espaços.')
else:
    print(f'3 - O nome {nome} NÃO tem espaços.')

print(f'Seu nome tem {len(nome)} letras.')

for i in nome:
    print("A primeira letra do seu nome é", i)
    break

fullName = len(nome)

for i in nome[fullName - 1]:
    print("A ultima letra do seu nome é",i)
    break

if nome == "" or idade == "":
    print("Desculpe, você deixou campos vazios.")

# Outra forma de resolver:

ome = input('Digite o seu nome: ')
idade = input('Digite sua idade: ')

if nome and idade:
    print(f'Seu nome é {nome}')
    print(f'Seu nome invertido é {nome[::-1]}')

    if ' ' in nome:
        print('Seu nome contém espaços')
    else:
        print('Seu nome NÃO contém espaços')

    print(f'Seu nome tem {len(nome)} letras')
    print(f'A primeira letra do seu nome é {nome[0]}')
    print(f'A última letra do seu nome é {nome[-1]}')
else:
    print("Desculpe, você deixou campos vazios.")