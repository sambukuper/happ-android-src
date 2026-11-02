package defpackage;

import su.happ.proxyutility.dto.enums.SubInfoColor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dn7 {
    public final SubInfoColor a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dn7(SubInfoColor subInfoColor, String str, String str2, String str3, Boolean bool, String str4) {
        this.a = subInfoColor;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bool;
        this.f = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn7)) {
            return false;
        }
        dn7 dn7Var = (dn7) obj;
        return this.a == dn7Var.a && dh3.f(this.b, dn7Var.b) && dh3.f(this.c, dn7Var.c) && dh3.f(this.d, dn7Var.d) && dh3.f(this.e, dn7Var.e) && dh3.f(this.f, dn7Var.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        SubInfoColor subInfoColor = this.a;
        int iHashCode = (subInfoColor == null ? 0 : subInfoColor.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubInfoData(subInfoColor=");
        sb.append(this.a);
        sb.append(", subInfoText=");
        sb.append(this.b);
        sb.append(", subInfoButtonText=");
        oi0.y(sb, this.c, ", subInfoButtonLink=", this.d, ", subExpire=");
        sb.append(this.e);
        sb.append(", subExpireButtonLink=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
