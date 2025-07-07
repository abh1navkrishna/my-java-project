abstract class Google {
    abstract void search();

    void message() {
        System.out.println("Tank you for using google.");
    }

}

class SearchAll extends Google {
    void search() {
        System.out.println("All search results.");
    }
}

class ImageSearch extends Google {
    void search() {
        System.out.println("Image search results.");
    }
}

class VideoSearch extends Google {
    void search() {
        System.out.println("Video search results.");
    }
}