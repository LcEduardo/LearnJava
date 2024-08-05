public class AulaClassesObjetos {
    
    public static class Predio {

        private String cor;
        private int andares;
        private int janelas;

        public Predio(String cor, int andares, int janelas){

            this.cor = cor;
            this.andares = andares;
            this.janelas = janelas;
        }

        public String getCor(){
            return cor;
        }

        public int getAndares(){
            return andares;
        }

        public int getJanelas(){
            return janelas;
        }

        public void setCor(String cor){
            this.cor = cor;
        }

        public void setAndares(int andares){
            this.andares = andares;
        }

        public void setJanelas(int janelas){
            this.janelas = janelas;
        }

        public void imprimirInfo(){
            System.out.println("Cor: " + cor + " | " + "Quantidade de andares: " + andares + " | " + "Quantidade de janelas: " + janelas);
        }
    }    
    public static void main(String[] args) {

        Predio predio1 = new Predio("Amarelo", 10, 20);

        predio1.imprimirInfo();
    }
}
