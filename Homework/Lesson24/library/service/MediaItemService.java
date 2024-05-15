package Lesson24.library.service;


import Lesson18hw.company.UserInput;
import Lesson24.library.entity.LibraryElement;
import Lesson24.library.entity.Reader;

public static class MediaItemService {
    private LibraryElement[] libraryElements = new LibraryElement[10];
    UserInput ui = new UserInput();
    private int itemCont = 0;

    public void addMediaItem(LibraryElement newItem){
        if (itemCont < libraryElements.length) {
            libraryElements[itemCont] = newItem;
            itemCont++;
            System.out.println("New media item added: " + newItem.getTitle());
        } else {
            System.out.println("Library is full, cannot add more items");
        }
    }
    public LibraryElement findMediaItemById(){
        int itemId = ui.inputInt("Введите ID издания: ");
        for (int i = 0; i < libraryElements.length; i++) {
            if (libraryElements[i].getId() == itemId){
                return libraryElements[i];
            }
        }
        return null;
    }
    //дописать метод
//    public boolean changeMediItemReader (int readersId, Reader[] readers){
//        for (int i = 0; i < libraryElements.length; i++) {
//            if (libraryElements[i].getReader() == ){
//                return libraryElements[i];
//            }
//        }
//        return null;
//    }

    }

//    public void printAllItems(){
//        System.out.println("Library catalog: ");
//
//        for (int i = 0; i < mediaItems.length; i++) {
//            if (mediaItems[i] != null) {
//                mediaItems[i].printInfo();
//            }
        }
    }
//}
