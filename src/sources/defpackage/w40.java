package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w40 implements sb4 {
    public final sb4 X;
    public byte Y = 0;
    public int Z = -1;
    public int f0 = -1;
    public Object g0 = null;

    public w40(wl6 wl6Var) {
        this.X = wl6Var;
    }

    @Override // defpackage.sb4
    public final void F(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.Y == 3 && i <= (i4 = this.f0 + (i3 = this.Z)) && (i5 = i + i2) >= i3 && this.g0 == obj) {
            this.Z = Math.min(i, i3);
            this.f0 = Math.max(i4, i5) - this.Z;
            return;
        }
        a();
        this.Z = i;
        this.f0 = i2;
        this.g0 = obj;
        this.Y = (byte) 3;
    }

    public final void a() {
        byte b = this.Y;
        if (b == 0) {
            return;
        }
        sb4 sb4Var = this.X;
        if (b == 1) {
            sb4Var.o(this.Z, this.f0);
        } else if (b == 2) {
            sb4Var.w(this.Z, this.f0);
        } else if (b == 3) {
            sb4Var.F(this.Z, this.f0, this.g0);
        }
        this.g0 = null;
        this.Y = (byte) 0;
    }

    @Override // defpackage.sb4
    public final void k(int i, int i2) {
        a();
        this.X.k(i, i2);
    }

    @Override // defpackage.sb4
    public final void o(int i, int i2) {
        int i3;
        if (this.Y == 1 && i >= (i3 = this.Z)) {
            int i4 = this.f0;
            if (i <= i3 + i4) {
                this.f0 = i4 + i2;
                this.Z = Math.min(i, i3);
                return;
            }
        }
        a();
        this.Z = i;
        this.f0 = i2;
        this.Y = (byte) 1;
    }

    @Override // defpackage.sb4
    public final void w(int i, int i2) {
        int i3;
        if (this.Y == 2 && (i3 = this.Z) >= i && i3 <= i + i2) {
            this.f0 += i2;
            this.Z = i;
        } else {
            a();
            this.Z = i;
            this.f0 = i2;
            this.Y = (byte) 2;
        }
    }
}
