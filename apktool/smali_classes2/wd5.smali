.class public final Lwd5;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lwd5;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lwd5;->i0:Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lwd5;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lwd5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lwd5;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lwd5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lwd5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lwd5;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lwd5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Lwd5;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lwd5;->i0:Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lwd5;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lwd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lwd5;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lwd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lwd5;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lc71;->X:Lc71;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lwd5;->h0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v1, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lwd5;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iget-object v2, p0, Lwd5;->i0:Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 36
    .line 37
    invoke-direct {p1, v2, v5, v0}, Lwd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;Lq51;B)V

    .line 38
    .line 39
    .line 40
    iput-boolean v4, p0, Lwd5;->h0:Z

    .line 41
    .line 42
    invoke-static {v2, p1, p0}, Lu15;->L(Ld94;Lrn2;Lq51;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v3, :cond_2

    .line 47
    .line 48
    move-object v1, v3

    .line 49
    :cond_2
    :goto_0
    return-object v1

    .line 50
    :pswitch_0
    iget-boolean v0, p0, Lwd5;->h0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    if-ne v0, v4, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v8, p0, Lwd5;->i0:Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 69
    .line 70
    invoke-virtual {v8}, Lqk2;->M()Landroidx/fragment/app/FragmentActivity;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lsu/happ/proxyutility/feature/settings/SettingsActivity;

    .line 75
    .line 76
    iget-object p1, p1, Lsu/happ/proxyutility/feature/settings/SettingsActivity;->W0:Ly5;

    .line 77
    .line 78
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lp67;

    .line 83
    .line 84
    iget-object p1, p1, Lp67;->d:Lh76;

    .line 85
    .line 86
    new-instance v0, Lo;

    .line 87
    .line 88
    const/16 v2, 0x16

    .line 89
    .line 90
    invoke-direct {v0, p1, v2}, Lo;-><init>(Lxe2;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lw51;->t(Lxe2;)Lxe2;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v6, Lyy0;

    .line 98
    .line 99
    const/4 v12, 0x4

    .line 100
    const/4 v13, 0x1

    .line 101
    const/4 v7, 0x2

    .line 102
    const-class v9, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 103
    .line 104
    const-string v10, "setStateButtonUpdate"

    .line 105
    .line 106
    const-string v11, "setStateButtonUpdate(Z)V"

    .line 107
    .line 108
    invoke-direct/range {v6 .. v13}, Lyy0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 109
    .line 110
    .line 111
    iput-boolean v4, p0, Lwd5;->h0:Z

    .line 112
    .line 113
    invoke-static {p1, v6, p0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v3, :cond_5

    .line 118
    .line 119
    move-object v1, v3

    .line 120
    :cond_5
    :goto_1
    return-object v1

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
