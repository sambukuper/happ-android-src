package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gx8 extends z86 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gx8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.z86
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.j0 = true;
                viewPager2.q0.l = true;
                break;
            default:
                ((yr6) obj).r();
                break;
        }
    }

    @Override // defpackage.z86
    public final void b() {
        a();
    }

    @Override // defpackage.z86
    public final void c(int i, int i2, Object obj) {
        a();
    }

    @Override // defpackage.z86
    public final void d(int i, int i2) {
        a();
    }

    @Override // defpackage.z86
    public final void e(int i, int i2) {
        a();
    }

    @Override // defpackage.z86
    public final void f(int i, int i2) {
        a();
    }
}
