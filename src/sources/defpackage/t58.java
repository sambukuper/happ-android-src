package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t58 {
    public static final f08 f = new f08((byte) 2);
    public final kd8 a;
    public final o88 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public t58(kd8 kd8Var, o88 o88Var, boolean z, boolean z2, boolean z3) {
        this.a = kd8Var;
        this.b = o88Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        sb.append(this.c);
        sb.append(", softWrap=");
        sb.append(this.d);
        sb.append(", isKeyboardTypePhone=");
        return p61.o(sb, this.e, ")");
    }
}
