.class public final Lyo6;
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
    iput-object p1, p0, Lyo6;->h0:Lep6;

    .line 2
    .line 3
    iput-object p2, p0, Lyo6;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lyo6;->j0:Ljava/lang/String;

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
    invoke-virtual {p0, p2, p1}, Lyo6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyo6;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyo6;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p2, Lyo6;

    .line 2
    .line 3
    iget-object v0, p0, Lyo6;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lyo6;->j0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lyo6;->h0:Lep6;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lyo6;-><init>(Lep6;Ljava/lang/String;Ljava/lang/String;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lyo6;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v4, p0, Lyo6;->j0:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v8, 0x4

    .line 7
    const/4 v9, 0x3

    .line 8
    const/4 v10, 0x2

    .line 9
    const/4 v11, 0x1

    .line 10
    iget-object v12, p0, Lyo6;->h0:Lep6;

    .line 11
    .line 12
    sget-object v13, Lc71;->X:Lc71;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eq v0, v11, :cond_2

    .line 17
    .line 18
    if-eq v0, v10, :cond_1

    .line 19
    .line 20
    if-eq v0, v9, :cond_1

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
    goto/16 :goto_4

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
    invoke-virtual {v12}, Lep6;->e()Lmn6;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 p1, 0x0

    .line 52
    new-array v5, p1, [Lfn6;

    .line 53
    .line 54
    iput-byte v11, p0, Lyo6;->g0:B

    .line 55
    .line 56
    sget-object p1, Lmn6;->j:Lvz7;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    iget-object v3, p0, Lyo6;->i0:Ljava/lang/String;

    .line 60
    .line 61
    move-object v7, p0

    .line 62
    invoke-virtual/range {v2 .. v7}, Lmn6;->t(Ljava/lang/String;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v13, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_0
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 70
    .line 71
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 72
    .line 73
    if-nez v0, :cond_b

    .line 74
    .line 75
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;

    .line 81
    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    iput-byte v10, p0, Lyo6;->g0:B

    .line 85
    .line 86
    sget-object p1, Lwn6;->a:Lwn6;

    .line 87
    .line 88
    invoke-virtual {v12, p1, p0}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v13, :cond_b

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 96
    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_7
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 105
    .line 106
    if-eqz v0, :cond_9

    .line 107
    .line 108
    new-instance v2, Lvn6;

    .line 109
    .line 110
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 111
    .line 112
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    move-object v5, v4

    .line 117
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->g()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->d()Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->k()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-direct/range {v2 .. v7}, Lvn6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    iput-byte v8, p0, Lyo6;->g0:B

    .line 133
    .line 134
    invoke-virtual {v12, v2, p0}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-ne p0, v13, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    :goto_1
    invoke-virtual {v12, v11}, Lep6;->j(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    invoke-static {}, Lb61;->c()V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_a
    :goto_2
    iput-byte v9, p0, Lyo6;->g0:B

    .line 150
    .line 151
    sget-object p1, Lxn6;->a:Lxn6;

    .line 152
    .line 153
    invoke-virtual {v12, p1, p0}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-ne p0, v13, :cond_b

    .line 158
    .line 159
    :goto_3
    return-object v13

    .line 160
    :cond_b
    :goto_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 161
    .line 162
    return-object p0
.end method
