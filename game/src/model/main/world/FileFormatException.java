package model.main.world;

/**
 * An exception indicating an invalid file format
 */
@SuppressWarnings("serial")
public class FileFormatException extends Exception {

    public FileFormatException() {
	super();
    }

    public FileFormatException(String s) {
	super(s);
    }

}
