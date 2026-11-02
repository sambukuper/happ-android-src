package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wg7 extends ni8 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;

    public wg7(hi8 hi8Var) {
        hi8Var.getClass();
        this.b = hi8Var;
        this.c = x97.P(w74.X, new zk3(this, (byte) 19));
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.ni8
    public final rt8 a() {
        switch (this.a) {
            case 0:
                return rt8.OUT_VARIANCE;
            default:
                rt8 rt8Var = (rt8) this.b;
                if (rt8Var != null) {
                    return rt8Var;
                }
                e(4);
                throw null;
        }
    }

    @Override // defpackage.ni8
    public final t14 b() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (t14) ((g44) obj).getValue();
            default:
                t14 t14Var = (t14) obj;
                if (t14Var != null) {
                    return t14Var;
                }
                e(5);
                throw null;
        }
    }

    @Override // defpackage.ni8
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ni8
    public final ni8 d(z14 z14Var) {
        switch (this.a) {
            case 0:
                return this;
            default:
                rt8 rt8Var = (rt8) this.b;
                t14 t14Var = (t14) this.c;
                t14Var.getClass();
                return new wg7(t14Var, rt8Var);
        }
    }

    public wg7(t14 t14Var, rt8 rt8Var) {
        if (rt8Var == null) {
            e(0);
            throw null;
        }
        if (t14Var != null) {
            this.b = rt8Var;
            this.c = t14Var;
        } else {
            e(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wg7(t14 t14Var) {
        this(t14Var, rt8.INVARIANT);
        if (t14Var != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
