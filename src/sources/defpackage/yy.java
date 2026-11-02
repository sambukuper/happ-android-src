package defpackage;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yy {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public yy(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            b61.i("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy) {
            yy yyVar = (yy) obj;
            if (this.a.equals(yyVar.a) && this.b == yyVar.b && this.c == yyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oi0.n(sb, this.c, "}");
    }
}
