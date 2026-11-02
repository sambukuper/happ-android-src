package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends sx4 {
    public final v15 X;
    public final te4 Y;
    public final te4 Z;
    public final te4 f0;

    public m0(ve4 ve4Var, v15 v15Var) {
        byte b = 0;
        if (ve4Var == null) {
            z0(0);
            throw null;
        }
        byte b2 = 1;
        if (v15Var == null) {
            z0(1);
            throw null;
        }
        this.X = v15Var;
        this.Y = new te4(ve4Var, new l0(this, b));
        this.Z = new te4(ve4Var, new l0(this, b2));
        this.f0 = new te4(ve4Var, new l0(this, (byte) 2));
    }

    public static /* synthetic */ void z0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.ew7
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public sx4 g(wi8 wi8Var) {
        if (wi8Var != null) {
            return wi8Var.a.e() ? this : new v74(this, wi8Var);
        }
        z0(18);
        throw null;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.q(this, obj);
    }

    @Override // defpackage.sx4, defpackage.ot0
    public final aa7 X() {
        aa7 aa7Var = (aa7) this.Y.invoke();
        if (aa7Var != null) {
            return aa7Var;
        }
        z0(20);
        throw null;
    }

    @Override // defpackage.ed1
    public final v15 getName() {
        v15 v15Var = this.X;
        if (v15Var != null) {
            return v15Var;
        }
        z0(2);
        throw null;
    }

    @Override // defpackage.sx4
    public final et4 l0(ui8 ui8Var) {
        el1.h(bl1.c(this));
        et4 et4VarM0 = m0(ui8Var, z14.t);
        if (et4VarM0 != null) {
            return et4VarM0;
        }
        z0(16);
        throw null;
    }

    @Override // defpackage.sx4
    public final i44 p0() {
        i44 i44Var = (i44) this.f0.invoke();
        if (i44Var != null) {
            return i44Var;
        }
        z0(5);
        throw null;
    }

    @Override // defpackage.sx4
    public et4 q0() {
        et4 et4Var = (et4) this.Z.invoke();
        if (et4Var != null) {
            return et4Var;
        }
        z0(4);
        throw null;
    }

    @Override // defpackage.ed1
    public final ed1 a() {
        return this;
    }

    @Override // defpackage.ed1
    public final ot0 a() {
        return this;
    }
}
