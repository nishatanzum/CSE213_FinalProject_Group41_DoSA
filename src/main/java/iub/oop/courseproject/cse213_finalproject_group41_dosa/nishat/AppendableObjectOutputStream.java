package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException{
        super (out);
    }

    protected void writeStreamHeader() throws IOException{

    }

}
