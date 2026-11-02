package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class se4 implements dn2 {
    public final ve4 X;
    public final dn2 Y;
    public volatile Object Z;

    public se4(ve4 ve4Var, dn2 dn2Var) {
        if (ve4Var == null) {
            c(0);
            throw null;
        }
        this.Z = ue4.X;
        this.X = ve4Var;
        this.Y = dn2Var;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public h70 f(boolean z) {
        h70 h70VarD = this.X.d(null, "in a lazy value");
        if (h70VarD != null) {
            return h70VarD;
        }
        c(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // defpackage.dn2
    public Object invoke() throws Throwable {
        Object objInvoke;
        h70 h70VarF;
        ue4 ue4Var = ue4.Z;
        ue4 ue4Var2 = ue4.Y;
        Object obj = this.Z;
        if (!(obj instanceof ue4)) {
            j59.a(obj);
            return obj;
        }
        this.X.a.lock();
        try {
            Object obj2 = this.Z;
            if (!(obj2 instanceof ue4)) {
                j59.a(obj2);
                this.X.a.unlock();
                return obj2;
            }
            if (obj2 == ue4Var2) {
                this.Z = ue4Var;
                h70 h70VarF2 = f(true);
                if (!h70VarF2.Y) {
                    objInvoke = h70VarF2.Z;
                } else if (obj2 == ue4Var) {
                    h70VarF = f(false);
                    if (h70VarF.Y) {
                        this.Z = ue4Var2;
                        try {
                            objInvoke = this.Y.invoke();
                            e(objInvoke);
                            this.Z = objInvoke;
                        } catch (Throwable th) {
                            if (dh3.A(th)) {
                                this.Z = ue4.X;
                                throw th;
                            }
                            if (this.Z == ue4Var2) {
                                this.Z = new i59(th);
                            }
                            this.X.b.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = h70VarF.Z;
                    }
                } else {
                    this.Z = ue4Var2;
                    objInvoke = this.Y.invoke();
                    e(objInvoke);
                    this.Z = objInvoke;
                }
            } else if (obj2 == ue4Var) {
                h70VarF = f(false);
                if (h70VarF.Y) {
                    objInvoke = h70VarF.Z;
                } else {
                    this.Z = ue4Var2;
                    objInvoke = this.Y.invoke();
                    e(objInvoke);
                    this.Z = objInvoke;
                }
            } else {
                this.Z = ue4Var2;
                objInvoke = this.Y.invoke();
                e(objInvoke);
                this.Z = objInvoke;
            }
            this.X.a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.X.a.unlock();
            throw th2;
        }
    }

    public void e(Object obj) {
    }
}
