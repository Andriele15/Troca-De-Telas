
# **TROCA DE TELAS**

> Um aplicativo Android simples que demonstra a navegação entre duas telas (Activities) usando o botão para alternar entre elas.

## 📱 Descrição

O aplicativo foi desenvolvido utilizando o Android Studio e implementa uma interface básica com TextViews e Buttons, que permitem ao usuário navegar entre a tela principal e uma segunda tela.

## 🔧 Funcionalidades

- [x] MainActivity: É a atividade principal do aplicativo. No método onCreate, a tela inicial é carregada e o botão para acessar a segunda tela é configurado. 
- [x] Ao clicar no botão "IR PARA A TELA 2", o aplicativo carrega tela2.xml, onde um novo botão "Volte para a tela Principal" permite retornar à tela inicial.

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **Button** para executar o app.

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/Troca-De-Telas.git

    ```
    
2. Abra o projeto no Android Studio.
  
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/trocadetelas
│ │ │ │ ├── MainActivity.java # Atividade principal para a troca de telas
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ │ ├── tela2.xml # Layout da tela secundária
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, você poderá clicar no button para ir para a tela2.xml.
 
![tela1](https://github.com/user-attachments/assets/89226582-3a93-4fcf-9c75-fd32db0eacba)

2. **Tela Secundária**
Na tela secundária, você poderá clicar no button e voltar para a tela principal.
![tela2](https://github.com/user-attachments/assets/7880c185-ccd5-4c7c-9251-0db2417c35bd)

 
## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença MIT
 
Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).

    
