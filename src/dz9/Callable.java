package dz9;

public interface Callable<T> {
    String receiveCall(String name);

    public String length();

    class NameException extends Exception {
        private String name;

        public String getName(String name) throws NameException {
            if (name.length() < 4){
                throw new NameException("The name must be longer than 4 characters", name);
            }else
            return name;
        }

        public NameException(String message, String name) {
            super(message);
            this.name = name;
        }
    }
}