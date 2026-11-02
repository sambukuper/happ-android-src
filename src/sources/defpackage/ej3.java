package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ej3 {
    public static final np3 c;
    public final String a;
    public final String b;

    static {
        v97 v97Var = new v97();
        v97Var.a(pj5.class, new mz2((byte) 1));
        v97Var.a(lz2.class, new mz2((byte) 0));
        np3 np3Var = new np3();
        np3Var.c(xp4.v0, true);
        np3Var.e(v97Var);
        c = np3Var;
    }

    public ej3(vk1 vk1Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        try {
            np3 np3Var = c;
            this.a = np3Var.f(new lz2(linkedHashMap));
            this.b = np3Var.f(new pj5(linkedHashMap2));
        } catch (lq3 e) {
            throw new dj3("Some of the Claims couldn't be converted to a valid JSON format.", e);
        }
    }
}
