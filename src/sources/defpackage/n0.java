package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends i3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ve4 ve4Var) {
        super(ve4Var);
        if (ve4Var != null) {
        } else {
            j(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void j(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.i3
    public final t14 b() {
        sx4 sx4VarK = k();
        if (sx4VarK == null) {
            zz3.a(107);
            throw null;
        }
        v15 v15Var = zz3.e;
        if (zz3.b(sx4VarK, tg7.a) || zz3.b(sx4VarK, tg7.b)) {
            return null;
        }
        return f().e();
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        zz3 zz3VarE = el1.e(k());
        if (zz3VarE != null) {
            return zz3VarE;
        }
        j(1);
        throw null;
    }

    @Override // defpackage.i3
    public final boolean h(ot0 ot0Var) {
        boolean z;
        if (ot0Var instanceof sx4) {
            sx4 sx4VarK = k();
            sx4VarK.getClass();
            if (!dh3.f(sx4VarK.getName(), ot0Var.getName())) {
                z = false;
                break;
            }
            ed1 ed1VarP = sx4VarK.p();
            ed1 ed1VarP2 = ot0Var.p();
            while (true) {
                if (ed1VarP != null && ed1VarP2 != null) {
                    if (!(ed1VarP instanceof vx4)) {
                        if (!(ed1VarP2 instanceof vx4)) {
                            if (ed1VarP instanceof tf5) {
                                if (!(ed1VarP2 instanceof tf5) || !dh3.f(((uf5) ((tf5) ed1VarP)).i0, ((uf5) ((tf5) ed1VarP2)).i0)) {
                                    break;
                                }
                            } else if (!(ed1VarP2 instanceof tf5) && dh3.f(ed1VarP.getName(), ed1VarP2.getName())) {
                                ed1VarP = ed1VarP.p();
                                ed1VarP2 = ed1VarP2.p();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = ed1VarP2 instanceof vx4;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public abstract sx4 k();
}
