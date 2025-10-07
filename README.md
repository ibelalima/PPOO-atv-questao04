# PPOO-atv-questao04-
Quarta questão de uma lista de atividades da matéria de padrões de projeto oo

# Uso de IA na resolução da Questão 4 (Factory Method)

## Ferramenta
ChatGPT (modelo GPT-5 Thinking mini)

## Prompts principais usados
1. Explique como aplicar o padrão Factory Method para um jogo com localizações brasileiras onde cada local tem inimigos próprios. Gere um diagrama UML simples e código Java minimalista.
2. Escreva código Java usando Factory Method: Location (creator), AmazonLocation, SertaoLocation, Enemy interface e classes concretas. Inclua um Main que simule spawns.

## Ajustes aplicados manualmente após resposta da IA
- A IA sugeriu usar lambdas/Factory functional interfaces; mantive classes concretas para clareza didática (o objetivo é demonstrar o padrão).
- Troquei nomes de inimigos e mensagens para refletir termos culturais (ex.: `Cangaceiro`) e deixei as `attack()` mensagens mais descritivas para facilitar a arguição.
- Estruturei os arquivos e adicionei instruções de compilação/execution para o avaliador.

## Por que ajustes melhoraram a solução
- Classes explícitas mostram o Factory Method clássico de forma clara em avaliação.
- Mensagens mais didáticas ajudam ao explicar em arguição (professor pergunta "o que acontece aqui?" — história).

