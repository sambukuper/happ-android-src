package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cm {
    public static final cm X;
    public static final cm Y;
    public static final /* synthetic */ cm[] Z;

    static {
        cm cmVar = new cm("CALL_BY_NAME", 0);
        X = cmVar;
        cm cmVar2 = new cm("POSITIONAL_CALL", 1);
        Y = cmVar2;
        Z = new cm[]{cmVar, cmVar2};
    }

    public static cm valueOf(String str) {
        return (cm) Enum.valueOf(cm.class, str);
    }

    public static cm[] values() {
        return (cm[]) Z.clone();
    }
}
