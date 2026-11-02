package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e23 extends w18 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ h23 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e23(String str, h23 h23Var, int i, List list, boolean z) {
        super(str, true);
        this.f = h23Var;
        this.g = i;
    }

    @Override // defpackage.w18
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.m0.getClass();
                try {
                    this.f.y0.D(this.g, 9);
                    synchronized (this.f) {
                        this.f.A0.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.m0.getClass();
                try {
                    this.f.y0.D(this.g, 9);
                    synchronized (this.f) {
                        this.f.A0.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e23(String str, h23 h23Var, int i, List list) {
        super(str, true);
        this.f = h23Var;
        this.g = i;
    }
}
