package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xb0 {
    public static final xb0 X;
    public static final xb0 Y;
    public static final xb0 Z;
    public static final xb0 f0;
    public static final HashMap g0;
    public static final /* synthetic */ xb0[] h0;

    /* JADX INFO: Fake field, exist only in values array */
    xb0 EF1;

    static {
        xb0 xb0Var = new xb0("target", 0);
        xb0 xb0Var2 = new xb0("root", 1);
        xb0 xb0Var3 = new xb0("nth_child", 2);
        X = xb0Var3;
        xb0 xb0Var4 = new xb0("nth_last_child", 3);
        xb0 xb0Var5 = new xb0("nth_of_type", 4);
        Y = xb0Var5;
        xb0 xb0Var6 = new xb0("nth_last_of_type", 5);
        Z = xb0Var6;
        xb0 xb0Var7 = new xb0("first_child", 6);
        xb0 xb0Var8 = new xb0("last_child", 7);
        xb0 xb0Var9 = new xb0("first_of_type", 8);
        xb0 xb0Var10 = new xb0("last_of_type", 9);
        xb0 xb0Var11 = new xb0("only_child", 10);
        xb0 xb0Var12 = new xb0("only_of_type", 11);
        xb0 xb0Var13 = new xb0("empty", 12);
        xb0 xb0Var14 = new xb0("not", 13);
        xb0 xb0Var15 = new xb0("lang", 14);
        xb0 xb0Var16 = new xb0("link", 15);
        xb0 xb0Var17 = new xb0("visited", 16);
        xb0 xb0Var18 = new xb0("hover", 17);
        xb0 xb0Var19 = new xb0("active", 18);
        xb0 xb0Var20 = new xb0("focus", 19);
        xb0 xb0Var21 = new xb0("enabled", 20);
        xb0 xb0Var22 = new xb0("disabled", 21);
        xb0 xb0Var23 = new xb0("checked", 22);
        xb0 xb0Var24 = new xb0("indeterminate", 23);
        xb0 xb0Var25 = new xb0("UNSUPPORTED", 24);
        f0 = xb0Var25;
        h0 = new xb0[]{xb0Var, xb0Var2, xb0Var3, xb0Var4, xb0Var5, xb0Var6, xb0Var7, xb0Var8, xb0Var9, xb0Var10, xb0Var11, xb0Var12, xb0Var13, xb0Var14, xb0Var15, xb0Var16, xb0Var17, xb0Var18, xb0Var19, xb0Var20, xb0Var21, xb0Var22, xb0Var23, xb0Var24, xb0Var25};
        g0 = new HashMap();
        for (xb0 xb0Var26 : values()) {
            if (xb0Var26 != f0) {
                g0.put(xb0Var26.name().replace('_', '-'), xb0Var26);
            }
        }
    }

    public static xb0 valueOf(String str) {
        return (xb0) Enum.valueOf(xb0.class, str);
    }

    public static xb0[] values() {
        return (xb0[]) h0.clone();
    }
}
