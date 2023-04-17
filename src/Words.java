public class Words extends Homework{
     private String input = "AAA BBBB dEF cDkls bBb";

    public Words(String input) {
        super(input);
    }


    public String getInput(String input) {
        return input.toUpperCase();
    }

    @Override
    public void toUpperCase() {
        System.out.println("изменять все буквы этого слова на заглавные : "+input.toUpperCase());
        }

    @Override
    public void wordsWithAStar() {
        System.out.println("изменить все буквы слова на звездочки : "+(input.length()+("********")));
    }

    @Override
    public void toLowerCase() {
        System.out.println("изменить все буквы слова на строчные : "+input.toLowerCase());

    }
}
