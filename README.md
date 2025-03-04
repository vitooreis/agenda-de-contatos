# Agenda de Contatos

Este projeto consiste em uma **agenda de contatos** desenvolvida em Java, onde o usuário pode cadastrar, listar, pesquisar e excluir contatos. O projeto utiliza **Regex** para validar entradas como nome, telefone e e-mail, garantindo que os dados sejam inseridos corretamente.


## 📌 Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java** - Linguagem principal do projeto.
- **Regex (Expressões Regulares)** - Para validação dos dados de entrada.
- **Scanner (Java.util.Scanner)** - Para entrada de dados via terminal.
- **ArrayList (Java.util.List)** - Para armazenar os contatos de forma dinâmica.


## ✅ Como rodar o projeto

Opção 1: Usando uma IDE (Recomendado)

1. Clone o repositório para sua máquina:
   ```bash
   git clone https://github.com/seu-usuario/agenda-contatos.git
   ```
2. Abra o projeto em sua IDE favorita (VS Code, IntelliJ, Eclipse, etc.).
3. Execute a classe principal → Agenda.java.

Opção 2: Pelo terminal (sem IDE)
Se preferir rodar sem uma IDE, siga estes passos:
```bash
cd agenda-contatos
mkdir -p bin  
javac -d bin -sourcepath src src/application/Agenda.java  
java -cp bin application.Agenda
```


## ⚠️ Problemas enfrentados

Problema: Criar uma classe com Regex para validar entrada de dados.
Descrição: Ao implementar a classe RegexValidator, precisei entender como regex funciona para restringir entradas indesejadas, como caracteres especiais em nomes ou formatos errados de telefone e e-mail.

Solução: Utilizei expressões regulares adequadas para cada tipo de dado:

- Nome: Permite apenas letras e espaços (^[A-Za-zÀ-ÿ ]+$).
- Telefone: Aceita apenas números com 8 a 15 dígitos (^\d{8,15}$).
- E-mail: Segue o padrão padrão RFC 5322 simplificado (^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$).


## ⏭️ Próximos passos

Os próximos passos para evoluir este projeto incluem:

- Integração com banco de dados para armazenamento persistente dos contatos.
- Interface gráfica para tornar o uso mais intuitivo.
- Melhorias nas validações para permitir formatos de telefone internacional.



