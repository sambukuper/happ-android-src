package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n73 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    public /* synthetic */ n73(int i, int i2, byte b) {
        this.X = b;
        this.Y = i;
        this.Z = i2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107 A[SYNTHETIC] */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        int length;
        int i;
        long j;
        mi5 mi5Var;
        char cCharAt;
        byte b = this.X;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        int i2 = this.Z;
        int i3 = this.Y;
        switch (b) {
            case 0:
                g48 g48Var = (g48) obj;
                if (i3 < 0 || i2 < 0) {
                    zc3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                int iD = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = iD + 1;
                    long j2 = g48Var.i0;
                    mi5 mi5Var2 = g48Var.Z;
                    int iD2 = f88.d(j2);
                    long j3 = g48Var.i0;
                    if (iD2 <= i5) {
                        iD = f88.d(j3);
                        length = 0;
                        for (int i6 = 0; i6 < i2; i6++) {
                            i = length + 1;
                            j = g48Var.i0;
                            mi5Var = g48Var.Z;
                            if (f88.c(j) + i < mi5Var.length()) {
                                length = mi5Var.length() - f88.c(g48Var.i0);
                                w79.D(g48Var, f88.c(g48Var.i0), f88.c(g48Var.i0) + length);
                                w79.D(g48Var, f88.d(g48Var.i0) - iD, f88.d(g48Var.i0));
                                return dn8.a;
                            }
                            cCharAt = mi5Var.charAt((f88.c(g48Var.i0) + i) - 1);
                            char cCharAt2 = mi5Var.charAt(f88.c(g48Var.i0) + i);
                            if (Character.isHighSurrogate(cCharAt) || !Character.isLowSurrogate(cCharAt2)) {
                                length = i;
                            } else {
                                length += 2;
                            }
                        }
                        w79.D(g48Var, f88.c(g48Var.i0), f88.c(g48Var.i0) + length);
                        w79.D(g48Var, f88.d(g48Var.i0) - iD, f88.d(g48Var.i0));
                        return dn8.a;
                    }
                    iD = (Character.isHighSurrogate(mi5Var2.charAt((f88.d(j3) - i5) - 1)) && Character.isLowSurrogate(mi5Var2.charAt(f88.d(g48Var.i0) - i5))) ? iD + 2 : i5;
                }
                length = 0;
                while (i6 < i2) {
                    i = length + 1;
                    j = g48Var.i0;
                    mi5Var = g48Var.Z;
                    if (f88.c(j) + i < mi5Var.length()) {
                        length = mi5Var.length() - f88.c(g48Var.i0);
                        w79.D(g48Var, f88.c(g48Var.i0), f88.c(g48Var.i0) + length);
                        w79.D(g48Var, f88.d(g48Var.i0) - iD, f88.d(g48Var.i0));
                        return dn8.a;
                    }
                    cCharAt = mi5Var.charAt((f88.c(g48Var.i0) + i) - 1);
                    char cCharAt3 = mi5Var.charAt(f88.c(g48Var.i0) + i);
                    if (Character.isHighSurrogate(cCharAt)) {
                        length = i;
                    } else {
                        length = i;
                    }
                }
                w79.D(g48Var, f88.c(g48Var.i0), f88.c(g48Var.i0) + length);
                w79.D(g48Var, f88.d(g48Var.i0) - iD, f88.d(g48Var.i0));
                return dn8.a;
            case 1:
                bq3 bq3Var = (bq3) obj;
                String strD = bq3Var.j("protocol").d();
                int iA = bq3Var.j("port").a();
                if ((dh3.f(strD, "socks") && iA == i3) || (dh3.f(strD, "http") && iA == i2)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                XRayConfig.InboundBean inboundBean = (XRayConfig.InboundBean) obj;
                inboundBean.getClass();
                if ((dh3.f(inboundBean.getProtocol(), "socks") && inboundBean.getPort() == i3) || (dh3.f(inboundBean.getProtocol(), "http") && inboundBean.getPort() == i2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
