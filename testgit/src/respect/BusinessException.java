package respect;

/**
 * Created by qumingyang on 2017/9/11.
 */
public class BusinessException extends RuntimeException {
    /**
     *Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 6832695224568830049L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, String code) {
        super(message);
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
