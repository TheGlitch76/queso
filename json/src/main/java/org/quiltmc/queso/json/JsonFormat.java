package org.quiltmc.queso.json;

/**
 * The JSON-family format to be used during parsing or writing.
 */
public enum JsonFormat {
    /**
     * The standard, (<a href="http://www.ietf.org/rfc/rfc7159.txt">RFC 7159</a>) JSON.
     *  JSON5</a> or strict JSON
     */
    JSON,
    /**
     * JSON, but with comments and trailing commas.
     */
    JSONC,
    /**
     * The <a href="https://json5.org/">JSON5</a> specification. Comments, bare keys,
     * more floating point numbers, and more.
      */
    JSON5
}
