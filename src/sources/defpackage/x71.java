package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x71 {
    public static final /* synthetic */ x71[] X = {new x71("AGREEMENT", 0), new x71("ENCRYPTION", 1), new x71("DECRYPTION", 2), new x71("KEYGEN", 3), new x71("SIGNING", 4), new x71("VERIFYING", 5), new x71("AUTHENTICATION", 6), new x71("VERIFICATION", 7), new x71("PRF", 8), new x71("ANY", 9)};

    /* JADX INFO: Fake field, exist only in values array */
    x71 EF5;

    public static x71 valueOf(String str) {
        return (x71) Enum.valueOf(x71.class, str);
    }

    public static x71[] values() {
        return (x71[]) X.clone();
    }
}
