.class public final Lsu/happ/proxyutility/service/c;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Lsu/happ/proxyutility/dto/DownloadFilesData;

.field public final synthetic i0:Lsu/happ/proxyutility/service/DownloadFilesService;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/dto/DownloadFilesData;Lsu/happ/proxyutility/service/DownloadFilesService;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/service/c;->h0:Lsu/happ/proxyutility/dto/DownloadFilesData;

    .line 2
    .line 3
    iput-object p2, p0, Lsu/happ/proxyutility/service/c;->i0:Lsu/happ/proxyutility/service/DownloadFilesService;

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
    invoke-virtual {p0, p2, p1}, Lsu/happ/proxyutility/service/c;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lsu/happ/proxyutility/service/c;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/service/c;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance p2, Lsu/happ/proxyutility/service/c;

    .line 2
    .line 3
    iget-object v0, p0, Lsu/happ/proxyutility/service/c;->h0:Lsu/happ/proxyutility/dto/DownloadFilesData;

    .line 4
    .line 5
    iget-object p0, p0, Lsu/happ/proxyutility/service/c;->i0:Lsu/happ/proxyutility/service/DownloadFilesService;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Lsu/happ/proxyutility/service/c;-><init>(Lsu/happ/proxyutility/dto/DownloadFilesData;Lsu/happ/proxyutility/service/DownloadFilesService;Lq51;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lsu/happ/proxyutility/service/c;->g0:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v3

    .line 22
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lss8;->a:Lss8;

    .line 26
    .line 27
    iget-object v4, v1, Lsu/happ/proxyutility/service/c;->h0:Lsu/happ/proxyutility/dto/DownloadFilesData;

    .line 28
    .line 29
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/DownloadFilesData;->d()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lss8;->z(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x2

    .line 39
    iget-object v7, v1, Lsu/happ/proxyutility/service/c;->i0:Lsu/happ/proxyutility/service/DownloadFilesService;

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    sget-object v0, Lsu/happ/proxyutility/service/d;->a:Lsu/happ/proxyutility/service/d;

    .line 44
    .line 45
    :try_start_0
    invoke-static {v2, v7, v3}, Lsu/happ/proxyutility/service/d;->g(ILandroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    instance-of v8, v0, Ljava/lang/InterruptedException;

    .line 51
    .line 52
    if-nez v8, :cond_3

    .line 53
    .line 54
    instance-of v8, v0, Ljava/util/concurrent/CancellationException;

    .line 55
    .line 56
    if-nez v8, :cond_3

    .line 57
    .line 58
    :goto_0
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/DownloadFilesData;->b()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/DownloadFilesData;->d()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/DownloadFilesData;->a()J

    .line 67
    .line 68
    .line 69
    move-result-wide v14

    .line 70
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/DownloadFilesData;->c()J

    .line 71
    .line 72
    .line 73
    move-result-wide v11

    .line 74
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v9, Lit1;

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    invoke-direct/range {v9 .. v16}, Lit1;-><init>(Ljava/lang/String;JLjava/lang/String;JLq51;)V

    .line 85
    .line 86
    .line 87
    new-instance v0, Lj31;

    .line 88
    .line 89
    const/4 v8, 0x7

    .line 90
    invoke-direct {v0, v9, v8}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    sget-object v9, Ltp1;->a:Lnf1;

    .line 94
    .line 95
    sget-object v9, Lye1;->Z:Lye1;

    .line 96
    .line 97
    invoke-static {v0, v9}, Lzc1;->H(Lxe2;Ls61;)Lxe2;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0, v9}, Lzc1;->H(Lxe2;Ls61;)Lxe2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v9, Lsu/happ/proxyutility/service/b;

    .line 106
    .line 107
    invoke-direct {v9, v4, v7, v3, v5}, Lsu/happ/proxyutility/service/b;-><init>(Lsu/happ/proxyutility/dto/DownloadFilesData;Lsu/happ/proxyutility/service/DownloadFilesService;Lq51;B)V

    .line 108
    .line 109
    .line 110
    new-instance v5, Lsf2;

    .line 111
    .line 112
    invoke-direct {v5, v0, v9, v6}, Lsf2;-><init>(Lxe2;Lrn2;B)V

    .line 113
    .line 114
    .line 115
    new-instance v0, Lq5;

    .line 116
    .line 117
    invoke-direct {v0, v6, v3, v8}, Lq5;-><init>(ILq51;B)V

    .line 118
    .line 119
    .line 120
    new-instance v8, Lsf2;

    .line 121
    .line 122
    invoke-direct {v8, v5, v0, v2}, Lsf2;-><init>(Lxe2;Lrn2;B)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lgx1;->Y:Lbe;

    .line 126
    .line 127
    const/16 v0, 0x12c

    .line 128
    .line 129
    sget-object v5, Llx1;->Z:Llx1;

    .line 130
    .line 131
    invoke-static {v0, v5}, Lvj8;->l0(ILlx1;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    invoke-static {v9, v10}, Lu70;->s0(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v9

    .line 139
    const-wide/16 v11, 0x0

    .line 140
    .line 141
    cmp-long v0, v9, v11

    .line 142
    .line 143
    if-lez v0, :cond_2

    .line 144
    .line 145
    new-instance v0, Lif2;

    .line 146
    .line 147
    invoke-direct {v0, v9, v10, v8, v3}, Lif2;-><init>(JLsf2;Lq51;)V

    .line 148
    .line 149
    .line 150
    new-instance v5, Lj31;

    .line 151
    .line 152
    invoke-direct {v5, v0, v6}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Lsu/happ/proxyutility/service/b;

    .line 156
    .line 157
    invoke-direct {v0, v4, v7, v3, v2}, Lsu/happ/proxyutility/service/b;-><init>(Lsu/happ/proxyutility/dto/DownloadFilesData;Lsu/happ/proxyutility/service/DownloadFilesService;Lq51;B)V

    .line 158
    .line 159
    .line 160
    iput-boolean v2, v1, Lsu/happ/proxyutility/service/c;->g0:Z

    .line 161
    .line 162
    invoke-static {v5, v0, v1}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sget-object v1, Lc71;->X:Lc71;

    .line 167
    .line 168
    if-ne v0, v1, :cond_9

    .line 169
    .line 170
    return-object v1

    .line 171
    :cond_2
    const-string v0, "Sample period should be positive"

    .line 172
    .line 173
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v3

    .line 177
    :cond_3
    throw v0

    .line 178
    :cond_4
    sget-object v0, Lsu/happ/proxyutility/service/d;->i:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_6

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    move-object v2, v1

    .line 195
    check-cast v2, Lsu/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles;

    .line 196
    .line 197
    invoke-virtual {v2}, Lsu/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles;->c()J

    .line 198
    .line 199
    .line 200
    move-result-wide v8

    .line 201
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/DownloadFilesData;->a()J

    .line 202
    .line 203
    .line 204
    move-result-wide v10

    .line 205
    cmp-long v2, v8, v10

    .line 206
    .line 207
    if-nez v2, :cond_5

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_6
    move-object v1, v3

    .line 211
    :goto_1
    check-cast v1, Lsu/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles;

    .line 212
    .line 213
    if-eqz v1, :cond_9

    .line 214
    .line 215
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->LINK_NOT_CORRECT:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles;->g(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Lsu/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles;->d()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_7

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Lhs;

    .line 239
    .line 240
    invoke-virtual {v2, v5}, Lhs;->a(Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_7
    sget-object v0, Lsu/happ/proxyutility/service/d;->a:Lsu/happ/proxyutility/service/d;

    .line 245
    .line 246
    :try_start_1
    invoke-static {v6, v7, v3}, Lsu/happ/proxyutility/service/d;->g(ILandroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :catchall_1
    move-exception v0

    .line 251
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 252
    .line 253
    if-nez v2, :cond_8

    .line 254
    .line 255
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 256
    .line 257
    if-nez v2, :cond_8

    .line 258
    .line 259
    :goto_3
    invoke-static {v7, v1}, Lsu/happ/proxyutility/service/d;->a(Landroid/content/Context;Lsu/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles;)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_8
    throw v0

    .line 264
    :cond_9
    :goto_4
    sget-object v0, Ldn8;->a:Ldn8;

    .line 265
    .line 266
    return-object v0
.end method
