package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c26 {
    public static final c26 X;
    public static final /* synthetic */ c26[] Y;

    static {
        c26 c26Var = new c26("DEFAULT", 0);
        X = c26Var;
        c26 c26Var2 = new c26("UNMETERED_ONLY", 1);
        c26 c26Var3 = new c26("UNMETERED_OR_DAILY", 2);
        c26 c26Var4 = new c26("FAST_IF_RADIO_AWAKE", 3);
        c26 c26Var5 = new c26("NEVER", 4);
        c26 c26Var6 = new c26("UNRECOGNIZED", 5);
        Y = new c26[]{c26Var, c26Var2, c26Var3, c26Var4, c26Var5, c26Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, c26Var);
        sparseArray.put(1, c26Var2);
        sparseArray.put(2, c26Var3);
        sparseArray.put(3, c26Var4);
        sparseArray.put(4, c26Var5);
        sparseArray.put(-1, c26Var6);
    }

    public static c26 valueOf(String str) {
        return (c26) Enum.valueOf(c26.class, str);
    }

    public static c26[] values() {
        return (c26[]) Y.clone();
    }
}
