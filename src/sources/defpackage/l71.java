package defpackage;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.LogFileInfo;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l71 implements Comparator {
    public static final l71 Y = new l71(0);
    public static final l71 Z = new l71(1);
    public static final l71 f0 = new l71(2);
    public static final l71 g0 = new l71(3);
    public static final l71 h0 = new l71(4);
    public static final l71 i0 = new l71(5);
    public static final l71 j0 = new l71(6);
    public final /* synthetic */ byte X;

    public /* synthetic */ l71(byte b) {
        this.X = b;
    }

    public static int a(ed1 ed1Var) {
        if (ed1Var == null) {
            bl1.a(36);
            throw null;
        }
        if (bl1.l(ed1Var, us0.f0)) {
            return 8;
        }
        if (ed1Var instanceof a41) {
            return 7;
        }
        if (ed1Var instanceof fx5) {
            return ((fx5) ed1Var).S() == null ? 6 : 5;
        }
        if (ed1Var instanceof ho2) {
            return ((ho2) ed1Var).S() == null ? 4 : 3;
        }
        if (ed1Var instanceof sx4) {
            return 2;
        }
        return ed1Var instanceof km1 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0448  */
    /* JADX WARN: Code duplicated, block: B:234:0x045e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ?? r7;
        ?? r8;
        long jLongValue;
        Integer numValueOf = null;
        switch (this.X) {
            case 0:
                kb6 kb6Var = (kb6) obj;
                kb6 kb6Var2 = (kb6) obj2;
                kb6Var.getClass();
                kb6Var2.getClass();
                ww3 ww3VarG = y72.g(kb6Var.getTypeParameters(), kb6Var2.getTypeParameters());
                if (ww3VarG != null) {
                    pw3 pw3VarC = ww3VarG.c(kb6Var.j(), kb6Var.getName());
                    pw3 pw3VarJ = kb6Var2.j();
                    boolean zP0 = z68.p0(pw3VarC, pw3VarJ);
                    boolean zP1 = z68.p0(pw3VarJ, pw3VarC);
                    if (!zP0 || zP1) {
                        if (zP1 && !zP0) {
                            return 1;
                        }
                        u1 u1Var = pw3VarC instanceof u1 ? (u1) pw3VarC : null;
                        if (u1Var == null) {
                            r7 = false;
                        } else {
                            if (u1Var.K() == null) {
                                u1Var = null;
                            }
                            if (u1Var != null) {
                                r7 = true;
                            } else {
                                r7 = false;
                            }
                        }
                        u1 u1Var2 = pw3VarJ instanceof u1 ? (u1) pw3VarJ : null;
                        if (u1Var2 == null) {
                            r8 = false;
                        } else if ((u1Var2.K() != null ? u1Var2 : null) != null) {
                            r8 = true;
                        } else {
                            r8 = false;
                        }
                        if (r8 == false || r7 != false) {
                            if (r7 != false && r8 == false) {
                                return 1;
                            }
                        }
                    }
                    return -1;
                }
                u52.n("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '", kb6Var, "' '", kb6Var2);
                return 0;
            case 1:
                ai2 ai2Var = (ai2) obj;
                ai2 ai2Var2 = (ai2) obj2;
                if (u15.B(ai2Var) && u15.B(ai2Var2)) {
                    LayoutNode layoutNodeZ = yn0.Z(ai2Var);
                    LayoutNode layoutNodeZ2 = yn0.Z(ai2Var2);
                    if (!dh3.f(layoutNodeZ, layoutNodeZ2)) {
                        Object[] objArr = new LayoutNode[16];
                        int i = 0;
                        while (layoutNodeZ != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = layoutNodeZ;
                            i++;
                            layoutNodeZ = layoutNodeZ.w();
                        }
                        Object[] objArr3 = new LayoutNode[16];
                        int i3 = 0;
                        while (layoutNodeZ2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = layoutNodeZ2;
                            i3++;
                            layoutNodeZ2 = layoutNodeZ2.w();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (dh3.f(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return dh3.k(((LayoutNode) objArr[i5]).x(), ((LayoutNode) objArr3[i5]).x());
                        }
                        bt.i("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (u15.B(ai2Var)) {
                        return -1;
                    }
                    if (u15.B(ai2Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 2:
                s86 s86VarH = ((y07) obj).h();
                s86 s86VarH2 = ((y07) obj2).h();
                int iCompare = Float.compare(s86VarH.a, s86VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(s86VarH.b, s86VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(s86VarH.d, s86VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(s86VarH.c, s86VarH2.c);
            case 3:
                ed1 ed1Var = (ed1) obj;
                ed1 ed1Var2 = (ed1) obj2;
                int iA = a(ed1Var2) - a(ed1Var);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else {
                    us0 us0Var = us0.f0;
                    if (bl1.l(ed1Var, us0Var) && bl1.l(ed1Var2, us0Var)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = ed1Var.getName().X.compareTo(ed1Var2.getName().X);
                        if (iCompareTo != 0) {
                            numValueOf = Integer.valueOf(iCompareTo);
                        }
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 4:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                int iK = dh3.k(layoutNode2.r0, layoutNode.r0);
                return iK != 0 ? iK : dh3.k(layoutNode.hashCode(), layoutNode2.hashCode());
            case 5:
                s86 s86VarH3 = ((y07) obj).h();
                s86 s86VarH4 = ((y07) obj2).h();
                int iCompare4 = Float.compare(s86VarH4.c, s86VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(s86VarH3.b, s86VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(s86VarH3.d, s86VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(s86VarH4.a, s86VarH3.a);
            case 6:
                qg5 qg5Var = (qg5) obj;
                qg5 qg5Var2 = (qg5) obj2;
                int iCompare7 = Float.compare(((s86) qg5Var.X).b, ((s86) qg5Var2.X).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((s86) qg5Var.X).d, ((s86) qg5Var2.X).d);
            case 7:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 8:
                return Integer.valueOf(((pl) obj).b).compareTo(Integer.valueOf(((pl) obj2).b));
            case 9:
                return Integer.valueOf(((pl) obj).b).compareTo(Integer.valueOf(((pl) obj2).b));
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (dh3.k(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                        return -1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 >= length4) {
                    return 1;
                }
                return -1;
            case 11:
                return dh3.m(el1.g((sx4) obj).a.a, el1.g((sx4) obj2).a.a);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                WeakHashMap weakHashMap = cw8.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 13:
                return dh3.m((String) ((qg5) obj).X, (String) ((qg5) obj2).X);
            case 14:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                LayoutNode layoutNode4 = (LayoutNode) obj2;
                int iK2 = dh3.k(layoutNode3.r0, layoutNode4.r0);
                return iK2 != 0 ? iK2 : dh3.k(layoutNode3.hashCode(), layoutNode4.hashCode());
            case 15:
                return dh3.m(((ob6) obj).getName(), ((ob6) obj2).getName());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((po1) obj).a - ((po1) obj2).a;
            case 17:
                return dh3.m((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
            case 18:
                return dh3.m((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
            case 19:
                return Boolean.valueOf(((InetAddress) obj) instanceof Inet6Address).compareTo(Boolean.valueOf(((InetAddress) obj2) instanceof Inet6Address));
            case 20:
                return Boolean.valueOf(((InetAddress) obj2) instanceof Inet6Address).compareTo(Boolean.valueOf(((InetAddress) obj) instanceof Inet6Address));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                qp2 qp2Var = (qp2) obj;
                qp2 qp2Var2 = (qp2) obj2;
                RecyclerView recyclerView = qp2Var.d;
                if ((recyclerView == null) == (qp2Var2.d == null)) {
                    boolean z3 = qp2Var.a;
                    if (z3 == qp2Var2.a) {
                        int i7 = qp2Var2.b - qp2Var.b;
                        if (i7 != 0) {
                            return i7;
                        }
                        int i8 = qp2Var.c - qp2Var2.c;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 22:
                return dh3.m(((Method) obj).getName(), ((Method) obj2).getName());
            case 23:
                return dh3.m(((Method) obj).getName(), ((Method) obj2).getName());
            case 24:
                kc6 kc6Var = ov3.X;
                Integer numB = gl1.b((fl1) obj, (fl1) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
            case 25:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 26:
                return ((String) obj).compareTo((String) obj2);
            case 27:
                return Long.valueOf(((LogFileInfo) obj2).getCreateDate()).compareTo(Long.valueOf(((LogFileInfo) obj).getCreateDate()));
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ServerAffiliationInfo serverAffiliationInfoB = ((ServerCache) obj).getAffiliationInfo();
                Long lB = serverAffiliationInfoB != null ? serverAffiliationInfoB.getTestDelayMillis() : null;
                long jLongValue2 = Long.MAX_VALUE;
                if (lB == null) {
                    jLongValue = Long.MAX_VALUE;
                } else {
                    if (lB.longValue() <= 0) {
                        lB = null;
                    }
                    if (lB != null) {
                        jLongValue = lB.longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                }
                Long lValueOf = Long.valueOf(jLongValue);
                ServerAffiliationInfo serverAffiliationInfoB2 = ((ServerCache) obj2).getAffiliationInfo();
                Long lB2 = serverAffiliationInfoB2 != null ? serverAffiliationInfoB2.getTestDelayMillis() : null;
                if (lB2 != null) {
                    Long l = lB2.longValue() > 0 ? lB2 : null;
                    if (l != null) {
                        jLongValue2 = l.longValue();
                    }
                }
                return lValueOf.compareTo(Long.valueOf(jLongValue2));
            default:
                return dh3.m(((ServerCache) obj).getConfig().getRemarks(), ((ServerCache) obj2).getConfig().getRemarks());
        }
    }
}
