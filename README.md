# ERS — Employee Resource System

## Contexto Empresarial

Em empresas modernas — como bancos, empresas de tecnologia, hospitais e indústrias — existe uma necessidade constante de gerenciar **pessoas e recursos corporativos**.

Equipamentos como:

* notebooks
* celulares
* monitores
* cadeiras
* licenças de software

precisam ser controlados para garantir **segurança, rastreabilidade e eficiência operacional**.

Para isso, muitas organizações utilizam sistemas internos chamados **Employee Resource Systems (ERS)**, responsáveis por controlar o relacionamento entre colaboradores e recursos corporativos.

Este projeto implementa o **núcleo inicial desse sistema**, utilizando apenas conceitos fundamentais da linguagem Java.

---

# Objetivo do Projeto

O objetivo do projeto é criar um **módulo inicial de um sistema corporativo** capaz de:

* cadastrar colaboradores
* cadastrar recursos da empresa
* controlar alocações de equipamentos
* devolver recursos
* consultar disponibilidade de ativos

Tudo utilizando **conceitos básicos de programação orientada a objetos**.

---

# Estrutura do Projeto

O sistema foi organizado em dois pacotes principais.

## Pacote Entities

```
br.com.fiap.entities
```

Contém as entidades do domínio do sistema.

### Colaborador

Representa um funcionário da empresa.

Atributos:

* id
* nome
* cargo
* salario
* ativo
* dataDeAdmissao

Regras de negócio:

* Todo colaborador recém-admitido inicia com `ativo = true`.

Método adicional:

```
promover(novoCargo, novoSalario)
```

Permite atualizar o cargo e salário do colaborador.

---

### Recurso

Representa um ativo corporativo.

Exemplos:

* notebook
* monitor
* celular
* licença de software
* cadeira

Atributos:

* id
* nomeDoRecurso
* categoria
* disponivel
* valorEstimado

Regra de negócio:

Um recurso só pode ser alocado se estiver disponível.

```
podeSerAlocado()
```

---

### Alocacao

Representa a relação entre um colaborador e um recurso.

Atributos:

* colaboradorId
* recursoId
* data
* observacao

Essa entidade registra quando um recurso é atribuído a um colaborador.

---

# Classe Principal do Sistema

```
br.com.fiap.main
```

### SistemaERS

Classe responsável pela lógica principal do sistema.

Ela contém três listas principais:

* lista de colaboradores
* lista de recursos
* lista de alocações

Essas listas simulam o armazenamento de dados do sistema.

---

# Funcionalidades Implementadas

O sistema permite executar as seguintes operações:

### Cadastro de Colaborador

Permite registrar um novo colaborador no sistema.

Informações solicitadas:

* id
* nome
* cargo
* salário
* data de admissão

---

### Cadastro de Recursos

Permite cadastrar equipamentos ou ativos corporativos.

Informações solicitadas:

* id
* nome do recurso
* categoria
* valor estimado

---

### Alocação de Recursos

Permite atribuir um recurso a um colaborador.

Regras aplicadas:

* o recurso precisa estar disponível
* após a alocação, o recurso passa a ficar indisponível

---

### Devolução de Recursos

Permite que um recurso seja devolvido ao sistema.

Após a devolução:

* o recurso volta a ficar disponível para nova alocação.

---

### Consulta de Recursos Disponíveis

O sistema permite visualizar quais recursos ainda estão disponíveis para uso.

---

### Exibição de Recursos

Lista todos os recursos cadastrados no sistema e seu status de disponibilidade.

---

### Exibição de Colaborador

Mostra os dados de um colaborador específico.

---
## Inovação Implementada

Foi implementada uma funcionalidade adicional inspirada em práticas reais de empresas:

### Cálculo do custo de equipamentos por colaborador

O sistema calcula automaticamente o valor total dos recursos alocados para um colaborador.

Essa funcionalidade permite que empresas tenham maior controle sobre:

custos de equipamentos por funcionário
auditoria de ativos
controle financeiro
governança de recursos corporativos

O sistema percorre todas as alocações e soma o valor estimado dos recursos associados ao colaborador.

Além disso, foi utilizada a biblioteca JOptionPane como inovação implementada, permitindo a exibição das informações por meio de janelas gráficas, tornando a interação com o sistema mais intuitiva e próxima de aplicações reais.

Exemplo de saída:

```
Custo total de equipamentos do colaborador: R$ 5000
```

Essa funcionalidade simula práticas utilizadas em empresas para controle de ativos e planejamento financeiro.

---

# Tecnologias Utilizadas

O projeto foi desenvolvido utilizando:

* Java
* Programação Orientada a Objetos
* IntelliJ IDEA

O sistema utiliza apenas conceitos fundamentais da linguagem:

* classes
* atributos
* métodos
* objetos
* ArrayList
* controle de fluxo

Não foram utilizados frameworks ou banco de dados.

---

# Execução do Sistema

Ao executar o programa:

1. O sistema solicita o cadastro de um colaborador.
2. Em seguida solicita o cadastro de um recurso.
3. O recurso é alocado para o colaborador.
4. A alocação é registrada.
5. O recurso pode ser devolvido.
6. O sistema mostra informações sobre recursos e colaboradores.
7. O custo total de equipamentos do colaborador é calculado.

A interação com o usuário é feita através de **JOptionPane**.

---

# Integrantes do Grupo

* Deivid Ruan - RM566356.
* Eduardo Bassan - RM561474.
* Henry Andrade - RM562622.
* João Victor Abe - RM561446.
* Mariana Silva do Egito Moreira - RM562544.

---

# Disciplina

Engenharia de Software
2ESPW
FIAP
