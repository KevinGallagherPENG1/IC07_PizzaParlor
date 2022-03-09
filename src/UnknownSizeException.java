public class UnknownSizeException extends Exception{

    public UnknownSizeException()
    {
        super("That size is unavailable, please choose between S, M, or L.");
    }
}
