package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c23 extends w18 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ h23 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c23(String str, h23 h23Var, int i, int i2, byte b) {
        super(str, true);
        this.e = b;
        this.f = h23Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.w18
    public final long a() {
        switch (this.e) {
            case 0:
                h23 h23Var = this.f;
                try {
                    h23Var.y0.C(true, this.g, this.h);
                    break;
                } catch (IOException e) {
                    h23Var.g(2, 2, e);
                }
                return -1L;
            case 1:
                qe4 qe4Var = this.f.m0;
                int i = this.h;
                qe4Var.getClass();
                if (i == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.A0.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                h23 h23Var2 = this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    h23Var2.y0.D(i2, i3);
                    return -1L;
                } catch (IOException e2) {
                    h23Var2.g(2, 2, e2);
                }
                break;
        }
    }
}
