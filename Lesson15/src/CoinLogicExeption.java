class CoinLogicException extends Exception {

    public CoinLogicException() {
    }

    public CoinLogicException(final String message) {
        super(message);
    }

    public CoinLogicException(final Throwable cause) {
        super(cause);
    }

    public CoinLogicException(final String message, final Throwable cause) {
        super(message, cause);
    }

}