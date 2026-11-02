package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s82 {
    public static final s82 X;
    public static final s82 Y;
    public static final s82 Z;
    public static final s82 f0;
    public static final /* synthetic */ s82[] g0;
    public static final /* synthetic */ n22 h0;

    static {
        s82 s82Var = new s82("DYNAMIC_RANGE", 0);
        X = s82Var;
        s82 s82Var2 = new s82("FPS_RANGE", 1);
        Y = s82Var2;
        s82 s82Var3 = new s82("VIDEO_STABILIZATION", 2);
        Z = s82Var3;
        s82 s82Var4 = new s82("IMAGE_FORMAT", 3);
        f0 = s82Var4;
        s82[] s82VarArr = {s82Var, s82Var2, s82Var3, s82Var4, new s82("RECORDING_QUALITY", 4)};
        g0 = s82VarArr;
        h0 = new n22(s82VarArr);
    }

    public static s82 valueOf(String str) {
        return (s82) Enum.valueOf(s82.class, str);
    }

    public static s82[] values() {
        return (s82[]) g0.clone();
    }
}
