package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z31 implements a85, kz1, o75 {
    public final /* synthetic */ byte X;
    public final String Y;

    public /* synthetic */ z31(String str, byte b) {
        this.X = b;
        this.Y = str;
    }

    @Override // defpackage.a85
    public Object d() {
        throw new uo3(this.Y);
    }

    @Override // defpackage.o75
    public String k0() {
        return oi0.o(new StringBuilder("expected '"), this.Y, '\'');
    }

    @Override // defpackage.kz1
    public boolean r(CharSequence charSequence, int i, int i2, oj8 oj8Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.Y)) {
            return true;
        }
        oj8Var.c = (oj8Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.X) {
            case 3:
                return oi0.o(new StringBuilder("<"), this.Y, '>');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kz1
    public Object i() {
        return this;
    }
}
