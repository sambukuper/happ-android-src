package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l5 {
    public final /* synthetic */ byte X = 0;
    public boolean Y;
    public Object Z;

    public l5(String str, boolean z) {
        this.Z = str;
        this.Y = z;
    }

    public Integer a(l5 l5Var) {
        l5Var.getClass();
        ip4 ip4Var = cz8.a;
        if (this == l5Var) {
            return 0;
        }
        ip4 ip4Var2 = cz8.a;
        Integer num = (Integer) ip4Var2.get(this);
        Integer num2 = (Integer) ip4Var2.get(l5Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.Z;
    }

    public abstract nt4 e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z);

    public String toString() {
        switch (this.X) {
            case 1:
                return d();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l5() {
    }

    public l5 k() {
        return this;
    }
}
