Estudo de Designs pattern ALURA - Facades e Singleton

Existe uma grande discussao na comunidade sobre esses 2 patterns. Muitos os consideram como um anti-pattern

Facade
- o que se propõe a resolver : criando uma interface única para todos que querem usar a aplicação, diminui a complexidade de uso, pois toda a regra está centralizada na facade. O usuário nao precisa conhecer todas as interfaces do sistema. 
- problema : a classe da facade pode ficar gigantesca. Abre brecha para o dev colocar regra de negocio na facade


Singleton
- o que se propõe a resolver : quando é necessário uma única instancia de um objeto em todo o sistema
- problema : criamos uma variável global no sistema. Algum programador vai usar o singleton em um ponto do código que não deveria 
- Como substituir : um container IoC/DI faz esse gerenciamento (CDI, Spring, EJB).
Muitos ja consideram o Singleton como um Anti Pattern, ou seja, uma não solução para problemas de desenvolvimento. Atualmente, substitui-se o Singleton por Injeção de Dependências (DI).