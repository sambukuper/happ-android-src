package defpackage;

import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 extends kb8 implements p51 {
    public final /* synthetic */ byte f0;
    public final boolean g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(byte b, boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, (byte) 2);
        this.f0 = b;
        switch (b) {
            case 1:
                super(z ? Boolean.TYPE : Boolean.class, (byte) 2);
                this.g0 = z;
                break;
            case 2:
                super(InetAddress.class, (byte) 2);
                this.g0 = z;
                break;
            default:
                this.g0 = z;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        byte b = this.f0;
        boolean z = true;
        Class cls = this.X;
        boolean z2 = this.g0;
        switch (b) {
            case 0:
                no3 no3VarK = lj7.k(t37Var, d50Var, Boolean.class);
                return (no3VarK == null || no3VarK.Y.a()) ? this : new t60((byte) 1, z2);
            case 1:
                no3 no3VarK2 = lj7.k(t37Var, d50Var, cls);
                if (no3VarK2 == null) {
                    return this;
                }
                mo3 mo3Var = no3VarK2.Y;
                if (mo3Var.a()) {
                    return new t60((byte) 0, z2);
                }
                return mo3Var == mo3.g0 ? new s75(0, cls) : this;
            default:
                no3 no3VarK3 = lj7.k(t37Var, d50Var, cls);
                if (no3VarK3 != null) {
                    mo3 mo3Var2 = no3VarK3.Y;
                    if (!mo3Var2.a() && mo3Var2 != mo3.i0) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return z != z2 ? new t60((byte) 2, z) : this;
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        switch (this.f0) {
            case 0:
                ro3Var.c0(!Boolean.FALSE.equals(obj) ? 1 : 0);
                break;
            case 1:
                ro3Var.C(Boolean.TRUE.equals(obj));
                break;
            default:
                r((InetAddress) obj, ro3Var);
                break;
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        switch (this.f0) {
            case 0:
                ro3Var.C(Boolean.TRUE.equals(obj));
                break;
            case 1:
                ro3Var.C(Boolean.TRUE.equals(obj));
                break;
            default:
                InetAddress inetAddress = (InetAddress) obj;
                z76 z76VarD = ri8Var.d(inetAddress, gr3.VALUE_STRING);
                z76VarD.f0 = InetAddress.class;
                z76 z76VarE = ri8Var.e(ro3Var, z76VarD);
                r(inetAddress, ro3Var);
                ri8Var.f(ro3Var, z76VarE);
                break;
        }
    }

    public void r(InetAddress inetAddress, ro3 ro3Var) {
        String strTrim;
        if (this.g0) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        ro3Var.c1(strTrim);
    }
}
