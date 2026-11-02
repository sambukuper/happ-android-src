.class public final Lfp7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public final synthetic h0:Lnp7;

.field public final synthetic i0:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnp7;Ljava/lang/String;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lfp7;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lfp7;->h0:Lnp7;

    .line 4
    .line 5
    iput-object p2, p0, Lfp7;->i0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lfp7;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lfp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lfp7;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lfp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lfp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lfp7;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lfp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lfp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lfp7;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lfp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Lfp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lfp7;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lfp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte p2, p0, Lfp7;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lfp7;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lfp7;->h0:Lnp7;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Lfp7;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {p2, p0, v0, p1, v1}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lfp7;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {p2, p0, v0, p1, v1}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :pswitch_1
    new-instance p2, Lfp7;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {p2, p0, v0, p1, v1}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :pswitch_2
    new-instance p2, Lfp7;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {p2, p0, v0, p1, v1}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lfp7;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lfp7;->h0:Lnp7;

    .line 5
    .line 6
    iget-object v3, p0, Lfp7;->i0:Ljava/lang/String;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lnp7;->f()Lmn6;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0, v3, v1}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    new-instance p1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    return-object p1

    .line 32
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lnp7;->f()Lmn6;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v3}, Lmn6;->q(Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lnp7;->e(Ljava/lang/String;)Lj2;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p1, Lkw4;->a:Lkw4;

    .line 56
    .line 57
    invoke-static {}, Li21;->r()Lgb4;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {}, Lkw4;->m()Lcom/tencent/mmkv/MMKV;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/tencent/mmkv/MMKV;->a()[Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v2, 0x0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    new-array v0, v2, [Ljava/lang/String;

    .line 73
    .line 74
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 75
    .line 76
    array-length v5, v0

    .line 77
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    array-length v5, v0

    .line 81
    move v6, v2

    .line 82
    :goto_1
    if-ge v6, v5, :cond_2

    .line 83
    .line 84
    aget-object v7, v0, v6

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v8, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 90
    .line 91
    invoke-direct {v8, v7}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {p1, v4}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 101
    .line 102
    .line 103
    sget-object v0, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v4, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 113
    .line 114
    invoke-direct {v4, v0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v4}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Li21;->j(Lgb4;)Lgb4;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v0, Lgw4;

    .line 129
    .line 130
    const/4 v4, 0x3

    .line 131
    invoke-direct {v0, v3, v4}, Lgw4;-><init>(Ljava/lang/String;B)V

    .line 132
    .line 133
    .line 134
    new-instance v3, Lla2;

    .line 135
    .line 136
    invoke-direct {v3, p1, v1, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 137
    .line 138
    .line 139
    new-instance v4, Lal5;

    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    const/16 v11, 0x11

    .line 143
    .line 144
    const/4 v5, 0x1

    .line 145
    iget-object v6, p0, Lfp7;->h0:Lnp7;

    .line 146
    .line 147
    const-class v7, Lnp7;

    .line 148
    .line 149
    const-string v8, "fetchProfiles"

    .line 150
    .line 151
    const-string v9, "fetchProfiles-PzuDCJM(Ljava/lang/String;)Lkotlinx/collections/immutable/PersistentList;"

    .line 152
    .line 153
    invoke-direct/range {v4 .. v11}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 154
    .line 155
    .line 156
    new-instance p0, Lsd2;

    .line 157
    .line 158
    sget-object p1, Lz27;->X:Lz27;

    .line 159
    .line 160
    invoke-direct {p0, v3, v4, p1}, Lsd2;-><init>(Lu27;Lgn2;Lgn2;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Lrd2;

    .line 164
    .line 165
    invoke-direct {p1, p0}, Lrd2;-><init>(Lsd2;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    invoke-virtual {p1}, Lrd2;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-eqz p0, :cond_4

    .line 173
    .line 174
    invoke-virtual {p1}, Lrd2;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, Lum6;

    .line 179
    .line 180
    iget-boolean p0, p0, Lum6;->b:Z

    .line 181
    .line 182
    if-nez p0, :cond_3

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_4
    move v1, v2

    .line 186
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
