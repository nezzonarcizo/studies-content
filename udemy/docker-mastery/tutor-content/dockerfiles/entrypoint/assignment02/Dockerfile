# use the README.md file for requirements to build this image
# If you get stuck, the answer/ directory has the solution

# Aprendido na aula da correção do exercício

# A partir do 'WORKDIR' voce sempre estará na pasta que ele indica.

# Em 'COPY' não precisa indicar a pasta que definiu em 'WORKDIR', como no caso do requirements.txt que estamos 
# copiando neste exercício, pois é nela que está atualmente por causa do comando 'WORKDIR', basta colocar um '.'.

# Sempre instale dependencias e pacotes ('RUN') antes de copiar os arquivos, para criar uma camada de instalações
# e não precisar repeti-las todas as vezes que for mudar os arquivos de uma imagem.

# No segundo comando 'COPY' encontramos outra gafe, não precisa colocar '/app/' de novo, estamos copiando da pasta
# local ('.') para o 'WORKDIR' que já estamos ('.').

# Em 'VOLUME' não precisa dos colchetes ('[]') e não precisa rodar aquele 'RUN' anterior para criar a pasta onde
# será o volume ('RUN mkdir -p /app/data'), o proprio comando 'VOLUME' irá criar o local.

# No 'CMD'a parte do comando "--host", "0.0.0.0" é para que ouça em qualquer porta do container, qualquer interface.

# Rodar o server depois do entrypoint ajuda a manter o container vivo, para caso você queira entrar no container e ir arrumando
# o script de entrypoint de uma forma mais fácil.


FROM python:slim

WORKDIR /app

COPY ./requirements.txt /app/

RUN pip install --no-cache-dir -r requirements.txt

COPY . /app/

RUN mkdir -p /app/data

VOLUME ["/app/data"]

ENTRYPOINT [ "./docker-entrypoint.sh" ]

CMD ["uvicorn", "main:app", "--host", "0.0.0.0", "--port", "8000"]