public class ElementsCounter {

    public static void main(String[] args) {
        Integer[] list = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};

        MapElementsCounter mapElementsCounter = new MapElementsCounter(list);

        System.out.println(mapElementsCounter.getMap());
    }
}
