class Funcionario:

    premioAnual = 1.5
    nFuncionarios = 0

    def __init__(self, primeiroNome, ultimoNome, salario):
        self.__primeiroNome = primeiroNome
        self.__ultimoNome = ultimoNome
        self.__salario = salario
        Funcionario.nFuncionarios += 1

    def __str__(self):
        return f"{self.nomeCompleto} [{self.email}]: {self.__salario}€"

    @property
    def nomeCompleto(self):
        return f"{self.__primeiroNome} {self.__ultimoNome}"

    @property
    def email(self):
        return self.__primeiroNome + "." + self.__ultimoNome + "@empresa.pt"


    def mostrarPremio(self):
        return Funcionario.premioAnual * self.__salario

    @staticmethod
    def boasVindas():
        return "Bem vindo à empresa"

    @staticmethod
    def mostrarProporcaoPremio():
        print(Funcionario.premioAnual)

    @nomeCompleto.setter
    def nomeCompleto(self, nome):
        primeiro, ultimo = nome.split(" ")
        self.__primeiroNome = primeiro
        self.__ultimoNome = ultimo

    @nomeCompleto.deleter
    def nomeCompleto(self):
        self.__primeiroNome = None
        self.__ultimoNome = None


# f1 = Funcionario("António", "Alves", 1000)
# f1.mostrarProporcaoPremio() # 1.5
# print(f1.nomeCompleto) # António Alves
# f1.nomeCompleto = "Bernardo Bento"
# print(f1) # Bernardo Bento [Bernardo.Bento@empresa.pt]: 1000€
# del f1.nomeCompleto
# print(f1.__dict__) # {'_Funcionario__primeiroNome': None, '_Funcionario__ultimoNome': None, '_Funcionario__salario': 1000}
# # print(f1.__primeiroNome) # António # AttributeError: 'Funcionario' object has no attribute '__primeiroNome'
# print(f1.__dict__) # {'primeiroNome': 'António', 'ultimoNome': 'Alves', 'salario': 1000, 'email': 'António.Alves@empresa.pt'}
# # print(f1) # <main.Funcionario object at 0x000001889A097D60> # António Alves [António.Alves@empresa.pt]: 1000€


class Programador(Funcionario):

    def __init__(self, primeiroNome, ultimoNome, salario, linguagem):
        super().__init__(primeiroNome, ultimoNome, salario)
        self.linguagem = linguagem

    def __str__(self):
        return f"{super().__str__()} => {self.linguagem}"

p1 = Programador("Bernardo","Bento",1000,"Python")
print(p1) # Bernardo Bento [Bernardo.Bento@empresa.pt]: 1000€ => Python
