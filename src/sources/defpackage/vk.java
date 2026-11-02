package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk extends wk {
    public float a;
    public float b;
    public float c;
    public float d;

    public vk(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.wk
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.wk
    public final int b() {
        return 4;
    }

    @Override // defpackage.wk
    public final wk c() {
        return new vk(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.wk
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.wk
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vk)) {
            return false;
        }
        vk vkVar = (vk) obj;
        return vkVar.a == this.a && vkVar.b == this.b && vkVar.c == this.c && vkVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + pc6.d(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbK = ie2.k("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbK.append(f3);
        sbK.append(", v4 = ");
        sbK.append(f4);
        return sbK.toString();
    }
}
