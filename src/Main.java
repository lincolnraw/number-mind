void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int generatedNumber = new Random().nextInt(100);
    int guessedNumber = 0;
    int attempts = 0;
    int score = 0;

    while (attempts < 5) {
        System.out.println("Digite um número entre 0 e 100:");
        guessedNumber = reader.nextInt();
        attempts++;

        if (guessedNumber == generatedNumber) {
            score = 120 - (attempts * 20 );
            System.out.println("Parabéns, você acertou o número em: " + attempts + " tentativas!");
            System.out.println("Seu score foi: " + score);
            break;
        } else if (guessedNumber < generatedNumber) {
            System.out.println("O número digitado é menor do que o número gerado.");
        } else if (guessedNumber > generatedNumber) {
            System.out.println("O número digitado é maior do que o número gerado.");
        }
    if (attempts == 5 && guessedNumber != generatedNumber) {
        System.out.println("Você não conseguiu acertar o número em 05 tentativas");
        System.out.println("O número secreto era: " + generatedNumber);
        System.out.println("Seu score foi: " + score);

        }
    }
}