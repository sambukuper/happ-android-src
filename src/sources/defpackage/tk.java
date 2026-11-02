package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tk extends wk {
    public float a;
    public float b;

    public tk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.wk
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.wk
    public final int b() {
        return 2;
    }

    @Override // defpackage.wk
    public final wk c() {
        return new tk(0.0f, 0.0f);
    }

    @Override // defpackage.wk
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.wk
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tk)) {
            return false;
        }
        tk tkVar = (tk) obj;
        return tkVar.a == this.a && tkVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
