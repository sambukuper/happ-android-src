package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class ac6 implements dn2 {
    public final /* synthetic */ byte X;
    public final String Y;
    public final ov3 Z;
    public final String f0;
    public final nx5 g0;

    public /* synthetic */ ac6(ov3 ov3Var, String str, String str2, nx5 nx5Var, byte b) {
        this.X = b;
        this.Z = ov3Var;
        this.Y = str;
        this.f0 = str2;
        this.g0 = nx5Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws NoSuchFieldException {
        byte b = this.X;
        String str = this.f0;
        String str2 = this.Y;
        nx5 nx5Var = this.g0;
        switch (b) {
            case 0:
                a74 a74Var = (a74) nx5Var;
                kc6 kc6Var = ov3.X;
                String str3 = this.Y;
                fq4 fq4VarC = kc6Var.c(str3);
                ov3 ov3Var = this.Z;
                if (fq4VarC != null) {
                    return ov3Var.K(Integer.parseInt((String) ((dq4) fq4VarC.a()).get(1)), str3);
                }
                if (ov3Var instanceof ev3) {
                    ev3 ev3Var = (ev3) ov3Var;
                    if (ev3Var.Y.getAnnotation(Metadata.class) == null) {
                        try {
                            Field fieldS = ov3Var.S(a74Var.getName());
                            if (Modifier.isStatic(fieldS.getModifiers())) {
                                return new cl3(ov3Var, fieldS, a74Var.T(), yu3.k);
                            }
                        } catch (Exception unused) {
                            if (str3.equals("getEntries()Lkotlin/enums/EnumEntries;")) {
                                return new jk3(ev3Var);
                            }
                        }
                    }
                }
                if (!(ov3Var instanceof ew3)) {
                    return new zj1(ov3Var, str, str3, a74Var.T());
                }
                return new h14(ov3Var, str3, a74Var.T(), ov3Var.U(str, str3), yu3.k);
            case 1:
                i58 i58Var = (i58) nx5Var;
                kc6 kc6Var2 = ov3.X;
                String str4 = this.Y;
                fq4 fq4VarC2 = kc6Var2.c(str4);
                ov3 ov3Var2 = this.Z;
                if (fq4VarC2 != null) {
                    return ov3Var2.K(Integer.parseInt((String) ((dq4) fq4VarC2.a()).get(1)), str4);
                }
                if ((ov3Var2 instanceof ev3) && ((ev3) ov3Var2).Y.getAnnotation(Metadata.class) == null) {
                    Field fieldS2 = ov3Var2.S(i58Var.getName());
                    if (Modifier.isStatic(fieldS2.getModifiers())) {
                        return new sk3(ov3Var2, fieldS2, i58Var.T(), yu3.k);
                    }
                }
                if (!(ov3Var2 instanceof ew3)) {
                    return new ij1(ov3Var2, str, str4, i58Var.T());
                }
                return new r04(ov3Var2, str4, i58Var.T(), ov3Var2.U(str, str4), yu3.k);
            case 2:
                lx5 lx5Var = (lx5) nx5Var;
                ov3 ov3Var3 = this.Z;
                boolean z = ov3Var3 instanceof ew3;
                String str5 = this.f0;
                if (!z) {
                    return new ck1(ov3Var3, str2, str5, lx5Var.T());
                }
                return new k14(ov3Var3, str5, lx5Var.T(), ov3Var3.U(str2, str5), yu3.k);
            default:
                p05 p05Var = (p05) nx5Var;
                ov3 ov3Var4 = this.Z;
                boolean z2 = ov3Var4 instanceof ew3;
                String str6 = this.f0;
                if (!z2) {
                    return new kj1(ov3Var4, str2, str6, p05Var.T());
                }
                return new t04(ov3Var4, str6, p05Var.T(), ov3Var4.U(str2, str6), yu3.k);
        }
    }

    public /* synthetic */ ac6(String str, ov3 ov3Var, nx5 nx5Var, String str2, byte b) {
        this.X = b;
        this.Y = str;
        this.Z = ov3Var;
        this.g0 = nx5Var;
        this.f0 = str2;
    }
}
