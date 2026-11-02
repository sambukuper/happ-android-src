package defpackage;

import su.happ.proxyutility.dto.enums.GeoUserAgent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sn6 {
    public final GeoUserAgent a;
    public final cm5 b;
    public final String c;
    public final String d;
    public final lw5 e;
    public final op7 f;
    public final boolean g;
    public final boolean h;
    public final bw5 i;
    public final int j;
    public final boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sn6(GeoUserAgent geoUserAgent, cm5 cm5Var, String str, String str2, lw5 lw5Var, op7 op7Var, boolean z, boolean z2, bw5 bw5Var) {
        geoUserAgent.getClass();
        lw5Var.getClass();
        op7Var.getClass();
        bw5Var.getClass();
        this.a = geoUserAgent;
        this.b = cm5Var;
        this.c = str;
        this.d = str2;
        this.e = lw5Var;
        this.f = op7Var;
        this.g = z;
        this.h = z2;
        this.i = bw5Var;
        this.j = geoUserAgent.ordinal();
        this.k = op7Var != op7.X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sn6 a(sn6 sn6Var, GeoUserAgent geoUserAgent, cm5 cm5Var, String str, String str2, lw5 lw5Var, op7 op7Var, boolean z, bw5 bw5Var, int i) {
        if ((i & 1) != 0) {
            geoUserAgent = sn6Var.a;
        }
        GeoUserAgent geoUserAgent2 = geoUserAgent;
        if ((i & 2) != 0) {
            cm5Var = sn6Var.b;
        }
        cm5 cm5Var2 = cm5Var;
        if ((i & 4) != 0) {
            str = sn6Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = sn6Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            lw5Var = sn6Var.e;
        }
        lw5 lw5Var2 = lw5Var;
        op7 op7Var2 = (i & 32) != 0 ? sn6Var.f : op7Var;
        boolean z2 = (i & 64) != 0 ? sn6Var.g : z;
        boolean z3 = (i & 128) != 0 ? sn6Var.h : false;
        bw5 bw5Var2 = (i & 256) != 0 ? sn6Var.i : bw5Var;
        sn6Var.getClass();
        geoUserAgent2.getClass();
        cm5Var2.getClass();
        lw5Var2.getClass();
        op7Var2.getClass();
        bw5Var2.getClass();
        return new sn6(geoUserAgent2, cm5Var2, str3, str4, lw5Var2, op7Var2, z2, z3, bw5Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof sn6) {
                sn6 sn6Var = (sn6) obj;
                if (this.a == sn6Var.a && this.b.equals(sn6Var.b)) {
                    String str = sn6Var.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (zEquals) {
                        String str3 = sn6Var.d;
                        String str4 = this.d;
                        if (str4 == null) {
                            if (str3 == null) {
                                zEquals2 = true;
                            } else {
                                zEquals2 = false;
                            }
                        } else if (str3 == null) {
                            zEquals2 = false;
                        } else {
                            zEquals2 = str4.equals(str3);
                        }
                        if (zEquals2 && dh3.f(this.e, sn6Var.e) && this.f == sn6Var.f && this.g == sn6Var.g && this.h == sn6Var.h && dh3.f(this.i, sn6Var.i)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.i.hashCode() + pc6.f(pc6.f((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.c;
        if (str == null) {
            str = "null";
        }
        String str2 = this.d;
        String str3 = str2 != null ? str2 : "null";
        StringBuilder sb = new StringBuilder("RoutingProfileState(geoUserAgent=");
        sb.append(this.a);
        sb.append(", profilesMap=");
        sb.append(this.b);
        sb.append(", currentlyDraggedProfile=");
        oi0.y(sb, str, ", profileIdWithForcedFocus=", str3, ", profileNameInputDialogState=");
        sb.append(this.e);
        sb.append(", subSelectBottomSheetState=");
        sb.append(this.f);
        sb.append(", isDuplicatedNameDialogVisible=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", profileDeleteDialogState=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
