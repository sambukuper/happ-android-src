package defpackage;

import io.sentry.c2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tx5 extends cx5 {
    public ot8 q0;
    public final tx5 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx5(fx5 fx5Var, sm smVar, fx4 fx4Var, fl1 fl1Var, boolean z, boolean z2, boolean z3, int i, tx5 tx5Var, ke7 ke7Var) {
        super(fx4Var, fl1Var, fx5Var, smVar, v15.g("<set-" + fx5Var.getName() + ">"), z, z2, z3, i, ke7Var);
        if (smVar == null) {
            B(1);
            throw null;
        }
        if (fx4Var == null) {
            B(2);
            throw null;
        }
        if (fl1Var == null) {
            B(3);
            throw null;
        }
        if (i == 0) {
            B(4);
            throw null;
        }
        if (ke7Var == null) {
            B(5);
            throw null;
        }
        this.r0 = tx5Var != null ? tx5Var : this;
    }

    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ot8 I0(tx5 tx5Var, t14 t14Var, sm smVar) {
        if (t14Var == null) {
            B(8);
            throw null;
        }
        if (smVar != null) {
            return new ot8(tx5Var, null, 0, smVar, hf7.g, t14Var, false, false, false, null, ke7.G);
        }
        B(9);
        throw null;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.h(this, obj);
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final tx5 a() {
        tx5 tx5Var = this.r0;
        if (tx5Var != null) {
            return tx5Var;
        }
        B(13);
        throw null;
    }

    @Override // defpackage.jd0
    public final List L() {
        ot8 ot8Var = this.q0;
        if (ot8Var == null) {
            c2.g();
            return null;
        }
        List listSingletonList = Collections.singletonList(ot8Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        B(11);
        throw null;
    }

    @Override // defpackage.jd0
    public final t14 j() {
        return el1.e(this).x();
    }

    @Override // defpackage.ld0, defpackage.jd0
    public final Collection q() {
        return H0(false);
    }
}
