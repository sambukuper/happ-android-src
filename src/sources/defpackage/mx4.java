package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mx4 {
    public final AndroidComposeView a;
    public j05 b;
    public j05 c;
    public j05 d;
    public j05 e;
    public boolean f;

    public mx4(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static void b(jx4 jx4Var, r06 r06Var) {
        if (!jx4Var.X.p0) {
            wc3.b("visitSubtreeIf called on an unattached node");
        }
        c15 c15Var = new c15(0, new jx4[16]);
        jx4 jx4Var2 = jx4Var.X;
        jx4 jx4Var3 = jx4Var2.h0;
        if (jx4Var3 == null) {
            yn0.n(c15Var, jx4Var2);
        } else {
            c15Var.b(jx4Var3);
        }
        while (true) {
            int i = c15Var.Z;
            if (i == 0) {
                return;
            }
            jx4 jx4Var4 = (jx4) c15Var.k(i - 1);
            if ((jx4Var4.f0 & 32) != 0) {
                jx4 jx4Var5 = jx4Var4;
                while (true) {
                    if (jx4Var5 != null && jx4Var5.p0) {
                        if ((jx4Var5.Z & 32) != 0) {
                            ?? T = jx4Var5;
                            ?? c15Var2 = 0;
                            while (T != 0) {
                                if (T instanceof nx4) {
                                    if (((nx4) T).Z().v(r06Var)) {
                                        break;
                                    }
                                } else if ((T.Z & 32) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var6 = ((oh1) T).r0;
                                    int i2 = 0;
                                    T = T;
                                    c15Var2 = c15Var2;
                                    while (jx4Var6 != null) {
                                        if ((jx4Var6.Z & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c15Var2 = c15Var2;
                                                T = jx4Var6;
                                            } else {
                                                if (c15Var2 == 0) {
                                                    c15Var2 = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var2.b(T);
                                                    T = 0;
                                                }
                                                c15Var2.b(jx4Var6);
                                            }
                                        }
                                        jx4Var6 = jx4Var6.h0;
                                        T = T;
                                        c15Var2 = c15Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                T = yn0.T(c15Var2);
                            }
                        }
                        jx4Var5 = jx4Var5.h0;
                    }
                }
            }
            yn0.n(c15Var, jx4Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        tb2 tb2Var = new tb2(this, (byte) 22);
        j05 j05Var = this.a.r1;
        if (j05Var.e(tb2Var)) {
            return;
        }
        j05Var.a(tb2Var);
    }
}
