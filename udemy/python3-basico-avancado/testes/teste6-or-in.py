# Pergunta 1:
# Qual o resultado do código abaixo?

variavel_a = 1 or 0
variavel_b = 0 or 1
print(variavel_a, variavel_a)

# R: 11

# Pergunta 2:
# Qual o resultado do código abaixo?

nome = 'Maria Carmo'
 
if ' ' in nome:
    print(f'O nome {nome} tem espaços.')
else:
    print(f'O nome {nome} NÃO tem espaços.')

# R: O nome Maria Carmo tem espaços.


# Pergunta 3:
# É possível adicionar um if dentro de outro fazendo várias condições aninhadas. Com isso em mente, 
# o que você acha que o código abaixo exibe na tela?

numero = 10
 
if numero > 1:
    if numero > 2:
        if numero > 3:
            print('Número maior que 3')
        else:
            print('Número menor que 3')
    else:
        print('Número menor que 2')
else:
    print('Número menor que 1')

# R: Número maior que 3