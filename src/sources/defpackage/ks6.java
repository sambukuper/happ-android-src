package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ks6 implements Cloneable {
    public final float X;
    public final int Y;

    public ks6(float f) {
        this.X = f;
        this.Y = 1;
    }

    public final float a() {
        float f;
        float f2;
        int iB = p61.B(this.Y);
        float f3 = this.X;
        if (iB == 0) {
            return f3;
        }
        if (iB == 3) {
            return f3 * 96.0f;
        }
        if (iB == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iB == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iB == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iB != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float b(fu6 fu6Var) {
        if (this.Y != 9) {
            return d(fu6Var);
        }
        du6 du6Var = (du6) fu6Var.f0;
        r05 r05Var = du6Var.g;
        if (r05Var == null) {
            r05Var = du6Var.f;
        }
        float f = this.X;
        if (r05Var == null) {
            return f;
        }
        float fSqrt = r05Var.d;
        float f2 = r05Var.e;
        if (fSqrt != f2) {
            fSqrt = (float) (Math.sqrt((f2 * f2) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f * fSqrt) / 100.0f;
    }

    public final float c(fu6 fu6Var, float f) {
        return this.Y == 9 ? (this.X * f) / 100.0f : d(fu6Var);
    }

    public final float d(fu6 fu6Var) {
        float textSize;
        int iB = p61.B(this.Y);
        float f = this.X;
        switch (iB) {
            case 1:
                textSize = ((du6) fu6Var.f0).d.getTextSize();
                break;
            case 2:
                textSize = ((du6) fu6Var.f0).d.getTextSize() / 2.0f;
                break;
            case 3:
                fu6Var.getClass();
                return f * 96.0f;
            case 4:
                fu6Var.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                fu6Var.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                fu6Var.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                fu6Var.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                du6 du6Var = (du6) fu6Var.f0;
                r05 r05Var = du6Var.g;
                if (r05Var == null) {
                    r05Var = du6Var.f;
                }
                if (r05Var != null) {
                    return (f * r05Var.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float e(fu6 fu6Var) {
        if (this.Y != 9) {
            return d(fu6Var);
        }
        du6 du6Var = (du6) fu6Var.f0;
        r05 r05Var = du6Var.g;
        if (r05Var == null) {
            r05Var = du6Var.f;
        }
        float f = this.X;
        return r05Var == null ? f : (f * r05Var.e) / 100.0f;
    }

    public final boolean f() {
        return this.X < 0.0f;
    }

    public final boolean g() {
        return this.X == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.X));
        switch (this.Y) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public ks6(int i, float f) {
        this.X = f;
        this.Y = i;
    }
}
