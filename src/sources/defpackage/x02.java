package defpackage;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x02 implements w02 {
    public final String b;
    public final i26 c;
    public final boolean d;
    public final int e;
    public final LinkedHashMap f;

    public x02(String str, i26 i26Var) {
        boolean z;
        int i;
        i26Var.getClass();
        this.b = str;
        this.c = i26Var;
        this.f = new LinkedHashMap();
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            hi5.z0("EncoderProfilesProviderAdapter");
            z = false;
            i = -1;
        }
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.w02
    public final boolean a(int i) {
        return this.d && b(i) != null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x0121  */
    @Override // defpackage.w02
    public final gy b(int i) {
        CamcorderProfile camcorderProfile;
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        gy gyVarA;
        boolean zContains;
        gy gyVar = null;
        if (this.d) {
            int i5 = this.e;
            if (CamcorderProfile.hasProfile(i5, i)) {
                Integer numValueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.f;
                if (linkedHashMap.containsKey(numValueOf)) {
                    return (gy) linkedHashMap.get(Integer.valueOf(i));
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 31) {
                    try {
                        camcorderProfile = CamcorderProfile.get(i5, i);
                    } catch (RuntimeException unused) {
                        hi5.z0("EncoderProfilesProviderAdapter");
                        camcorderProfile = null;
                    }
                    if (camcorderProfile != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            hi5.z0("EncoderProfilesProxyCompat");
                        }
                        int i7 = camcorderProfile.duration;
                        int i8 = camcorderProfile.fileFormat;
                        ArrayList arrayList = new ArrayList();
                        i2 = camcorderProfile.audioCodec;
                        switch (i2) {
                            case 1:
                                str = "audio/3gpp";
                                break;
                            case 2:
                                str = "audio/amr-wb";
                                break;
                            case 3:
                            case 4:
                            case 5:
                                str = "audio/mp4a-latm";
                                break;
                            case 6:
                                str = "audio/vorbis";
                                break;
                            case 7:
                                str = "audio/opus";
                                break;
                            default:
                                str = "audio/none";
                                break;
                        }
                        String str3 = str;
                        int i9 = camcorderProfile.audioBitRate;
                        int i10 = camcorderProfile.audioSampleRate;
                        int i11 = camcorderProfile.audioChannels;
                        if (i2 != 3) {
                            i3 = 5;
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    i3 = -1;
                                } else {
                                    i3 = 39;
                                }
                            }
                        } else {
                            i3 = 2;
                        }
                        arrayList.add(new fy(str3, i2, i9, i10, i11, i3));
                        ArrayList arrayList2 = new ArrayList();
                        i4 = camcorderProfile.videoCodec;
                        switch (i4) {
                            case 1:
                                str2 = "video/3gpp";
                                break;
                            case 2:
                                str2 = "video/avc";
                                break;
                            case 3:
                                str2 = "video/mp4v-es";
                                break;
                            case 4:
                                str2 = "video/x-vnd.on2.vp8";
                                break;
                            case 5:
                                str2 = "video/hevc";
                                break;
                            case 6:
                                str2 = "video/x-vnd.on2.vp9";
                                break;
                            case 7:
                                str2 = "video/dolby-vision";
                                break;
                            case 8:
                                str2 = "video/av01";
                                break;
                            default:
                                str2 = "video/none";
                                break;
                        }
                        arrayList2.add(new hy(i4, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        gyVarA = gy.a(i7, i8, arrayList, arrayList2);
                    } else {
                        gyVarA = null;
                    }
                } else {
                    EncoderProfiles encoderProfilesI = tc.i(i, this.b);
                    if (encoderProfilesI != null) {
                        if (um1.a().b(InvalidVideoProfilesQuirk.class) != null) {
                            hi5.z0("EncoderProfilesProviderAdapter");
                        } else {
                            try {
                                if (i6 >= 33) {
                                    gyVarA = c4.b(encoderProfilesI);
                                } else {
                                    if (i6 < 31) {
                                        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i6 + ". Version 31 or higher required.");
                                    }
                                    gyVarA = tc.h(encoderProfilesI);
                                }
                            } catch (NullPointerException unused2) {
                                hi5.z0("EncoderProfilesProviderAdapter");
                                camcorderProfile = CamcorderProfile.get(i5, i);
                                if (camcorderProfile != null) {
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        hi5.z0("EncoderProfilesProxyCompat");
                                    }
                                    int i12 = camcorderProfile.duration;
                                    int i13 = camcorderProfile.fileFormat;
                                    ArrayList arrayList3 = new ArrayList();
                                    i2 = camcorderProfile.audioCodec;
                                    switch (i2) {
                                        case 1:
                                            str = "audio/3gpp";
                                            break;
                                        case 2:
                                            str = "audio/amr-wb";
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            str = "audio/mp4a-latm";
                                            break;
                                        case 6:
                                            str = "audio/vorbis";
                                            break;
                                        case 7:
                                            str = "audio/opus";
                                            break;
                                        default:
                                            str = "audio/none";
                                            break;
                                    }
                                    String str4 = str;
                                    int i14 = camcorderProfile.audioBitRate;
                                    int i15 = camcorderProfile.audioSampleRate;
                                    int i16 = camcorderProfile.audioChannels;
                                    if (i2 != 3) {
                                        i3 = 5;
                                        if (i2 != 4) {
                                            if (i2 != 5) {
                                                i3 = -1;
                                            } else {
                                                i3 = 39;
                                            }
                                        }
                                    } else {
                                        i3 = 2;
                                    }
                                    arrayList3.add(new fy(str4, i2, i14, i15, i16, i3));
                                    ArrayList arrayList4 = new ArrayList();
                                    i4 = camcorderProfile.videoCodec;
                                    switch (i4) {
                                        case 1:
                                            str2 = "video/3gpp";
                                            break;
                                        case 2:
                                            str2 = "video/avc";
                                            break;
                                        case 3:
                                            str2 = "video/mp4v-es";
                                            break;
                                        case 4:
                                            str2 = "video/x-vnd.on2.vp8";
                                            break;
                                        case 5:
                                            str2 = "video/hevc";
                                            break;
                                        case 6:
                                            str2 = "video/x-vnd.on2.vp9";
                                            break;
                                        case 7:
                                            str2 = "video/dolby-vision";
                                            break;
                                        case 8:
                                            str2 = "video/av01";
                                            break;
                                        default:
                                            str2 = "video/none";
                                            break;
                                    }
                                    arrayList4.add(new hy(i4, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                                    gyVarA = gy.a(i12, i13, arrayList3, arrayList4);
                                } else {
                                    gyVarA = null;
                                }
                            }
                        }
                        camcorderProfile = CamcorderProfile.get(i5, i);
                        if (camcorderProfile != null) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                hi5.z0("EncoderProfilesProxyCompat");
                            }
                            int i17 = camcorderProfile.duration;
                            int i18 = camcorderProfile.fileFormat;
                            ArrayList arrayList5 = new ArrayList();
                            i2 = camcorderProfile.audioCodec;
                            switch (i2) {
                                case 1:
                                    str = "audio/3gpp";
                                    break;
                                case 2:
                                    str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    str = "audio/mp4a-latm";
                                    break;
                                case 6:
                                    str = "audio/vorbis";
                                    break;
                                case 7:
                                    str = "audio/opus";
                                    break;
                                default:
                                    str = "audio/none";
                                    break;
                            }
                            String str5 = str;
                            int i19 = camcorderProfile.audioBitRate;
                            int i110 = camcorderProfile.audioSampleRate;
                            int i111 = camcorderProfile.audioChannels;
                            if (i2 != 3) {
                                i3 = 5;
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        i3 = -1;
                                    } else {
                                        i3 = 39;
                                    }
                                }
                            } else {
                                i3 = 2;
                            }
                            arrayList5.add(new fy(str5, i2, i19, i110, i111, i3));
                            ArrayList arrayList6 = new ArrayList();
                            i4 = camcorderProfile.videoCodec;
                            switch (i4) {
                                case 1:
                                    str2 = "video/3gpp";
                                    break;
                                case 2:
                                    str2 = "video/avc";
                                    break;
                                case 3:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 4:
                                    str2 = "video/x-vnd.on2.vp8";
                                    break;
                                case 5:
                                    str2 = "video/hevc";
                                    break;
                                case 6:
                                    str2 = "video/x-vnd.on2.vp9";
                                    break;
                                case 7:
                                    str2 = "video/dolby-vision";
                                    break;
                                case 8:
                                    str2 = "video/av01";
                                    break;
                                default:
                                    str2 = "video/none";
                                    break;
                            }
                            arrayList6.add(new hy(i4, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            gyVarA = gy.a(i17, i18, arrayList5, arrayList6);
                        } else {
                            gyVarA = null;
                        }
                    } else {
                        gyVarA = null;
                    }
                }
                if (gyVarA != null) {
                    CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.c.b(CamcorderProfileResolutionQuirk.class);
                    if (camcorderProfileResolutionQuirk == null) {
                        zContains = true;
                    } else {
                        List list = gyVarA.d;
                        list.getClass();
                        if (list.isEmpty()) {
                            zContains = true;
                        } else {
                            hy hyVar = (hy) list.get(0);
                            List listY0 = wv0.Y0((List) camcorderProfileResolutionQuirk.b.getValue());
                            hyVar.getClass();
                            zContains = listY0.contains(new Size(hyVar.e, hyVar.f));
                        }
                    }
                    if (!zContains) {
                        List<Integer> list2 = w02.a;
                        if (i == 0) {
                            list2.getClass();
                            for (int size = list2.size() - 1; -1 < size; size--) {
                                Object obj = list2.get(size);
                                obj.getClass();
                                gy gyVarB = b(((Number) obj).intValue());
                                if (gyVarB != null) {
                                    gyVar = gyVarB;
                                }
                            }
                        } else if (i == 1) {
                            for (Integer num : list2) {
                                num.getClass();
                                gy gyVarB2 = b(num.intValue());
                                if (gyVarB2 != null) {
                                    gyVar = gyVarB2;
                                }
                            }
                        }
                        gyVarA = gyVar;
                    }
                }
                linkedHashMap.put(Integer.valueOf(i), gyVarA);
                return gyVarA;
            }
        }
        return null;
    }
}
