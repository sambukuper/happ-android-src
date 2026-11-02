.class public final Ldp7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lnp7;

.field public final synthetic j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnp7;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldp7;->i0:Lnp7;

    .line 2
    .line 3
    iput-object p2, p0, Ldp7;->j0:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Ldp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldp7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Ldp7;

    .line 2
    .line 3
    iget-object v1, p0, Ldp7;->i0:Lnp7;

    .line 4
    .line 5
    iget-object p0, p0, Ldp7;->j0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Ldp7;-><init>(Lnp7;Ljava/lang/String;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Ldp7;->h0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v6, v5, Ldp7;->i0:Lnp7;

    .line 4
    .line 5
    iget-object v7, v6, Lnp7;->f:Lh76;

    .line 6
    .line 7
    iget-object v0, v5, Ldp7;->h0:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v8, v0

    .line 10
    check-cast v8, Lb71;

    .line 11
    .line 12
    iget-byte v0, v5, Ldp7;->g0:B

    .line 13
    .line 14
    const/4 v9, 0x5

    .line 15
    const/4 v10, 0x4

    .line 16
    const/4 v11, 0x3

    .line 17
    const/4 v12, 0x2

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v13, 0x0

    .line 20
    sget-object v14, Lc71;->X:Lc71;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    if-eq v0, v12, :cond_1

    .line 27
    .line 28
    if-eq v0, v11, :cond_1

    .line 29
    .line 30
    if-eq v0, v10, :cond_1

    .line 31
    .line 32
    if-ne v0, v9, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v13

    .line 41
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object/from16 v0, p1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Lnp7;->f()Lmn6;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v2, v7, Lh76;->X:Loh7;

    .line 60
    .line 61
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lqn7;

    .line 66
    .line 67
    iget-object v2, v2, Lqn7;->a:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v6, Lnp7;->d:Lfn6;

    .line 70
    .line 71
    filled-new-array {v3}, [Lfn6;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iput-object v8, v5, Ldp7;->h0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-byte v1, v5, Ldp7;->g0:B

    .line 78
    .line 79
    sget-object v1, Lmn6;->j:Lvz7;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    iget-object v1, v5, Ldp7;->j0:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual/range {v0 .. v5}, Lmn6;->t(Ljava/lang/String;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-ne v0, v14, :cond_4

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_4
    :goto_1
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 93
    .line 94
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 95
    .line 96
    if-nez v1, :cond_a

    .line 97
    .line 98
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    iput-object v13, v5, Ldp7;->h0:Ljava/lang/Object;

    .line 108
    .line 109
    iput-byte v11, v5, Ldp7;->g0:B

    .line 110
    .line 111
    sget-object v0, Lun7;->a:Lun7;

    .line 112
    .line 113
    invoke-virtual {v6, v0, v5}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-ne v0, v14, :cond_b

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 121
    .line 122
    if-nez v1, :cond_9

    .line 123
    .line 124
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 125
    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 130
    .line 131
    if-eqz v1, :cond_8

    .line 132
    .line 133
    new-instance v15, Ltn7;

    .line 134
    .line 135
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 136
    .line 137
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->g()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v17

    .line 145
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->d()Z

    .line 146
    .line 147
    .line 148
    move-result v20

    .line 149
    iget-object v1, v7, Lh76;->X:Loh7;

    .line 150
    .line 151
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Lqn7;

    .line 156
    .line 157
    iget-object v1, v1, Lqn7;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->k()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v19

    .line 163
    move-object/from16 v18, v1

    .line 164
    .line 165
    invoke-direct/range {v15 .. v20}, Ltn7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 166
    .line 167
    .line 168
    iput-object v13, v5, Ldp7;->h0:Ljava/lang/Object;

    .line 169
    .line 170
    iput-byte v9, v5, Ldp7;->g0:B

    .line 171
    .line 172
    invoke-virtual {v6, v15, v5}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v14, :cond_b

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    invoke-static {}, Lb61;->c()V

    .line 180
    .line 181
    .line 182
    return-object v13

    .line 183
    :cond_9
    :goto_2
    iput-object v13, v5, Ldp7;->h0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-byte v10, v5, Ldp7;->g0:B

    .line 186
    .line 187
    sget-object v0, Lvn7;->a:Lvn7;

    .line 188
    .line 189
    invoke-virtual {v6, v0, v5}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-ne v0, v14, :cond_b

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_a
    :goto_3
    iput-object v13, v5, Ldp7;->h0:Ljava/lang/Object;

    .line 197
    .line 198
    iput-byte v12, v5, Ldp7;->g0:B

    .line 199
    .line 200
    invoke-virtual {v6, v8, v5}, Lnp7;->j(Lb71;Ls51;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-ne v0, v14, :cond_b

    .line 205
    .line 206
    :goto_4
    return-object v14

    .line 207
    :cond_b
    :goto_5
    sget-object v0, Ldn8;->a:Ldn8;

    .line 208
    .line 209
    return-object v0
.end method
