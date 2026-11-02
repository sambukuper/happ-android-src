package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iu5 {
    public int a;
    public nv[] b;

    public final void a(nv nvVar, int i) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            nv nvVar2 = this.b[i2];
            nvVar2.getClass();
            if (dh3.l(0L, nvVar.getTimeoutAt$okio() - nvVar2.getTimeoutAt$okio()) <= 0) {
                break;
            }
            nvVar2.index = i;
            this.b[i] = nvVar2;
            i = i2;
        }
        this.b[i] = nvVar;
        nvVar.index = i;
    }

    public final void b(nv nvVar) {
        nv nvVar2;
        int i = nvVar.index;
        if (i == -1) {
            bt.q("Failed requirement.");
            return;
        }
        int i2 = this.a;
        nv nvVar3 = this.b[i2];
        nvVar3.getClass();
        nvVar.index = -1;
        this.b[i2] = null;
        this.a = i2 - 1;
        if (nvVar == nvVar3) {
            return;
        }
        int iL = dh3.l(0L, nvVar3.getTimeoutAt$okio() - nvVar.getTimeoutAt$okio());
        if (iL == 0) {
            this.b[i] = nvVar3;
            nvVar3.index = i;
            return;
        }
        if (iL >= 0) {
            a(nvVar3, i);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                nvVar2 = this.b[i3];
                nvVar2.getClass();
            } else {
                nvVar2 = this.b[i3];
                nvVar2.getClass();
                nv nvVar4 = this.b[i4];
                nvVar4.getClass();
                if (dh3.l(0L, nvVar4.getTimeoutAt$okio() - nvVar2.getTimeoutAt$okio()) >= 0) {
                    nvVar2 = nvVar4;
                }
            }
            if (dh3.l(0L, nvVar2.getTimeoutAt$okio() - nvVar3.getTimeoutAt$okio()) <= 0) {
                break;
            }
            int i6 = nvVar2.index;
            nvVar2.index = i;
            this.b[i] = nvVar2;
            i = i6;
        }
        this.b[i] = nvVar3;
        nvVar3.index = i;
    }
}
