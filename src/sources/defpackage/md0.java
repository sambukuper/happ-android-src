package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class md0 implements Serializable, tm {
    public static final md0 Y = new md0(0);
    public static final md0 Z = new md0(1);
    public static final md0 f0 = new md0(2);
    public static final md0 g0 = new md0(3);
    public final /* synthetic */ byte X;

    public /* synthetic */ md0(byte b) {
        this.X = b;
    }

    @Override // defpackage.tm
    public Annotation a(Class cls) {
        return null;
    }

    public void b(int i) throws xk7 {
        if (i > 1000) {
            throw new xk7(String.format("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), Integer.valueOf(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax), "`StreamWriteConstraints.getMaxNestingDepth()`"));
        }
    }

    @Override // defpackage.tm
    public int size() {
        return 0;
    }

    public String toString() {
        switch (this.X) {
            case 7:
                return "Notification=>Completed";
            case 8:
                return "Notification=>NULL";
            default:
                return super.toString();
        }
    }
}
