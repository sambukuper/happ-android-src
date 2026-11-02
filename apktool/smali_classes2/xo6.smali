.class public final Lxo6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Lep6;

.field public final synthetic i0:Ljava/lang/String;

.field public final synthetic j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lep6;Ljava/lang/String;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxo6;->h0:Lep6;

    .line 2
    .line 3
    iput-object p2, p0, Lxo6;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lxo6;->j0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lxo6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxo6;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxo6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance p2, Lxo6;

    .line 2
    .line 3
    iget-object v0, p0, Lxo6;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lxo6;->j0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lxo6;->h0:Lep6;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lxo6;-><init>(Lep6;Ljava/lang/String;Ljava/lang/String;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lxo6;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v5, p0, Lxo6;->j0:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v8, 0x4

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v9, 0x1

    .line 10
    iget-object v10, p0, Lxo6;->h0:Lep6;

    .line 11
    .line 12
    sget-object v11, Lc71;->X:Lc71;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eq v0, v9, :cond_2

    .line 17
    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    .line 22
    if-ne v0, v8, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v10}, Lep6;->e()Lmn6;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v0, 0x0

    .line 52
    new-array v0, v0, [Lfn6;

    .line 53
    .line 54
    iput-byte v9, p0, Lxo6;->g0:B

    .line 55
    .line 56
    iget-object v4, p0, Lxo6;->i0:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1, v4, v5, v0, p0}, Lmn6;->e(Ljava/lang/String;Ljava/lang/String;[Lfn6;Ls51;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v11, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    :goto_0
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 66
    .line 67
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 68
    .line 69
    if-nez v0, :cond_b

    .line 70
    .line 71
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_5
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    iput-byte v3, p0, Lxo6;->g0:B

    .line 81
    .line 82
    sget-object p1, Lwn6;->a:Lwn6;

    .line 83
    .line 84
    invoke-virtual {v10, p1, p0}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v11, :cond_c

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 92
    .line 93
    if-nez v0, :cond_a

    .line 94
    .line 95
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 101
    .line 102
    if-eqz v0, :cond_9

    .line 103
    .line 104
    invoke-virtual {v10}, Lep6;->h()V

    .line 105
    .line 106
    .line 107
    new-instance v2, Lvn6;

    .line 108
    .line 109
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 110
    .line 111
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->g()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->d()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->k()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-direct/range {v2 .. v7}, Lvn6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 128
    .line 129
    .line 130
    iput-byte v8, p0, Lxo6;->g0:B

    .line 131
    .line 132
    invoke-virtual {v10, v2, p0}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v11, :cond_8

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    :goto_1
    invoke-virtual {v10, v9}, Lep6;->j(Z)V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    invoke-static {}, Lb61;->c()V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_a
    :goto_2
    invoke-virtual {v10}, Lep6;->h()V

    .line 148
    .line 149
    .line 150
    iput-byte v2, p0, Lxo6;->g0:B

    .line 151
    .line 152
    sget-object p1, Lxn6;->a:Lxn6;

    .line 153
    .line 154
    invoke-virtual {v10, p1, p0}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne p0, v11, :cond_c

    .line 159
    .line 160
    :goto_3
    return-object v11

    .line 161
    :cond_b
    :goto_4
    invoke-virtual {v10}, Lep6;->h()V

    .line 162
    .line 163
    .line 164
    :cond_c
    :goto_5
    sget-object p0, Ldn8;->a:Ldn8;

    .line 165
    .line 166
    return-object p0
.end method
