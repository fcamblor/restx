package restx.specs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import static restx.common.MoreStrings.indent;

/**
* @author xavierhanin
*/
public class ThenHttpResponse implements Then {
    private final int expectedCode;
    private final String expected;

    @JsonCreator
    public ThenHttpResponse(@JsonProperty("expectedCode") int expectedCode,
                            @JsonProperty("expected") String expected) {
        this.expectedCode = expectedCode;
        this.expected = expected;
    }

    public String getExpected() {
        return expected;
    }

    public int getExpectedCode() {
        return expectedCode;
    }

    public void toString(StringBuilder sb) {
        sb.append("    then: |").append(System.lineSeparator());
        if (expectedCode != 200) {
            sb.append("       ").append(expectedCode).append(System.lineSeparator()).append(System.lineSeparator());
        }
        sb.append(indent(expected, 8)).append(System.lineSeparator());
    }
}
