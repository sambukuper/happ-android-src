package defpackage;

import androidx.appcompat.widget.i;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vb8 extends ux8 {
    public boolean a = false;
    public final /* synthetic */ byte b;
    public final /* synthetic */ i c;

    /* JADX WARN: Multi-variable type inference failed */
    public vb8(i iVar, int i) {
        this.c = iVar;
        this.b = i;
    }

    @Override // defpackage.ux8, defpackage.tx8
    public final void a() {
        this.a = true;
    }

    @Override // defpackage.ux8, defpackage.tx8
    public final void b() {
        this.c.a.setVisibility(0);
    }

    @Override // defpackage.tx8
    public final void c() {
        if (this.a) {
            return;
        }
        this.c.a.setVisibility(this.b);
    }
}
