package org.quiltmc.queso.json.gson;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Writer;

public class GsonWriter extends JsonWriter {
    private final org.quiltmc.queso.json.JsonWriter delegate;

    public GsonWriter(org.quiltmc.queso.json.JsonWriter writer) {
        super(Writer.nullWriter());
        this.delegate = writer;
    }

    public org.quiltmc.queso.json.JsonWriter getDelegate() {
        return delegate;
    }

    @Override
    public JsonWriter beginArray() throws IOException {
        delegate.beginArray();
        return this;
    }

    @Override
    public JsonWriter endArray() throws IOException {
        delegate.endArray();
        return this;
    }

    @Override
    public JsonWriter beginObject() throws IOException {
        delegate.beginObject();
        return this;
    }

    @Override
    public JsonWriter endObject() throws IOException {
        delegate.endObject();
        return this;
    }

    @Override
    public JsonWriter name(String name) throws IOException {
        delegate.name(name);
        return this;
    }

    @Override
    public JsonWriter value(String value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public JsonWriter jsonValue(String value) throws IOException {
        delegate.jsonValue(value);
        return this;
    }

    @Override
    public JsonWriter nullValue() throws IOException {
        delegate.nullValue();
        return this;
    }

    @Override
    public JsonWriter value(boolean value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public JsonWriter value(Boolean value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public JsonWriter value(float value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public JsonWriter value(double value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public JsonWriter value(long value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public JsonWriter value(Number value) throws IOException {
        delegate.value(value);
        return this;
    }

    @Override
    public void flush() throws IOException {
        delegate.flush();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
        super.close();
    }
}
