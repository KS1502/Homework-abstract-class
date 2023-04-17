public abstract class Homework {
    private String input;

    public Homework(String input){
        this.input= input;
    }
    public String getInput(String input){
        return input.toUpperCase();
    }


    public void setInput(String input) {
        this.input = input;
    }

    public void wordsWithAStar() {

    }
    public void toLowerCase(){

    }
    public void toUpperCase(){

    }
}

/*Решить задачу 2 из предыдущего домашнего задания другим методом - без интерфейсов.
    Использовать свойства наследования классов (абстрактные классы).

Метод должен позволять изменять слова в строке следующим образом:
1. при длине слова= 3, изменять все буквы этого слова на заглавные
2. при длине слова= 4, изменить все буквы слова на строчные
3. при длине слова= 5, изменить все буквы слова на звездочки
Протестировать. */
