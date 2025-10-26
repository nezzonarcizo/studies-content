nome = 'Marlon Augusto'
altura = 1.7
peso = 87
imc = ...

# print(...)  # Ellipsis, quando ainda precisamos pensar no algoritmo

# imc = peso / (altura * altura)
imc = peso / altura ** 2


# .2f em altura significa que depois do ponto '.' quero 2 casas decimais
# usando um número redondo para altura, exemplo 1.7, no modelo anterior imprimiria 1.7, com uma casa
# decimal, já no com esta formatação em altura ele teremos a saída do print como 1.70
linha_1 = f'{nome} tem altura de {altura:.2f} pesa {peso} quilos e seu IMC é {imc}'

# podemos colocar qualquer formatação assim como qualquer quantidade de casas decimais

print(linha_1)

# por exemplo, pra não termos o IMC com um monte de casas decimais após o calculo
linha_2 = f'Nova impressão do IMC com apenas duas casas decimais: {imc:.2f}'
print(linha_2)

# usando o exemplo com valores, caso tenhamos um valor/numero muito grande e queiramos formatar...
valor = 100050.4
linha_3 = f'Temos guardado o valor de {valor:,.2f} reservado'
print(linha_3)

# nossa saída será 100,050.40

# o f antes de qualquer string é chamado basicamente de "f-strings", 'f' no sentido de formatação...