package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe4 extends se4 implements h65 {
    public volatile xd6 f0;
    public final /* synthetic */ f0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe4(ve4 ve4Var, f3 f3Var, f0 f0Var) {
        super(ve4Var, f3Var);
        this.g0 = f0Var;
        if (ve4Var == null) {
            g(0);
            throw null;
        }
        this.f0 = null;
    }

    public static /* synthetic */ void c(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.se4
    public final void e(Object obj) {
        this.f0 = new xd6(obj);
        try {
            if (obj == null) {
                c(2);
                throw null;
            }
            this.g0.B(obj);
            this.f0 = null;
        } catch (Throwable th) {
            this.f0 = null;
            throw th;
        }
    }

    @Override // defpackage.se4
    public final h70 f(boolean z) {
        return new h70((Object) new h3(i21.K(u32.d)), false, (byte) 5);
    }

    @Override // defpackage.se4, defpackage.dn2
    public final Object invoke() throws Throwable {
        Object objInvoke;
        xd6 xd6Var = this.f0;
        if (xd6Var == null || ((Thread) xd6Var.Z) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) xd6Var.Z) == Thread.currentThread()) {
            objInvoke = xd6Var.Y;
        } else {
            bt.i("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        g(2);
        throw null;
    }
}
