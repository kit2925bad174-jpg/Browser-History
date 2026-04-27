 package dsproject;
import java.util.Stack;
public class BrowserHistory {
private static final int MAX_SIZE = 10;
private Stack<String> history = new Stack<>();
public boolean isValidURL(String url) {
    return url.matches("^(https?://)?(www\\.)?[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(/.*)?$");
}
public void visitPage(String url) {
    if (!isValidURL(url)) {
        System.out.println("Invalid URL: " + url);
        return;
    }
    if (history.size() == MAX_SIZE) {
        System.out.println("History is full!");
        return;
    }
    history.push(url);
    System.out.println("Visited: " + url);
}
public void popTwoPages() {   
    if (!history.isEmpty()) {
        System.out.println("Removed: " + history.pop());
    } else {
        System.out.println("No pages to go back.");
    }

    if (!history.isEmpty()) {
        System.out.println("Removed: " + history.pop());
    } else {
        System.out.println("No pages to go back.");
    }
}
public void currentPage() {
    if (history.isEmpty()) {
        System.out.println("No current page.");
    } else {
        System.out.println("Current Page: " + history.peek());
    }
}
}
