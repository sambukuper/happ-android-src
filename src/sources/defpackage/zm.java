package defpackage;

import java.io.IOException;
import java.lang.reflect.Member;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zm extends f50 {
    public final zl t0;
    public final gl u0;
    public ar3 v0;
    public sp4 w0;

    public zm(f50 f50Var, zl zlVar, gl glVar, ar3 ar3Var) {
        super(f50Var);
        this.u0 = glVar;
        this.t0 = zlVar;
        this.v0 = ar3Var;
        if (ar3Var instanceof sp4) {
            this.w0 = (sp4) ar3Var;
        }
    }

    @Override // defpackage.f50
    public final void h(l37 l37Var) {
        boolean zF = l37Var.f(xp4.r0);
        Member memberB0 = this.u0.B0();
        if (memberB0 != null) {
            it0.d(memberB0, zF);
        }
    }

    @Override // defpackage.f50
    public final void k(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        gl glVar = this.u0;
        Object objC0 = glVar.C0(obj);
        if (objC0 == null) {
            return;
        }
        if (objC0 instanceof Map) {
            sp4 sp4Var = this.w0;
            if (sp4Var != null) {
                sp4Var.s((Map) objC0, ro3Var, t37Var);
                return;
            } else {
                this.v0.e(objC0, ro3Var, t37Var);
                return;
            }
        }
        t37Var.A("Value returned by 'any-getter' " + glVar.L() + "() not java.util.Map but " + objC0.getClass().getName());
        throw null;
    }
}
