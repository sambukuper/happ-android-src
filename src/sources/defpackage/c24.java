package defpackage;

import io.sentry.c2;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c24 implements Serializable {
    public transient Serializable X;

    public c24(int i, int i2) {
        lu5 lu5Var = new lu5();
        lu5Var.c = -1L;
        lu5Var.b = 16;
        lu5Var.a = (byte) 16;
        boolean z = i >= 0;
        int i3 = wu5.q0;
        if (!z) {
            kp5.e();
            throw null;
        }
        lu5Var.b = i;
        long j = i2;
        if (j < 0) {
            kp5.e();
            throw null;
        }
        lu5Var.c = j;
        lu5Var.a = (byte) 4;
        if (j >= 0) {
            this.X = new wu5(lu5Var);
        } else {
            c2.g();
            throw null;
        }
    }
}
