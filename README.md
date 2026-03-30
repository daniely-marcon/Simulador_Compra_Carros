# 📱 Programação para Dispositivos Móveis (ProgMob)

Este repositório contém o conjunto de projetos e exercícios práticos desenvolvidos durante a disciplina de **Programação Móvel**, focada no desenvolvimento nativo para Android utilizando a linguagem **Java**.

---

## 🛠️ Tecnologias e Conceitos Base
* **Linguagem:** Java (JDK 17+)
* **IDE:** Android Studio (Ladybug / Koala)
* **Interface:** XML Layouts & Material Design
* **Arquitetura:** Componentes nativos (Activities, Intents, Bundles)

---

### Simulador de Compra de Carros 🚗
Projeto focado na manipulação de múltiplos componentes de interface e transição de dados entre telas.

* **Funcionalidades:** * Cadastro de nome do cliente com validação em tempo real.
    * Seleção de cor do veículo via `RadioGroup`.
    * Escolha de acessórios através de um `Spinner` dinâmico carregado via `ArrayResource`.
    * Tela de resumo com exibição personalizada dos dados recebidos.
* **Destaques Técnicos:**
    * **Comunicação entre Activities:** Passagem de dados estruturados utilizando `Intent.putExtra` e recuperação de extras.
    * **Validação de Formulário:** Implementação de lógica preventiva com `.trim()` e `.isEmpty()` para garantir a integridade dos dados enviados.
    * **User Experience (UX):** Uso de `setError()` diretamente nos campos de texto e `Toast` para feedbacks rápidos e menos intrusivos ao usuário.
    * **Lógica de Comparação:** Uso do método `.equals()` para comparação de conteúdos de Strings, garantindo precisão na lógica de negócio.
