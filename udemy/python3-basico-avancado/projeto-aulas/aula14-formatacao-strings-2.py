a = 'A'
b = 'B'
c = 1.1
strings = 'a={} b={} c={:.2f}'
formatado = strings.format(a, b, c)

# print(formatado)

# podemos também usar indices para buscar os valores
strings_index = 'a={0} b={1} c={2}'
formatado = strings_index.format(a, b, c)

# print(formatado)

# chamando por "parametro nomeado"
strings_parameters = 'a={nome1} b={nome2} c={nome3:.2f}' 
formatado = strings_parameters.format(
    nome1=a, nome2=b, nome3=c
)

# print(formatado)

# depois que eu nomeio uma variavel, ou crio um parametro nomeado preciso nomear todos os seguintes, se faço
# apenas com o último, não há necessidade de fazer isso com os anteriores


# verificando respostas do teste

# resultado de / sempre retorna float?
# numero1 = 10
# numero2 = 2
# print(numero1/numero2)

# int * string faz repetição da string?
# numero = 10
# string = 'a'
# print(numero*string)
