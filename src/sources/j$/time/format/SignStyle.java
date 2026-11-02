package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class SignStyle {
    public static final SignStyle ALWAYS;
    public static final SignStyle EXCEEDS_PAD;
    public static final SignStyle NEVER;
    public static final SignStyle NORMAL;
    public static final SignStyle NOT_NEGATIVE;
    public static final /* synthetic */ SignStyle[] a;

    static {
        SignStyle signStyle = new SignStyle("NORMAL", 0);
        NORMAL = signStyle;
        SignStyle signStyle2 = new SignStyle("ALWAYS", 1);
        ALWAYS = signStyle2;
        SignStyle signStyle3 = new SignStyle("NEVER", 2);
        NEVER = signStyle3;
        SignStyle signStyle4 = new SignStyle("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = signStyle4;
        SignStyle signStyle5 = new SignStyle("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = signStyle5;
        a = new SignStyle[]{signStyle, signStyle2, signStyle3, signStyle4, signStyle5};
    }

    public static SignStyle valueOf(String str) {
        return (SignStyle) Enum.valueOf(SignStyle.class, str);
    }

    public static SignStyle[] values() {
        return (SignStyle[]) a.clone();
    }
}
