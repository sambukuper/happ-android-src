package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gh implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y05 Y;

    public /* synthetic */ gh(y05 y05Var, byte b) {
        this.X = b;
        this.Y = y05Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.Y;
        switch (b) {
            case 0:
                y05Var.setValue((y24) obj);
                break;
            case 1:
                y05Var.setValue((y24) obj);
                break;
            case 2:
                s28 s28Var = (s28) obj;
                y05Var.setValue(s28Var.c ? s28Var.b : s28Var.a);
                break;
            case 3:
                List list = (List) obj;
                if (y05Var != null) {
                    y05Var.setValue(list);
                }
                break;
            case 4:
                yh2 yh2Var = (yh2) obj;
                yh2Var.getClass();
                y05Var.setValue(Boolean.valueOf(yh2Var.b()));
                break;
            case 5:
                y24 y24Var = (y24) obj;
                y24Var.getClass();
                y05Var.setValue(y24Var);
                break;
            case 6:
                yh2 yh2Var2 = (yh2) obj;
                yh2Var2.getClass();
                if (!yh2Var2.b()) {
                    y05Var.setValue(Boolean.FALSE);
                }
                break;
            case 7:
                x78 x78Var = (x78) obj;
                x78Var.getClass();
                y05Var.setValue(Boolean.valueOf(((Boolean) y05Var.getValue()).booleanValue() || x78Var.d()));
                break;
            case 8:
                yh2 yh2Var3 = (yh2) obj;
                yh2Var3.getClass();
                y05Var.setValue(Boolean.valueOf(yh2Var3.b()));
                break;
            case 9:
                y05Var.setValue((y24) obj);
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                y05Var.setValue(Boolean.valueOf(fm7.o0(str)));
                break;
            default:
                y05Var.setValue((y24) obj);
                break;
        }
        return dn8Var;
    }
}
