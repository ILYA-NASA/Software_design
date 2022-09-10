// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

public class Ex005_2DIP {
    public static void main(String[] args) {
        BookDIP bookDIP = new BookDIP(new ConsoleViewDIP());
        bookDIP.viewAuthor();
    }
}

interface ViewDIP {
    void print(String text);
}

class ConsoleViewDIP implements ViewDIP {
    public void print(String text) {
        String result = String.format("ConsoleViewDIP %s", text);
        System.out.println(result);
    }
}

class WinFormViewDIP implements ViewDIP {
    public void print(String text) {
        String result = String.format("WinFormViewDIP %s", text);
        System.out.println(result);
    }
}

class BookDIP {
    ViewDIP view;

    public void setView(ViewDIP view) {
        this.view = view;
    }

    int indexPage;

    public BookDIP(ViewDIP view) {
        this.view = view;
        indexPage = 1;
    }

    public void viewTitle() {
        view.print("Заголовок книги");
    }

    public void viewAuthor() {
        view.print("Авторы книги");
    }

    public void turnPage(int page) {
        if (page >= 1 && page <= 300)
            this.indexPage = page;
    }

    public void viewCurrentPage() {
        view.print(String.format("Страница: %s", indexPage));
    }
}