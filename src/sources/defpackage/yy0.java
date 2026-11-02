package defpackage;

import su.happ.proxyutility.feature.settings.OtherSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yy0 extends y6 implements rn2 {
    public final /* synthetic */ byte j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.j0 = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.j0;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.X;
        switch (b) {
            case 0:
                ((zy0) obj3).c(((Number) obj2).intValue(), (lp2) obj);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                OtherSettingsFragment otherSettingsFragment = (OtherSettingsFragment) obj3;
                otherSettingsFragment.R().j0.setClickable(!zBooleanValue);
                otherSettingsFragment.R().Y.setVisibility(zBooleanValue ? 0 : 8);
                break;
            case 2:
                my6 my6Var = (my6) obj3;
                w51.G(my6Var.L0.F(), null, null, new x2(my6Var, ((tu8) obj).a, null, (byte) 2), 3);
                break;
            default:
                my6 my6Var2 = (my6) obj3;
                w51.G(my6Var2.L0.F(), null, null, new x2(my6Var2, ((tu8) obj).a, null, (byte) 3), 3);
                break;
        }
        return dn8Var;
    }
}
