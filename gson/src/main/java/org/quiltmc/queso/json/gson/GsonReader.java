package org.quiltmc.queso.json.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.io.Reader;

/**
 * Adapts a Quilt {@link org.quiltmc.queso.json.JsonReader} to be used with GSON in methods like {@link com.google.gson.Gson#}
 */
public class GsonReader extends JsonReader {
    private final org.quiltmc.queso.json.JsonReader delegate;
    /**
     * Creates a new instance that reads a JSON-encoded stream from {@code in}.
     *
     */
    public GsonReader(org.quiltmc.queso.json.JsonReader reader) {
        super(Reader.nullReader());
        this.delegate = reader;
    }

    public org.quiltmc.queso.json.JsonReader getDelegate() {
        return delegate;
    }

    @Override
    public void beginArray() throws IOException {
        delegate.beginArray();
    }

    @Override
    public void endArray() throws IOException {
        delegate.endArray();
    }

    @Override
    public void beginObject() throws IOException {
        delegate.beginObject();
    }

    @Override
    public void endObject() throws IOException {
        delegate.endObject();
    }

    @Override
    public boolean hasNext() throws IOException {
        return delegate.hasNext();
    }

    @Override
    public JsonToken peek() throws IOException {
        return switch (delegate.peek()) {
            case BEGIN_ARRAY -> JsonToken.BEGIN_ARRAY;
            case END_ARRAY -> JsonToken.END_ARRAY;
            case BEGIN_OBJECT -> JsonToken.BEGIN_OBJECT;
            case END_OBJECT -> JsonToken.END_OBJECT;
            case NAME -> JsonToken.NAME;
            case STRING -> JsonToken.STRING;
            case NUMBER -> JsonToken.NUMBER;
            case BOOLEAN -> JsonToken.BOOLEAN;
            case NULL -> JsonToken.NULL;
            case END_DOCUMENT -> JsonToken.END_DOCUMENT;
        };
    }

    @Override
    public String nextName() throws IOException {
        return delegate.nextName();
    }

    @Override
    public String nextString() throws IOException {
        return delegate.nextString();
    }

    @Override
    public boolean nextBoolean() throws IOException {
        return delegate.nextBoolean();
    }

    @Override
    public void nextNull() throws IOException {
        delegate.nextNull();
    }

    @Override
    public double nextDouble() throws IOException {
        return delegate.nextDouble();
    }

    @Override
    public long nextLong() throws IOException {
        return delegate.nextLong();
    }

    @Override
    public int nextInt() throws IOException {
        return delegate.nextInt();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
        super.close();
    }

    @Override
    public void skipValue() throws IOException {
        delegate.skipValue();
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

    @Override
    public String getPreviousPath() {
        return delegate.getPreviousPath();
    }

    @Override
    public String getPath() {
        return delegate.getPath();
    }
}
