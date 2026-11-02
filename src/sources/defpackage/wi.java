package defpackage;

import com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wi extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi(Object obj, byte b) {
        super(1);
        this.Y = b;
        this.Z = obj;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                return Boolean.valueOf(dh3.f(obj, obj2));
            case 1:
                do5 do5Var = (do5) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    do5.f(do5Var, (eo5) arrayList.get(i), 0, 0);
                }
                return dn8Var;
            case 2:
                vk vkVar = (vk) obj;
                float f = vkVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = vkVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = vkVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = vkVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new dw0(dw0.a(z51.c(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, nw0.x), (lw0) obj2));
            case 3:
                return Boolean.valueOf(!dh3.f(obj, ((ce8) obj2).d.getValue()));
            case 4:
                ((pk6) obj).b(((Number) ((lh7) obj2).getValue()).floatValue());
                return dn8Var;
            case 5:
                sv1 sv1Var = (sv1) obj;
                xt2 xt2Var = (xt2) obj2;
                lf lfVar = xt2Var.l;
                if (xt2Var.n && xt2Var.A && lfVar != null) {
                    lr lrVarN0 = sv1Var.n0();
                    long jP = lrVarN0.p();
                    lrVarN0.k().g();
                    try {
                        ((lr) ((wl6) lrVarN0.Y).Y).k().l(lfVar);
                        xt2Var.c(sv1Var);
                    } finally {
                        p61.w(lrVarN0, jP);
                    }
                } else {
                    xt2Var.c(sv1Var);
                }
                return dn8Var;
            case 6:
                ((xb4) obj2).cancel(false);
                return dn8Var;
            default:
                List list = (List) obj;
                list.getClass();
                SyntaxHighlightEditText syntaxHighlightEditText = (SyntaxHighlightEditText) obj2;
                ArrayList arrayList2 = syntaxHighlightEditText.y0;
                arrayList2.clear();
                arrayList2.addAll(list);
                syntaxHighlightEditText.c();
                return dn8Var;
        }
    }
}
