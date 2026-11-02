package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tk3 implements dn2 {
    public final /* synthetic */ byte X;
    public final vk3 Y;

    public /* synthetic */ tk3(vk3 vk3Var, byte b) {
        this.X = b;
        this.Y = vk3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        me0 me0Var;
        byte b = this.X;
        vk3 vk3Var = this.Y;
        switch (b) {
            case 0:
                return z39.l(vk3Var);
            case 1:
                return vk3Var.X().getTypeParameters();
            case 2:
                tx0 tx0Var = y72.a;
                yu3 yu3Var = vk3Var.X;
                if (!yu3Var.c()) {
                    ov3 ov3Var = vk3Var.Y;
                    ev3 ev3Var = ov3Var instanceof ev3 ? (ev3) ov3Var : null;
                    return ev3Var == null ? d02.X : y72.b(ev3Var, y72.h(vk3Var, a32.i));
                }
                List<kb6> list = yu3Var.f;
                ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
                for (kb6 kb6Var : list) {
                    kb6Var.getClass();
                    arrayList.add((nb6) kb6Var);
                }
                return arrayList;
            default:
                if (Modifier.isStatic(vk3Var.X().getModifiers())) {
                    Method methodX = vk3Var.X();
                    if (mb6.K(vk3Var)) {
                        return new le0(methodX, false, mb6.C(vk3Var));
                    }
                    me0Var = new me0(methodX, false, 6, (byte) 2);
                } else {
                    Method methodX2 = vk3Var.X();
                    if (mb6.K(vk3Var)) {
                        return new je0(methodX2, mb6.C(vk3Var));
                    }
                    me0Var = new me0(methodX2, false, 6, (byte) 0);
                }
                return me0Var;
        }
    }
}
