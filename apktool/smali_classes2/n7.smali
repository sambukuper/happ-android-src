.class public final synthetic Ln7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ln7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ln7;->Y:Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Ln7;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Ln7;->Y:Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;->d1:Lvz7;

    .line 17
    .line 18
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 23
    .line 24
    const-string v2, "pref_auto_start_vpn"

    .line 25
    .line 26
    invoke-virtual {v0, v2, p1}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lqk2;->M()Landroidx/fragment/app/FragmentActivity;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    move-object v2, p1

    .line 36
    check-cast v2, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 37
    .line 38
    sget p1, Ly46;->warning_text:I

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lqk2;->p(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sget p1, Ly46;->dialog_autostart_request:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lqk2;->p(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    new-instance v9, Lo7;

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-direct {v9, p0, p1}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v10, Lx;

    .line 57
    .line 58
    invoke-direct {v10, p0}, Lx;-><init>(Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;)V

    .line 59
    .line 60
    .line 61
    const/16 v11, 0xf2

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x0

    .line 67
    invoke-static/range {v2 .. v11}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-object v1

    .line 71
    :pswitch_0
    iget-object v0, p0, Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;->d1:Lvz7;

    .line 72
    .line 73
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 78
    .line 79
    const-string v2, "pref_proxy_sharing_enabled"

    .line 80
    .line 81
    invoke-virtual {v0, v2, p1}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;->R(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;->T()V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lqk2;->S0:Lg94;

    .line 91
    .line 92
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v0, Lr7;

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-direct {v0, p0, v3, v2}, Lr7;-><init>(Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;Lq51;B)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x3

    .line 104
    invoke-static {p1, v3, v0, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
