# 💰 Sistema de Gestão de Conta Bancária  
Projeto desenvolvido em Java utilizando princípios de Programação Orientada a Objetos, incluindo **herança, encapsulamento, classes abstratas, interfaces** e **tratamento de exceções**.

---

## 🚀 Objetivo do Projeto
O sistema simula operações bancárias reais, permitindo:

- Cadastro de contas bancárias  
- Depósito  
- Saque  
- Transferência  
- Atualização de saldo conforme regras específicas  
- Exibição de extratos  
- Tratamento de erros (ex.: saldo insuficiente)

---

## 🧱 Arquitetura do Sistema

### **📌 Classe Abstrata `Conta`**
Contém atributos e métodos básicos:
- número da conta  
- titular  
- saldo  
- depositar()  
- sacar() (lança exceção)  
- método abstrato atualizarSaldo()

---

### **📌 Interface `OperacoesBancarias`**
Define as operações comuns:
- transferir()  
- imprimirExtrato()

---

### **📌 Subclasses**
#### **✔ ContaCorrente**
- Possui taxa de operação de 0.5% por saque/transferência  
- Atualização de saldo sem rendimento  

#### **✔ ContaPoupanca**
- Rendimento mensal de 0.3%  
- Transferências sem taxa  

---

### **📌 Exceção Personalizada**
#### `SaldoInsuficienteException`
Lançada quando o usuário tenta sacar ou transferir um valor maior que o saldo.

---

## 🧪 Classe Principal: `BancoApp`
Demonstra:
- Criação de contas  
- Depósitos  
- Saques  
- Transferências  
- Atualização de saldo  
- Impressão de extratos  
- Tratamento de exceções  

---

## 📁 Estrutura de Pastas

