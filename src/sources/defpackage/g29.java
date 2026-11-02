package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g29 {
    public static final vz4 a;
    public static final e29[] b;

    static {
        vz4 vz4Var = new vz4(8);
        e29.a.getClass();
        f29 f29Var = d29.g;
        vz4Var.h(1, f29Var);
        f29 f29Var2 = d29.f;
        vz4Var.h(2, f29Var2);
        f29 f29Var3 = d29.b;
        vz4Var.h(4, f29Var3);
        f29 f29Var4 = d29.d;
        vz4Var.h(8, f29Var4);
        f29 f29Var5 = d29.h;
        vz4Var.h(16, f29Var5);
        f29 f29Var6 = d29.e;
        vz4Var.h(32, f29Var6);
        f29 f29Var7 = d29.i;
        vz4Var.h(64, f29Var7);
        f29 f29Var8 = d29.c;
        vz4Var.h(128, f29Var8);
        a = vz4Var;
        b = new e29[]{f29Var, f29Var2, f29Var3, f29Var7, f29Var5, f29Var6, f29Var4, d29.j, f29Var8};
    }

    public static final void a(ti4 ti4Var, gd3 gd3Var, long j, int i, int i2) {
        if (d28.b(j, -1L)) {
            return;
        }
        float f = (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f2 = (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f3 = i - ((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f4 = i2 - ((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        ti4Var.a(gd3Var.b, f);
        ti4Var.a(gd3Var.c, f2);
        ti4Var.a(gd3Var.d, f3);
        ti4Var.a(gd3Var.e, f4);
    }
}
