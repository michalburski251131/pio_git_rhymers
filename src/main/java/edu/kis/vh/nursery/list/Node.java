package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca pojedynczy węzeł w strukturze danych listy dwukierunkowej.
 * Z węzła możemy dostać się do węzła poprzedniego i następnego,
 * dzieki temu że klasa przechowuje referencje do nich.
 *
 */
public class Node {
    private final int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor tworzący węzeł z określoną wartością.
     *
     * @param i wartość przechowywana w węźle
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Zwraca referencję do następnego węzła w liście.
     *
     * @return następny węzeł w liście
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawia referencję do następnego węzła w liście.
     *
     * @param next węzeł, który ma być ustawiony jako następny
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Zwraca wartości węzła.
     *
     * @return wartość przechowywana w węźle
     */
    public int getValue() {
        return value;
    }

    /**
     * Zwraca poprzedniego węzła
     *
     * @return poprzedni węzeł w liście
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Ustawia referencję poprzedniego węzła w obecnym węźle
     *
     * @param prev węzeł, który ma być ustawiony jako poprzedni
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
