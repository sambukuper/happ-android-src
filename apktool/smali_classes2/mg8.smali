.class public final synthetic Lmg8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;

.field public final synthetic Z:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;[Ljava/lang/String;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, Lmg8;->X:B

    iput-object p1, p0, Lmg8;->Y:Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;

    iput-object p2, p0, Lmg8;->Z:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([Ljava/lang/String;Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lmg8;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmg8;->Z:[Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lmg8;->Y:Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lmg8;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lmg8;->Z:[Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lmg8;->Y:Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;->T()Lcom/tencent/mmkv/MMKV;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v5, "pref_noises_type"

    .line 25
    .line 26
    aget-object p1, v4, p1

    .line 27
    .line 28
    invoke-virtual {v0, v5, p1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lqk2;->S0:Lg94;

    .line 32
    .line 33
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Lpg8;

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    invoke-direct {v0, p0, v3, v4}, Lpg8;-><init>(Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;Lq51;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v3, v0, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;->T()Lcom/tencent/mmkv/MMKV;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v5, "pref_fragment_packets"

    .line 52
    .line 53
    aget-object p1, v4, p1

    .line 54
    .line 55
    invoke-virtual {v0, v5, p1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lqk2;->S0:Lg94;

    .line 59
    .line 60
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v0, Lpg8;

    .line 65
    .line 66
    const/16 v4, 0x14

    .line 67
    .line 68
    invoke-direct {v0, p0, v3, v4}, Lpg8;-><init>(Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;Lq51;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v3, v0, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_1
    aget-object p1, v4, p1

    .line 76
    .line 77
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;->T()Lcom/tencent/mmkv/MMKV;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v4, "pref_fragment_type"

    .line 82
    .line 83
    invoke-virtual {v0, v4, p1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    sget-object v0, Lsu/happ/proxyutility/dto/enums/FragmentationType;->Companion:Lsu/happ/proxyutility/dto/enums/FragmentationType$Companion;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lsu/happ/proxyutility/dto/enums/FragmentationType$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/FragmentationType;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_0

    .line 96
    .line 97
    invoke-static {p0, p1}, Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;->R(Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;Lsu/happ/proxyutility/dto/enums/FragmentationType;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    iget-object p1, p0, Lqk2;->S0:Lg94;

    .line 101
    .line 102
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance v0, Lpg8;

    .line 107
    .line 108
    const/16 v4, 0x13

    .line 109
    .line 110
    invoke-direct {v0, p0, v3, v4}, Lpg8;-><init>(Lsu/happ/proxyutility/feature/settings/TunnelSettingsFragment;Lq51;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v3, v0, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
