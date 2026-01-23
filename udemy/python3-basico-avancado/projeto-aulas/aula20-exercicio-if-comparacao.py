primeiro_valor = input('Digite um valor: ')
segundo_valor = input('Digite outro valor: ')

# if primeiro_valor > segundo_valor:
#     print('Primeiro valor ('+primeiro_valor+') é maior que o Segundo valor ('+segundo_valor+')')
# elif segundo_valor > primeiro_valor:
#     print('Segundo valor ('+segundo_valor+') é maior que o Primeiro valor ('+primeiro_valor+')')
# else:
#     print('Primeiro valor ('+primeiro_valor+') é igual o Segundo valor ('+segundo_valor+') ou vice versa')


# Apenas outro modo de imprimir
if primeiro_valor > segundo_valor:
    print(
        f'Primeiro valor ('+primeiro_valor+') é maior '
        f'que o Segundo valor ('+segundo_valor+')')
elif segundo_valor > primeiro_valor:
    print(
        f'Segundo valor {segundo_valor} é maior '
        f'que o Primeiro valor {primeiro_valor}')
else:
    print(
        f'Primeiro valor {primeiro_valor} é igual '
        f'o Segundo valor {segundo_valor} ou vice versa')