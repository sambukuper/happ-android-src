package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nu6 {
    public static final nu6 X;
    public static final nu6 Y;
    public static final nu6 Z;
    public static final nu6 f0;
    public static final HashMap g0;
    public static final /* synthetic */ nu6[] h0;

    /* JADX INFO: Fake field, exist only in values array */
    nu6 EF1;

    static {
        nu6 nu6Var = new nu6("svg", 0);
        nu6 nu6Var2 = new nu6("a", 1);
        nu6 nu6Var3 = new nu6("circle", 2);
        nu6 nu6Var4 = new nu6("clipPath", 3);
        nu6 nu6Var5 = new nu6("defs", 4);
        nu6 nu6Var6 = new nu6("desc", 5);
        X = nu6Var6;
        nu6 nu6Var7 = new nu6("ellipse", 6);
        nu6 nu6Var8 = new nu6("g", 7);
        nu6 nu6Var9 = new nu6("image", 8);
        nu6 nu6Var10 = new nu6("line", 9);
        nu6 nu6Var11 = new nu6("linearGradient", 10);
        nu6 nu6Var12 = new nu6("marker", 11);
        nu6 nu6Var13 = new nu6("mask", 12);
        nu6 nu6Var14 = new nu6("path", 13);
        nu6 nu6Var15 = new nu6("pattern", 14);
        nu6 nu6Var16 = new nu6("polygon", 15);
        nu6 nu6Var17 = new nu6("polyline", 16);
        nu6 nu6Var18 = new nu6("radialGradient", 17);
        nu6 nu6Var19 = new nu6("rect", 18);
        nu6 nu6Var20 = new nu6("solidColor", 19);
        nu6 nu6Var21 = new nu6("stop", 20);
        nu6 nu6Var22 = new nu6("style", 21);
        nu6 nu6Var23 = new nu6("SWITCH", 22);
        Y = nu6Var23;
        nu6 nu6Var24 = new nu6("symbol", 23);
        nu6 nu6Var25 = new nu6("text", 24);
        nu6 nu6Var26 = new nu6("textPath", 25);
        nu6 nu6Var27 = new nu6("title", 26);
        Z = nu6Var27;
        nu6 nu6Var28 = new nu6("tref", 27);
        nu6 nu6Var29 = new nu6("tspan", 28);
        nu6 nu6Var30 = new nu6("use", 29);
        nu6 nu6Var31 = new nu6("view", 30);
        nu6 nu6Var32 = new nu6("UNSUPPORTED", 31);
        f0 = nu6Var32;
        h0 = new nu6[]{nu6Var, nu6Var2, nu6Var3, nu6Var4, nu6Var5, nu6Var6, nu6Var7, nu6Var8, nu6Var9, nu6Var10, nu6Var11, nu6Var12, nu6Var13, nu6Var14, nu6Var15, nu6Var16, nu6Var17, nu6Var18, nu6Var19, nu6Var20, nu6Var21, nu6Var22, nu6Var23, nu6Var24, nu6Var25, nu6Var26, nu6Var27, nu6Var28, nu6Var29, nu6Var30, nu6Var31, nu6Var32};
        g0 = new HashMap();
        for (nu6 nu6Var33 : values()) {
            if (nu6Var33 == Y) {
                g0.put("switch", nu6Var33);
            } else if (nu6Var33 != f0) {
                g0.put(nu6Var33.name(), nu6Var33);
            }
        }
    }

    public static nu6 valueOf(String str) {
        return (nu6) Enum.valueOf(nu6.class, str);
    }

    public static nu6[] values() {
        return (nu6[]) h0.clone();
    }
}
