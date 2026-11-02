package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz7 implements ao2 {
    public static final dz7 a = new dz7();

    public final dq a(ba0 ba0Var) {
        InputStream inputStreamY0 = ba0Var.Y0();
        pu6 pu6Var = new pu6();
        pu6Var.a = null;
        pu6Var.b = null;
        pu6Var.c = false;
        pu6Var.e = false;
        pu6Var.f = null;
        pu6Var.g = null;
        pu6Var.h = false;
        pu6Var.i = null;
        if (!inputStreamY0.markSupported()) {
            inputStreamY0 = new BufferedInputStream(inputStreamY0);
        }
        try {
            inputStreamY0.mark(3);
            int i = inputStreamY0.read() + (inputStreamY0.read() << 8);
            inputStreamY0.reset();
            if (i == 35615) {
                inputStreamY0 = new BufferedInputStream(new GZIPInputStream(inputStreamY0));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamY0.mark(4096);
            pu6Var.B(inputStreamY0);
            return new dq((Object) pu6Var.a, (byte) 11);
        } finally {
            try {
                inputStreamY0.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // defpackage.ao2
    public final on2 b() {
        return new no2(1, hi5.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dz7) && (obj instanceof ao2)) {
            return b().equals(((ao2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
