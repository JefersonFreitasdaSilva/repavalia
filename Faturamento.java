import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Faturamento {
    public static void main(String[] args) {
        List<Double> faturamentoDiario = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("faturamento.json"));
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                Double faturamento = (Double) jsonObject.get("faturamento");
                faturamentoDiario.add(faturamento);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
            return;
        }
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        for (double faturamento : faturamentoDiario) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
        }
        System.out.printf("Menor faturamento diário: %.2f\n", menorFaturamento);
        System.out.printf("Maior faturamento diário: %.2f\n", maiorFaturamento);

        double totalFaturamento = 0;
        int numDiasComFaturamento = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                totalFaturamento += faturamento;
                numDiasComFaturamento++;
            }
        }
        double mediaMensal = totalFaturamento / numDiasComFaturamento;

        int numDiasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                numDiasAcimaDaMedia++;
            }
        }
        System.out.printf("Número de dias com faturamento diário acima da média mensal: %d", numDiasAcimaDaMedia);
    }
}
