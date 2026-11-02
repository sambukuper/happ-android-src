package defpackage;

import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om0 implements pm0, p63, ts1, a85 {
    public final /* synthetic */ byte X;

    public /* synthetic */ om0(lr lrVar) {
        this.X = (byte) 1;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void c(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new p14(str + obj + obj2 + obj3 + ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    @Override // defpackage.ts1
    public double a(double d) {
        switch (this.X) {
            case 10:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 11:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                float[] fArr = nw0.a;
                return nw0.b(nw0.c, d);
            case 13:
                float[] fArr2 = nw0.a;
                return nw0.a(nw0.c, d);
            case 14:
                float[] fArr3 = nw0.a;
                return nw0.d(nw0.d, d);
            default:
                float[] fArr4 = nw0.a;
                return nw0.c(nw0.d, d);
        }
    }

    @Override // defpackage.a85
    public Object d() {
        switch (this.X) {
            case 18:
                return new ArrayList();
            case 19:
                return new ConcurrentHashMap();
            case 20:
                return new ConcurrentSkipListMap();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new LinkedHashSet();
            case 22:
                return new TreeSet();
            case 23:
                return new ArrayDeque();
            case 24:
                return new ya4(true);
            case 25:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // defpackage.p63
    public void k(q63 q63Var) throws Exception {
        try {
            n63 n63VarD = q63Var.d();
            hi5.z0("CaptureNode");
            if (n63VarD != null) {
                s08.b();
                Objects.toString(n63VarD);
                hi5.z0("CaptureNode");
                n63VarD.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public /* synthetic */ om0(byte b) {
        this.X = b;
    }

    @Override // defpackage.pm0
    public void cancel() {
    }
}
