public class SearchPage implements TerminalPage {
    private String header = "Search for a Product\n";
    private String prompt = "Enter the name of the product you want to search for: ";
    private String searchResult = "";

    @Override
    public void display() {
        TerminalManager.clearScreen();
        System.out.print(header);
        System.out.print(prompt);
    }

    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }

    public void displaySearchResult() {
        TerminalManager.clearScreen();
        System.out.println(header);
        if (searchResult.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Search results:");
            System.out.println(searchResult);
        }
    }
}
