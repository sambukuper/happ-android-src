package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hv6 implements vc6 {
    public bw6 X;
    public kv6 Y;
    public String Z;
    public Object f0;
    public Object[] g0;
    public f63 h0;
    public final hr5 i0 = new hr5(this, 11);

    public hv6(bw6 bw6Var, kv6 kv6Var, String str, Object obj, Object[] objArr) {
        this.X = bw6Var;
        this.Y = kv6Var;
        this.Z = str;
        this.f0 = obj;
        this.g0 = objArr;
    }

    @Override // defpackage.vc6
    public final void a() {
        f63 f63Var = this.h0;
        if (f63Var != null) {
            f63Var.D();
        }
    }

    @Override // defpackage.vc6
    public final void b() {
        f63 f63Var = this.h0;
        if (f63Var != null) {
            f63Var.D();
        }
    }

    @Override // defpackage.vc6
    public final void c() throws Throwable {
        d();
    }

    public final void d() throws Throwable {
        String strZ;
        kv6 kv6Var = this.Y;
        f63 f63Var = this.h0;
        if (f63Var != null) {
            em7.h("entry(", f63Var, ") is not null");
            return;
        }
        if (kv6Var != null) {
            hr5 hr5Var = this.i0;
            Object objInvoke = hr5Var.invoke();
            if (objInvoke == null || kv6Var.c(objInvoke)) {
                this.h0 = kv6Var.a(this.Z, hr5Var);
                return;
            }
            if (objInvoke instanceof od7) {
                od7 od7Var = (od7) objInvoke;
                if (od7Var.d() == lh4.i0 || od7Var.d() == qe4.v0 || od7Var.d() == lh4.x0) {
                    strZ = "MutableState containing " + od7Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strZ = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strZ = jm4.z(objInvoke);
            }
            throw new IllegalArgumentException(strZ);
        }
    }
}
