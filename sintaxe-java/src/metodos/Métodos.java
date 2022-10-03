package metodos;

public class Métodos {
    public static void main(String[] args) {
        
        /*Deve ser nomeado como verbo
        Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).
        Exemplos sugeridos para nomenclatura de métodos:
        */
        //somar(int n1, int n2){}
        
        //abrirConexao(){}
        
        //concluirProcessamento() {}
        
        //findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
        
        //calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade



        /*
        Quais os parâmetros serão necessários para execução do método? Os métodos as vezes precisam de argumentos como critérios para a execução.
        O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
        Qual a visibilidade do método? Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria classe.
         */

        //public class MyClass {
	
            //public double somar(int num1, int num2){
                //LOGICA - FINALIDADE DO MÉTODO
                //return ... ;
            }
            
            public void imprimir(String texto){
                //LOGICA - FINALIDADE DO MÉTODO
                //AQUI NÃO PRECISA DO RETURN
                //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
            }
            // throws Exception : indica que o método ao ser utilizado
            // poderá gerar uma exceção
            //public double dividir(int dividendo, int divisor) throws Exception{}
            
            // este método não pode ser visto por outras classes no projeto
            private void metodoPrivado(){}
            
            //alguns equívocos estruturais
            public void validar(){
                //este método deveria retornar algum valor
                //no caso boolean (true ou false)
            }
            public void calcularEnviar(){
                //um método deve representar uma única responsabilidade
            }
            public void gravarCliente(String nome, String cpf, Integer telefone){
                //este método tem a finalidade de gravar
                //informações de um cliente, por que não criar
                //um objeto cliente e passar como parâmetro ?
                //veja abaixo
            }
        }
            //public void gravarCliente(Cliente cliente){}
            //ou
            //public void gravar(Cliente cliente){}   

        
