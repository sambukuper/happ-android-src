package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends f50 {
    public final /* synthetic */ byte t0;
    public final f50 u0;
    public final Serializable v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja2(f50 f50Var, Serializable serializable, byte b) {
        super(f50Var);
        this.t0 = b;
        this.u0 = f50Var;
        this.v0 = serializable;
    }

    @Override // defpackage.f50
    public final void f(ar3 ar3Var) {
        switch (this.t0) {
            case 0:
                this.u0.f(ar3Var);
                break;
            default:
                this.u0.f(ar3Var);
                break;
        }
    }

    @Override // defpackage.f50
    public final void g(ar3 ar3Var) {
        switch (this.t0) {
            case 0:
                this.u0.g(ar3Var);
                break;
            default:
                this.u0.g(ar3Var);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.Class[]] */
    @Override // defpackage.f50
    public final f50 i(c25 c25Var) {
        byte b = this.t0;
        Object obj = this.v0;
        f50 f50Var = this.u0;
        switch (b) {
            case 0:
                return new ja2(f50Var.i(c25Var), (Class[]) obj, (byte) 0);
            default:
                return new ja2(f50Var.i(c25Var), (Class) obj, (byte) 1);
        }
    }

    @Override // defpackage.f50
    public final void j(Object obj, ro3 ro3Var, t37 t37Var) {
        byte b = this.t0;
        f50 f50Var = this.u0;
        switch (b) {
            case 0:
                t37Var.getClass();
                f50Var.j(obj, ro3Var, t37Var);
                break;
            default:
                t37Var.getClass();
                f50Var.j(obj, ro3Var, t37Var);
                break;
        }
    }

    @Override // defpackage.f50
    public final void k(Object obj, ro3 ro3Var, t37 t37Var) {
        byte b = this.t0;
        f50 f50Var = this.u0;
        switch (b) {
            case 0:
                t37Var.getClass();
                f50Var.k(obj, ro3Var, t37Var);
                break;
            default:
                t37Var.getClass();
                f50Var.k(obj, ro3Var, t37Var);
                break;
        }
    }
}
