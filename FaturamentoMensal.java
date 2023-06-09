public class FaturamentoMensal {

    public static void main(String[] args) {
        // Valor de faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        // Valor total mensal
        double total = sp + rj + mg + es + outros;
        
        // Percentual de representação de cada estado
        double percentualSp = (sp / total) * 100;
        double percentualRj = (rj / total) * 100;
        double percentualMg = (mg / total) * 100;
        double percentualEs = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;
        
        // Imprime os percentuais
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSp);
        System.out.printf("RJ: %.2f%%\n", percentualRj);
        System.out.printf("MG: %.2f%%\n", percentualMg);
        System.out.printf("ES: %.2f%%\n", percentualEs);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }

}
