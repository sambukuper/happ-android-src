.class public final Ljo4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

.field public final synthetic i0:Ljava/lang/String;

.field public final synthetic j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lq51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainViewModel;)V
    .locals 0

    .line 1
    iput-object p4, p0, Ljo4;->h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Ljo4;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Ljo4;->j0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

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
    invoke-virtual {p0, p2, p1}, Ljo4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljo4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljo4;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p2, Ljo4;

    .line 2
    .line 3
    iget-object v0, p0, Ljo4;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Ljo4;->j0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ljo4;->h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 8
    .line 9
    invoke-direct {p2, p1, v0, v1, p0}, Ljo4;-><init>(Lq51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainViewModel;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, Ljo4;->g0:B

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    iget-object v2, v5, Ljo4;->j0:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v13, 0x5

    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x3

    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v14, 0x1

    .line 13
    iget-object v15, v5, Ljo4;->h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 14
    .line 15
    sget-object v10, Lc71;->X:Lc71;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eq v0, v14, :cond_2

    .line 20
    .line 21
    if-eq v0, v9, :cond_1

    .line 22
    .line 23
    if-eq v0, v8, :cond_1

    .line 24
    .line 25
    if-eq v0, v7, :cond_1

    .line 26
    .line 27
    if-ne v0, v13, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v6

    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v0, p1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v15, Lsu/happ/proxyutility/feature/main/MainViewModel;->l:Lvz7;

    .line 55
    .line 56
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lmn6;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    new-array v3, v1, [Lfn6;

    .line 64
    .line 65
    iput-byte v14, v5, Ljo4;->g0:B

    .line 66
    .line 67
    sget-object v1, Lmn6;->j:Lvz7;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    iget-object v1, v5, Ljo4;->i0:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual/range {v0 .. v5}, Lmn6;->t(Ljava/lang/String;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v10, :cond_4

    .line 77
    .line 78
    :goto_0
    move-object v0, v10

    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_4
    :goto_1
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 82
    .line 83
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 84
    .line 85
    if-nez v1, :cond_5

    .line 86
    .line 87
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    :cond_5
    move-object v0, v10

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;

    .line 94
    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    iput-byte v8, v5, Ljo4;->g0:B

    .line 98
    .line 99
    sget-object v0, Lcn4;->a:Lcn4;

    .line 100
    .line 101
    invoke-virtual {v15, v0, v5}, Lsu/happ/proxyutility/feature/main/MainViewModel;->z(Lkn4;Ls51;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v10, :cond_c

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 109
    .line 110
    if-nez v1, :cond_8

    .line 111
    .line 112
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 113
    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    :cond_8
    move-object v0, v10

    .line 117
    goto :goto_3

    .line 118
    :cond_9
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 119
    .line 120
    if-eqz v1, :cond_b

    .line 121
    .line 122
    new-instance v7, Lbn4;

    .line 123
    .line 124
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 125
    .line 126
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->g()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->d()Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->k()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    move-object v11, v10

    .line 143
    move-object v10, v0

    .line 144
    move-object v0, v11

    .line 145
    move-object v11, v2

    .line 146
    invoke-direct/range {v7 .. v12}, Lbn4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    iput-byte v13, v5, Ljo4;->g0:B

    .line 150
    .line 151
    invoke-virtual {v15, v7, v5}, Lsu/happ/proxyutility/feature/main/MainViewModel;->z(Lkn4;Ls51;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-ne v1, v0, :cond_a

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_a
    :goto_2
    invoke-virtual {v15, v14}, Lsu/happ/proxyutility/feature/main/MainViewModel;->x(Z)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_b
    invoke-static {}, Lb61;->c()V

    .line 163
    .line 164
    .line 165
    return-object v6

    .line 166
    :goto_3
    iput-byte v7, v5, Ljo4;->g0:B

    .line 167
    .line 168
    sget-object v1, Ldn4;->a:Ldn4;

    .line 169
    .line 170
    invoke-virtual {v15, v1, v5}, Lsu/happ/proxyutility/feature/main/MainViewModel;->z(Lkn4;Ls51;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-ne v1, v0, :cond_c

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :goto_4
    iput-byte v9, v5, Ljo4;->g0:B

    .line 178
    .line 179
    sget-object v1, Len4;->a:Len4;

    .line 180
    .line 181
    invoke-virtual {v15, v1, v5}, Lsu/happ/proxyutility/feature/main/MainViewModel;->z(Lkn4;Ls51;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-ne v1, v0, :cond_c

    .line 186
    .line 187
    :goto_5
    return-object v0

    .line 188
    :cond_c
    :goto_6
    sget-object v0, Ldn8;->a:Ldn8;

    .line 189
    .line 190
    return-object v0
.end method
