# jogo-competitivo
Desafio Jogo Competitivo

Requisitos:

A classe de usuário deve ter os seguintes campos: Nome Completo (first name e last name), documento, email e senha. O sistema deve permitir apenas um cadastro com o mesmo documento ou endereço de e-mail.

Os usuários serão classificados por dois critérios: patente e saldo. As possíveis patentes estão ordenadas da seguinte forma: FERRO, BRONZE, PRATA, OURO, PLATINA e DIAMANTE.
A patente tem maior prioridade que o saldo na hora de ordenar os usuários. Caso as patentes sejam iguais os usuários serão ordenados pelo saldo..

Os usuários se enfrentam em partidas. O vencedor irá ganhar 20 de saldo e o perdedor irá perder 20 de saldo. O sistema determinará o resultado das partidas de forma aleatória, mas os usuários de nível mais alto terão uma chance maior de ganhar (60%).

O saldo é um valor de 0 a 99 que varia dentro da patente. Caso o usuário ultrapasse o saldo de 99 ele irá para a próxima patente com saldo atualizado. Caso o usuário fique com saldo negativo ele irá para a patente anterior com saldo atualizado. Usuários FERRO com 0 de saldo não podem mais perder saldo e usuários DIAMANTE com 99 de saldo não podem mais ganhar saldo. As fórmulas para atualizaçao de saldo são: Para o caso que o usuário sobe de patente: saldo_atualizado = saldo_partida + saldo_anterior - 100. Para o caso que o usuário cai de patente: saldo atualizado = 100 - saldo_perdido Para os demais casos: saldo atualizado = saldo anterior + saldo_partida

Por exemplo: um usuário FERRO com saldo de 90 que recebeu mais 10 de saldo passa a ser um usuário bronze com 0 de saldo (saldo atualizado = 90 + 10 - 100 = 0). O mesmo acontece se o usuário perder saldo: um usuário prata com 10 de saldo que perdeu 20 de saldo passa a ser um usuário bronze com 90 de saldo (saldo atualizado = 100 - 90).

Não é possível que usuários com uma distância maior que uma patente se enfrentem em partidas. Por exemplo: FERRO só pode jogar contra BRONZE, mas não pode jogar contra os demais. PRATA só pode jogar contra BRONZE E OURO, mas não pode jogar contra os demais.

O sistema deverá ser capaz de: 
Criar usuários .
Listar usuários da maior patente para a menor. 
Criar partidas entre os usuários.
Atualizar as patentes e o saldo dos usuários depois das partidas.

