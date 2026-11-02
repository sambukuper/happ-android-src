package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ev2 {
    public static final ev2 X;
    public static final ev2 Y;
    public static final ev2 Z;
    public static final /* synthetic */ ev2[] f0;

    static {
        ev2 ev2Var = new ev2("Cursor", 0);
        X = ev2Var;
        ev2 ev2Var2 = new ev2("SelectionStart", 1);
        Y = ev2Var2;
        ev2 ev2Var3 = new ev2("SelectionEnd", 2);
        Z = ev2Var3;
        f0 = new ev2[]{ev2Var, ev2Var2, ev2Var3};
    }

    public static ev2 valueOf(String str) {
        return (ev2) Enum.valueOf(ev2.class, str);
    }

    public static ev2[] values() {
        return (ev2[]) f0.clone();
    }
}
