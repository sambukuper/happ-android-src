package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 extends ft4 {
    public final pe4 b;
    public final pe4 c;
    public final te4 d;
    public final /* synthetic */ q22 e;

    public p22(q22 q22Var, ve4 ve4Var) {
        byte b = 0;
        if (ve4Var == null) {
            h(0);
            throw null;
        }
        this.e = q22Var;
        this.b = ve4Var.b(new o22(this, b));
        this.c = ve4Var.b(new o22(this, (byte) 1));
        this.d = new te4(ve4Var, new f3(this, (byte) 23));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        if (pk1Var == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        if (v15Var != null) {
            return (Collection) this.b.B(v15Var);
        }
        h(5);
        throw null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set c() {
        Set set = (Set) this.e.k0.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set d() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        if (v15Var != null) {
            return (Collection) this.c.B(v15Var);
        }
        h(1);
        throw null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set g() {
        Set set = (Set) this.e.k0.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final et4 i() {
        et4 et4VarK = ((t14) ((i3) this.e.l()).c().iterator().next()).K();
        if (et4VarK != null) {
            return et4VarK;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(v15 v15Var, Collection collection) {
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hf5.c.h(v15Var, collection, Collections.EMPTY_SET, this.e, new rl1(linkedHashSet, (byte) 1));
        return linkedHashSet;
    }
}
