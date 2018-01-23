package hello;

public enum FileType {
    Delimited('D'), Fixed('F');
    public char filetypesymbol;

    FileType(char filetypesymbol) {
        this.filetypesymbol = filetypesymbol;
    }

    public String getName() {
        return this.toString();
    }

    public String getFolderName() {
        String folderName ="";
        if (filetypesymbol == 'D') {
            folderName = "FIXED";
        } else if (filetypesymbol == 'F') {
            folderName = "DELIMITED";
        }
        return folderName;
    }
}
