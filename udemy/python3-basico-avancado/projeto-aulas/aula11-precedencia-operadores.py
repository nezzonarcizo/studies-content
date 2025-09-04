# 1. (n + n)  - Parênteses
# 2. **       - Potenciação/Exponenciação
# 3. * / // % - Multiplicação, Divisão, Divisão inteira, Módulo 
# 4. + -      - Adição, Subtração

# Obs: No caso de operadores com a mesma prioridade será levada em conta a ordem da esquerda para a direita

conta_1 = 1 + 1 ** 5 + 5  # 7
print(conta_1)  # Deu 7 porque a potenciação/exponencição precedeu as contas de adição (1 ** 5 = 1)

# Corrigindo a conta para que dê 1024

conta_2 = (1 + 1) ** (5 + 5)
print(conta_2)

conta_3 = (1 + int(0.5 + 0.5)) ** (5 + 5)  # Um exemplo de parentêses dentro de parênteses